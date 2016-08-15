package com.tiy.ssa.weekthree;

import java.util.HashMap;
import java.util.Map;

public class GetorDefault<K, V> {
	
	final Map<K, V> hello = new HashMap<>();

	public V getOrDefault(K key, V value){
		
		V retValue;
		if((retValue = this.hello.get(key)) != null){
			return retValue;
		}
		return value;
	}
	
	void add(String k, Integer v){
		
	}
}
