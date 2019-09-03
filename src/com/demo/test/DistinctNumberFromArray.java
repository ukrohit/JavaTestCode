package com.demo.test;


// print the distinct number from the list 
// program to remove the duplicate number from he list 
public class DistinctNumberFromArray {

	public static void main(String[] args) {
		
		int[] numbers={1,5,6,8,2,4,6,5,7,9,4,5,3};
		
		int distinctNumber=numbers.length;
		for (int i : numbers) {
			System.out.print(i+",");
		}
		
		System.out.println("Let Sistinct Number"+distinctNumber);
		
		for(int i=0;i<distinctNumber;i++)
		{
			for(int j=i+1;j<distinctNumber;j++)
			{
				if(numbers[i]==numbers[j])
				{
					numbers[j]=numbers[distinctNumber-1];
					distinctNumber-- ;
					j--;
				}
			}
		}
		
		for (int i = 0;i<distinctNumber; i++ ) {
			System.out.print(numbers[i]+",");
		}

		
		System.out.println("Distinct Number"+distinctNumber);
				
	}

}
