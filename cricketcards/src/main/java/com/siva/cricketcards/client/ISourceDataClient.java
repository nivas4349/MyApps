package com.siva.cricketcards.client;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.siva.cricketcards.client.config.RetryClientConfiguration;
import com.siva.cricketcards.dto.PlayerStats;
import com.siva.cricketcards.dto.SourceDataRequest;

/**
 * @author: Siva Srinivasa Pasam
 *
 */
@FeignClient(url = "${datasource.api.url}", name = "ISourceDataClient" , configuration = RetryClientConfiguration.class)
public interface ISourceDataClient {

	@PostMapping(/*headers = {
			"apiKey=${reprice.api.apiKey}" }, */consumes = APPLICATION_JSON_UTF8_VALUE, produces = APPLICATION_JSON_UTF8_VALUE)
	PlayerStats getPlayerStats(@RequestBody SourceDataRequest sourceDataRequest);

}