package serializationexample;

import java.io.Serializable;

public class SerializableObjectExample implements Serializable {

	private static final long serialVersionUID = 242619189104398598L;
	transient int a;
	static int b;
	String name;
	int age;

	// Default constructor
	public SerializableObjectExample(String name, int age, int a, int b) {
		this.name = name;
		this.age = age;
		this.a = a;
		SerializableObjectExample.b = b;
	}

}