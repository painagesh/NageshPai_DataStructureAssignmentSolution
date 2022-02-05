package com.greatlearning.driver;

import com.greatlearning.services.*;
import java.util.Scanner;


public class BuildingPlan {

	public static void main(String[] args) {

		//variables to hold the total floors and current maximum size of floor
		int totalfloors, currentMaxfloor;

		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter the total number of floors in the building");

		totalfloors = sc.nextInt();
		currentMaxfloor = totalfloors;

		//array to hold all the entered floor sizes
		int FloorArray[]= new int[totalfloors];

		//Fill the array for holding the floor sizes received per day
		PopulateFloorArray populateArray = new PopulateFloorArray();
		populateArray.populateArray(FloorArray, totalfloors);
		

		//Print the floor plan
		System.out.println("The order of construction is as follows");
		PrintFloorPlan printPlan = new PrintFloorPlan();
		printPlan.printPlan(FloorArray, totalfloors, currentMaxfloor);
		
		sc.close();
	}

}
