package tekSystems;

import java.io.*;

public class FileClass {

	public static void main(String[] args) throws IOException {
		String f = "file1.java";
		File f1 = new File(f);
		
//		Reader iout = new FileReader(f1);
//		RandomAccessFile rf = new RandomAccess
//		InputStream io = new FileInputStream(f1);
		FileOutputStream io = new FileOutputStream(f1);
		
		try {
			int i = 10/0;
		}
		finally {
			System.out.println("re");
		}
	}

}
