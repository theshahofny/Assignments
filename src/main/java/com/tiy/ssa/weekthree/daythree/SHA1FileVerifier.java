package com.tiy.ssa.weekthree.daythree;


import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;



public class SHA1FileVerifier extends Hexer{

	File file;
	final MessageDigest sha1;
	
	public SHA1FileVerifier() throws IllegalArgumentException{
		try{
			this.sha1 = MessageDigest.getInstance("SHA-1");
		}
		catch(NoSuchAlgorithmException ex){
			throw new IllegalArgumentException("SHA-1 is not a valid cypher");
			
		}
		
	}
	public String Hash(File file) throws FileNotF


		byte[] bytes = new byte[1_024];
		try (BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(file)))
		{
			int read;
			while ((read = inputStream.read(bytes)) > 0)
			{
				this.sha1.update(bytes, 0, read);
			}
			byte[] digest = this.sha1.digest();
			return toHex(digest);
		}
		catch(Exception ex){

		}
		return "";
	}


}

