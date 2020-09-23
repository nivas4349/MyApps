package main.java.problems;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SoFi4 {
	BigDecimal value;

	SoFi4(BigDecimal value) {
		this.value = value;
	}

	void setValue(BigDecimal value) {
		this.value = value;
	}

	void setValue(String value) {
		this.value = new BigDecimal(value);
	}

	BigDecimal getDollars() {
		return value.setScale(0, RoundingMode.FLOOR);
	}

	BigDecimal getCents() {
		return value.subtract(getDollars());
	}

	SoFi4 multiplyBy(BigDecimal value) {
		return new SoFi4(value.multiply(value).setScale(2, RoundingMode.HALF_UP));
	}

	public static void main(String[] args) {
		SoFi4 sf = new SoFi4(new BigDecimal(111.2345));
		sf.setValue("100.1234");
		System.out.println(sf.getCents());
		System.out.println(sf.getDollars());
		System.out.println(sf.multiplyBy(new BigDecimal(10.1)));
	}
}
