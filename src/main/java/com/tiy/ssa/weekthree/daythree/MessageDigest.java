package com.tiy.ssa.weekthree.daythree;

import java.security.DigestException;

public abstract class MessageDigest {

	MessageDigest md = MessageDigest.getInstance("SHA");

	 try {
	     md.update(toChapter1);
	     MessageDigest tc1 = md.clone();
	     byte[] toChapter1Digest = tc1.digest();
	     md.update(toChapter2);
	     ...etc.
	 } catch (CloneNotSupportedException cnse) {
	     throw new DigestException("couldn't make digest of partial content");
	 }
}
