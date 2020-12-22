import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class tesr1 {
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedInputStream bufferedInputStream=new BufferedInputStream(new FileInputStream("/Users/apple/Desktop/数据结构input,output/input.txt"));
		BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("/Users/apple/Desktop/数据结构input,output/output.txt"));
		byte[] buff=new byte[1024];
		Integer lenInteger=0;
		while((lenInteger=bufferedInputStream.read(buff))!=-1) {
			bufferedOutputStream.write(buff,0,lenInteger);
		}
		bufferedInputStream.close();
		bufferedOutputStream.close();
	}

}
