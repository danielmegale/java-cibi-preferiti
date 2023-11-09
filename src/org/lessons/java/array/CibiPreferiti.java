package org.lessons.java.array;

import java.util.Scanner;

public class CibiPreferiti {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		//Inizializzo l'array
		String[] foods = {"pizza","hamburger","pasta","lasagna","patatine","pesce","costine"};
		
		//Stampo in console la lunghezza dell'array
		System.out.println(foods.length);
		
		//Stampo in console il primo elemento dell'array
		System.out.println(foods[0]);
		
		//Stampo in console l'elemtento mediano dell'array
		String midElement = foods[foods.length/2];
		System.out.println(midElement);
		
		//Stampo in console l'ultimo elemento dell'array
		System.out.println(foods[foods.length-1]);
		
		in.close();
	}
}