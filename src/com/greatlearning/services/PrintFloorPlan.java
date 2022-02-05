package com.greatlearning.services;

import java.util.LinkedList;

public class PrintFloorPlan {

	public void printPlan (int FloorArray[], int totalfloors, int currentMaxfloor) {

		//Linked List data structure to hold the size of floors as a temporary holder
		LinkedList<Integer> L1 = new LinkedList<Integer>();

		//Function to iterate over Array holding floor sizes and provide required output
		for (int i=0; i<=totalfloors-1; i++) {

			System.out.println("Day "+(i+1));

			//Check if current element is matching with CurrentMaxfloor and if so print it
			//else put this element in temporary data structure linked list
			if (FloorArray[i]== currentMaxfloor) {
				System.out.print(FloorArray[i]);
				currentMaxfloor--;

				//for elements in linked list check if it contains any floor sizes below the CurrentMaxfloor
				if (L1.size()>0) {

					int k=L1.size();	
					for (int j=0; j<=k-1; j++) {

						if (L1.contains(currentMaxfloor)) {
							System.out.print(" "+currentMaxfloor);
							L1.remove(Integer.valueOf(currentMaxfloor));
							currentMaxfloor--;
						}
					}
				}

				//if current element in Array is not matching with CurrentMaxfloor put it in Linked List DS
			}else {
				L1.add(FloorArray[i]);
			}

			System.out.println();	
		}
	}

}
