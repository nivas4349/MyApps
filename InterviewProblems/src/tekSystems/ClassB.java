package tekSystems;

class ClassB {

	public static void main(String[] args) {
		try {
			int i = 10 / 0;
		} catch (Exception e) {
			throw e;
		}
	}
	
	void math() {
		throw new RuntimeException();
	}

}
