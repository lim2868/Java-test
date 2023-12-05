package stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {

	public static void main(String[] args) {
		
		try(FileOutputStream fos = new FileOutputStream("output1.txt")){
			byte[] bs = new byte[26];
			byte data = 65;
//			for(int i = 0; i<bs.length; i++) {
//				bs[i]= data;
//				data++;
//			}
//			fos.write(bs,2,10);
			fos.write(65);
			fos.write(66);
			fos.write(67);
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력이 완료되었습니다.");
	}
}