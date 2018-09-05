package com.cap3;

import java.util.ArrayList;
import java.util.List;

public class DumpOOM {
	
	public static void main(String[] args) {
		List list=new ArrayList<>();
		for(int i=0;i<25;i++) {
			list.add(new byte[1024*1024]);
		}
	}
}
