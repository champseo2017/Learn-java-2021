import java.io.*;
import java.util.*;
public class ReadIntFromFile {
	static BufferedReader in = null;
	public static void main(String[] args) {
		try {
			in = new BufferedReader(new FileReader(args[0]));
			String s;
			StringTokenizer strtk;
			// ประกาศตัวแปรออบเจ็ค strtk ให้เป็นชนิดของคลาส StringTokenizer
			// คลาส StringTokenizer ใช้สำหรับแยกสตริงออกจากกัน เช่น "Hello World"
			// แยกออกมาได้ เช่น "Hello" และ "World"
			int i;
			while ((s = in.readLine()) != null) {
				strtk = new StringTokenizer(s);
				while (strtk.hasMoreTokens()) {
					i = Integer.parseInt(strtk.nextToken());
					System.out.println("Read integer " + i + 
					" from file");
				}
			}
		} catch (EOFException e) {
			System.out.println("End of stream");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e3) {
			System.out.println("Please input filename");
		} finally {
			try {
				if (in != null) in.close();
			} catch (IOException e4) {
				System.out.println("Cannot close BufferedReader");
			}
		}
	}
}
