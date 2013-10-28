package com.sunrays.collection.generics;

/**
 * Generic interface
 *
 * @param <T> Class type must implement Comparable interface.
 * 
 * @author SUNRAYS Developer
 * @URL : www.sunrays.co.in
 * 
 * Copyright (c) sunRays Technologies. All rights reserved.
 * 
 */
public interface MinMaxInt<T extends Comparable<T>> {
	T min();
	T max();
}
 