package com.dsa.currencydenomination.controller;

import java.util.Scanner;

import com.dsa.currencydenomination.service.MergeSortImplementation;
import com.dsa.currencydenomination.service.NoteCount;

public class CurrencyDenomination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MergeSortImplementation mergeSortImplementation = new MergeSortImplementation();
		NoteCount noteCount = new NoteCount();

		System.out.println("\n Please Enter the size of currency denominations");
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();
		int note[] = new int[size];
		System.out.println("\n Please Enter the currency denominations value");

		for (int i = 0; i < size; i++) {
			note[i] = sc.nextInt();

		}
		System.out.println("\n Please Enter the amount you want to pay");
		int amount = sc.nextInt();
		mergeSortImplementation.sort(note, 0, note.length - 1);
		noteCount.noteCountImplementation(note, amount);
		sc.close();
	}

}
