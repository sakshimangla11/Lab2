package com.greatlearning.labSession.service;

import java.util.Scanner;

public class Main {

	  public static void main(String[] args) {
		  MergeSortImplementation merge = new MergeSortImplementation();
		  NotesCount notescount = new NotesCount();
		  
		  System.out.println("enter the size of currency denominations");
		  Scanner sc = new Scanner(System.in);
		  
		  int size = sc.nextInt();
		  int[] notes = new int[size];
		  
		  System.out.println("enter the currency denominations values");
		  for(int i=0;i<size;i++) {
			  notes[i] = sc.nextInt();
		  }
		  
		  System.out.println("enter the amount you want to pay");
		  int amount = sc.nextInt();
		  
		  merge.sort(notes,0, notes.length-1);
		  notescount.notesCountImplementation(notes, amount);
	  }
	
}
