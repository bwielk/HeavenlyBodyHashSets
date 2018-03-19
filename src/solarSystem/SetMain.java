package solarSystem;

import java.util.*;

public class SetMain {
	public static void main(String[] args){
		Set<Integer> squares = new HashSet<>();
		Set<Integer> cubes = new HashSet<>();
		
		for(int i=1; i<=100; i++){
			squares.add(i*i);
			cubes.add(i*i*i);
		}
		
		System.out.println("There are " + squares.size() + " squares and " + cubes.size() + " cubes.");
		
		//union
		Set<Integer> union = new HashSet<>(squares);
		union.addAll(cubes);
		System.out.println("union Set contains " + union.size() + " elements");//196 elements
		//intersection
		Set<Integer> intersection = new HashSet<>(squares);
		intersection.retainAll(cubes);
		System.out.println("intersection Set contains " + intersection.size() + " elements");//4 elements
		for(int i : intersection){
			System.out.println("\t" + i + " is the square of " + Math.sqrt(i) + " and the cube of " + Math.cbrt(i));
		}
	}
}
