import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class test2 {

	public static void main(String[] args) throws Exception {
		FileInputStream in = null;    
		FileOutputStream out = null; 
		try {
		in = new FileInputStream("/Users/apple/Desktop/数据结构input,output/input.txt");
		out = new FileOutputStream("/Users/apple/Desktop/数据结构input,output/output.txt");
		Integer by;
		while((by=in.read())!=-1) {
			out.write(by);
		}
		}
		finally {
			in.close();
			out.close();
		}
		
	}

}
