package org.bcits.second;

import java.util.Scanner;

public class Program7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String words[] = str.split(" ");
		String resString = "";

		for(int i=0; i<words.length; i++) {

			String word = words[i];
			String resWord = "";
			if(i%2!=0) {
				resWord += word;
			}
			else if(i==0) {
				resWord += words[words.length-1];
			}
			else {
				resWord += words[i-2];
			}
			resString = resString + resWord + " ";
		}
		System.out.println(resString);
	}
}
