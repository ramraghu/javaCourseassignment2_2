package com.acadgild.learnJava;

public class assignment2_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int j = 0; 
		int n = 6; 
		for (j=0; j < 5; j++)
			 for(i=0;i<n;i++)
			    {
			        for(j=0;j<n;j++)
			        {
			            if(i==j || j==(n-i-1))
			            {
			                System.out.printf(" *");
			            }
			            else
			            {
			                System.out.printf(" ");
			            }
			        }
			        System.out.printf("\n");
			    }
}
}

