package org.bcits.second;

import java.util.Scanner;

public class Program6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String words[] = str.split(" ");
		String revString = "";

		for(int i=0; i<words.length; i++) {

			String word = words[i];
			String revWord = "";
			if(i!=0 && i%2!=0) {
				for(int j=0; j<word.length(); j++) {
					revWord = revWord + word.charAt(j);
				}
			}
			else {
				for(int j=word.length()-1; j>=0; j--) {
					revWord = revWord + word.charAt(j);
				}
			}
			revString = revString + revWord + " ";
		}
		System.out.println(revString);
	}
}
