package com.test;

import java.util.Scanner;

//Driver code 
public class PhoneDirectory 
{ 
	public static void main(String args[]) 
	{ 
		Trie trie = new Trie(); 

		String contacts [] = {"rameshreddy", "suresh","prasad","pavankumar"}; 

		trie.insertIntoTrie(contacts); 

		//String query = "s"; 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Search by name:");
		String query = sc.nextLine();
		

		// Note that the user will enter 'g' then 'e' so 
		// first display all the strings with prefix as 'g' 
		// and then all the strings with prefix as 'ge' 
		trie.displayContacts(query); 
	} 
} 
