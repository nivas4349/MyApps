package tekSystems;

public class Inc {

	public static void main(String[] args) {
		/*int a = 0, b = 0;
		b = a + 1;
		System.out.println(a + ":" + b);
		b = a++;
		System.out.println(a + ":" + b);
		b = ++a;
		System.out.println(a + ":" + b);*/
		
		Integer i = new Integer(1);
		Integer j = i;
		i+=1;
		System.out.println(i);
		System.out.println(j);
	}

}
