package com.siva.cricketcards.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

import javax.validation.constraints.NotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.siva.cricketcards.client.ISourceDataClient;
import com.siva.cricketcards.dto.PlayerStats;
import com.siva.cricketcards.dto.SourceDataRequest;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = RANDOM_PORT)
public class CricketcardsEndToEndTest {

	private static final String TEXT_PLAIN_VALUE_UTF8_VALUE = "text/plain; charset=UTF-8";
	private static final String URI = "http://analytics05.cricket.net/xquery/espn/player";
	// TODO : Create and use enums for format and Type
	private static final String PLAYER_SUMMARY = "player-summary";
	private static final String ODI_FORMAT = "odi";
	private static final int PLAYER_ID = 1934;
	
	SourceDataRequest sdr = new SourceDataRequest(PLAYER_SUMMARY, ODI_FORMAT, PLAYER_ID);

	@Autowired
	private TestRestTemplate restTemplate;
	
	@Autowired
	ISourceDataClient sourceDataClient;

	@Test
	public void contextLoads() {
	}

	@Test
	public void shouldGetPlayerStatsDirectlyFromSourceByAvailablePlayerId() {
		ResponseEntity<String> responseEntity = restTemplate.postForEntity(URI, getHttpEntity(sdr), String.class);

		assertNotNull(responseEntity);
		assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
		assertNotNull(responseEntity.getBody());
		assertEquals(TEXT_PLAIN_VALUE_UTF8_VALUE, responseEntity.getHeaders().get(HttpHeaders.CONTENT_TYPE).get(0));
	}
	
	@Test
	public void shouldGetPlayerStatsFromSourceClientByAvailablePlayerId() {
		PlayerStats playerStats = sourceDataClient.getPlayerStats(sdr);

		assertNotNull(playerStats);
//		assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
//		assertNotNull(responseEntity.getBody());
//		assertEquals(TEXT_PLAIN_VALUE_UTF8_VALUE, responseEntity.getHeaders().get(HttpHeaders.CONTENT_TYPE).get(0));
	}
	

	@NotNull
	private HttpEntity<?> getHttpEntity() {
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_UTF8_VALUE);
		httpHeaders.add(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_UTF8_VALUE);

		return new HttpEntity<>(httpHeaders);
	}

	@NotNull
	private HttpEntity<SourceDataRequest> getHttpEntity(SourceDataRequest sourceDataRequest) {
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_UTF8_VALUE);
		httpHeaders.add(HttpHeaders.ACCEPT, MediaType.TEXT_PLAIN_VALUE);

		return new HttpEntity<>(sourceDataRequest, httpHeaders);
	}

}
