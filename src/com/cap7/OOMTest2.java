package com.cap7;

import java.util.ArrayList;
import java.util.List;

public class OOMTest2 {
	
	public static void main(String[] args) {
		List<byte[]> list=new ArrayList<>();
		for(int i=0;i<1024;i++) {
			list.add(new byte[1024*1024]);
			System.out.println("add data"+(i+1));
		}
	}

}
