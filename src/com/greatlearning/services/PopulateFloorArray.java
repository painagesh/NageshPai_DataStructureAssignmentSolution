package com.greatlearning.services;

import java.util.Scanner;

public class PopulateFloorArray {

	Scanner sc = new Scanner (System.in);

	public void populateArray (int FloorArray[], int totalfloors) {

		for (int i = 0; i <= totalfloors-1; i++) {
			boolean validation = false;

			while (!validation) {


				System.out.println("Please enter floor size given on day : "+(i+1));	
				int userinput = sc.nextInt();
				boolean test = false;

				//validate if the entered floor size has already been entered earlier
				for (int element : FloorArray) {
					if (element == userinput) {
						test = true;
						break;
					}
				}

				if (test) {
					System.out.println("The entered floor size is already provided earlier."
							+ "Please enter a unique floor size that is less than or equal to "+totalfloors);

				} else if (userinput <=0 || userinput > totalfloors) {
					System.out.println("The entered size is an invalid entry. "
							+ "Please provide floor size that is greater than 0 and less than or equal to "+totalfloors);
				}
				else {
					FloorArray[i]=userinput;
					validation = true;
				}
			}
		}
	}

	

}
