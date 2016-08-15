package com.tiy.ssa.weektwo.assignmentfour;

import java.math.BigInteger;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CacheFactorial {

	static final Map<Integer, BigInteger> cache = new ConcurrentHashMap<>();

	private CacheFactorial(){

	}


	static final BigInteger factorialRecursively(int limit) {


		BigInteger result = BigInteger.ONE;
		BigInteger newLimit = BigInteger.valueOf(limit);

		while (!newLimit.equals(BigInteger.ZERO)) {
			result = result.multiply(newLimit);
			cache.put(limit, result);
			newLimit = newLimit.subtract(BigInteger.ONE);
		}

		return result;
	}
}

