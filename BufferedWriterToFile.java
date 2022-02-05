import java.io.*;
public class BufferedWriterToFile {
	static BufferedWriter out = null;
	public static void main(String[] args) {
		try {
			out = new BufferedWriter(new FileWriter(args[0]));
			out.write("Test FileWriter and BuffereWriter");
		} catch (EOFException e1) {
			System.out.println("End of stream");
		} catch (IOException e2) {
			System.out.println(e2.getMessage());
		} catch (ArrayIndexOutOfBoundsException e3) {
			System.out.println("Please input filename");
		} finally {
			try {
				if (out != null) out.close();
			} catch (IOException e4) {
				System.out.println("Cannot close BufferedWriter");
			}
		}
	}
}
