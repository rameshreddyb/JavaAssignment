package com.test;

// A Java solution for longest palindrome
import java.util.*;

class LongestPalindrome {

	// Function to print a subString str[low..high]
	static void printSubStr(String str, int low, int high) {
		for (int i = low; i <= high; ++i)
			System.out.print(str.charAt(i));
	}

	// This function prints the longest palindrome subString
	static void longestPalSubstr(String str) {
		// get length of input String
		int n = str.length();

		// All subStrings of length 1 are palindromes
		int maxLength = 1, start = 0;

		// Nested loop to mark start and end index
		for (int i = 0; i < str.length(); i++) {
			for (int j = i; j < str.length(); j++) {
				int flag = 1;

				// Check palindrome
				for (int k = 0; k < (j - i + 1) / 2; k++)
					if (str.toLowerCase().charAt(i + k) != str.toLowerCase().charAt(j - k))
						flag = 0;

				// Palindrome
				if (flag != 0 && (j - i + 1) > maxLength) {
					start = i;
					maxLength = j - i + 1;
				}
			}
		}
		
		System.out.print("Longest palindrome subString is: ");
		printSubStr(str, start, start + maxLength - 1);
	}

	public static void main(String[] args) {
		String str = "HelloWelcomeemoclewHelloolle";
		longestPalSubstr(str);
	}
}