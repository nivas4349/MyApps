package main.java.siva;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author: Siva Srinivasa Pasam
 * Jun 12, 2020
 *
 */
public class DataTypesInJava {

	public static void main(String[] args) {

		int in = Integer.MAX_VALUE;
		int in1 = Integer.MIN_VALUE;
		int inp =  0x7fffffff;
		int inp1 =  0x7ffffeee;
		boolean b = new Boolean("true").booleanValue();
		AtomicInteger at = new AtomicInteger();
		BigInteger bi = new BigInteger("123134523141231241231345231412312412313452314123124123134523141231241231345231412312412313452314123124");
		BigDecimal bd = new BigDecimal("123134523141231241231345231412312412313452314123124123134523141231241231345231412312412313452314123124.12313452314123124");
	}

}
