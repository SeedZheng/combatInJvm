package com.cap5;

import java.util.HashMap;
import java.util.Map;

public class MaxTenuringThreshold {
	public static final int _1M=1024*1024;
	public static final int _1K=1024;
	public static void main(String[] args) {
		
		Map<Integer, byte[]> map=new HashMap<>();
		for(int i=0;i<5*_1K;i++) {
			byte[] b=new byte[_1K];
			map.put(i, b);
		}
		
		for(int i=0;i<17;i++) {
			for(int j=0;j<270;j++) {
				byte[] b=new byte[_1M];
			}
		}
		
	}

}
