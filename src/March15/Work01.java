package March15;

import java.io.IOException;

public class Work01 {
public static void main(String[]args) throws IOException  {
	
	int data ;
	while(true) {
		data = System.in.read();
		byte [] input = new byte[System.in.available()+1];
		input[0]= (byte) data;
		System.in.read(input,1,input.length-1);
		System.out.println(new String(input));
	
	}
	
}
}
