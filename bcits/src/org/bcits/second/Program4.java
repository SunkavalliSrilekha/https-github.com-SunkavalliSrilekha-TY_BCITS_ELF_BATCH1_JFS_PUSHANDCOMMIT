package org.bcits.second;

import java.util.Scanner;

public class Program4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String words[] = str.split(" ");
		String result = "";
		for(int i=0; i<words.length; i++) {
			String word = words[i];
			int count=0;
			String str2= "";
			for(int j=0; j<word.length(); j++) {
				str2 = str2 + word.charAt(j);
				count++;
			}
			result = result+ str2+ count+ " ";
		}
		System.out.println(result);
	}
}
