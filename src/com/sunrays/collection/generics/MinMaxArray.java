package com.sunrays.collection.generics;

/**
 * Class implements Generic Interface MinMaxInt.
 * 
 * @param <T> Class type must implement Comparable interface
 * 
 * @author SUNRAYS Developer
 * @URL : www.sunrays.co.in
 * 
 * Copyright (c) sunRays Technologies. All rights reserved.
 */
public class MinMaxArray<T extends Comparable<T>> implements MinMaxInt<T> {

	T[] vals = null;

	public MinMaxArray(T[] vals) {
		this.vals = vals;
	}

	/**
	 * Returns minimum element from an array.
	 */
	public T min() {
		T v = vals[0];
		for (int i = 1; i < vals.length; i++)
			if (vals[i].compareTo(v) < 0)
				v = vals[i];
		return v;
	}

	/**
	 * Returns maximum element from an array.
	 */
	public T max() {
		T v = vals[0];
		for (int i = 1; i < vals.length; i++)
			if (vals[i].compareTo(v) > 0)
				v = vals[i];
		return v;
	}

}
