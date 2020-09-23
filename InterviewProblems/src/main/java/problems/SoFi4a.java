package main.java.problems;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SoFi4a {
	private BigDecimal value;

	public SoFi4a() {
	};

	public SoFi4a(BigDecimal value) {
		this.value = value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	public void setValue(String value) {
		this.value = new BigDecimal(value);
	}

	public BigDecimal getDollars() {
		return value.setScale(0, RoundingMode.FLOOR);
	}

	public BigDecimal getCents() {
		return value.subtract(getDollars());
	}

	public SoFi4a multiplyBy(BigDecimal value1) {
		return new SoFi4a(value.multiply(value1).setScale(2, RoundingMode.HALF_UP));
	}

	public String toString() {
		return value.toString();
	}
	
	public static void main(String[] args) {
		SoFi4a sf = new SoFi4a(new BigDecimal(111.2345));
		sf.setValue("100.1234");
		System.out.println(sf.getCents());
		System.out.println(sf.getDollars());
		System.out.println(sf.multiplyBy(new BigDecimal(10.1)));
	}
}
