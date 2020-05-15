package day01;

import org.omg.CORBA_2_3.portable.OutputStream;

public class day01 {
	public static void main(String[] args) {
		int num=1;
		int n=0;
		int result=0;
		for (int i = 1; i <5 ; i++) {
			n=n*10+num;
			result+=n;
		}
			
	System.out.println(result);
}
}

