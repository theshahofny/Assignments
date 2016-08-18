package com.tiy.ssa.weekthree.daythree;

public abstract class Hexer {
	
	protected String toHex(byte[] digest) {
		String returnstring = "";
		for(int i = 0 ; i < digest.length ; i++){
			Integer.toHexString(digest[i]);
		}
		return null;
	}
}
