package main;

import java.util.Arrays;
import java.util.Scanner;

public class IntNiza {
	public static void main(String[] args) {
		
		int y[] = {53,32,19,79,25,5,47};
		
		Integer min = y[0];
		Integer max = y[0];
		
		for(int x=0 ; x<y.length ; x++){
			
			if (max < y[x])
				max = y[x];
			
			if (min > y[x])
				min = y[x];
		}
		
		System.out.println("Najgolem broj e: " + max);
		System.out.println("Najmal broj e: " + min);
	}
}
