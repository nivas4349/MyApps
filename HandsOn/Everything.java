
public class Everything {
	int x;

	Everything() {
		x = 0;
	}

	Everything(String str) {
		x = Integer.parseInt(str);
	}

	Everything(int i) {
		x = i;
	}

	public static void main(String[] args) {
		Everything e = new Everything(1);
		Everything e1 = new Everything(3);

		System.out.println(e == e1);
		System.out.println(e.customEquals(e1));
		System.out.println(e.customEquals(e));
		System.out.println(e1.equals(e));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		return result;
	}

	public boolean customEquals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Everything e = (Everything) obj;
		if (x != e.x)
			return false;
		return true;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Everything other = (Everything) obj;
		if (x != other.x)
			return false;
		return true;
	}

}
