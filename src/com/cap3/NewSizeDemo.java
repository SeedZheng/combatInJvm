package com.cap3;

public class NewSizeDemo {
	
	public static void main(String[] args) {
		byte[] b=null;
		for(int i=0;i<10;i++) {
			b=new byte[1024*1024];
			System.out.println("执行"+(i+1)+"次");
		}
	}

}
