package starPattern;

public class Pattern3 {

	public static void main(String[] args) {
//*****
//****
//***
//**
//*
		int star=5;     //no of star present in 1st row
		for(int i=1;i<=5;i++)  //outer loop for Rows
		{
			for(int j=1;j<=star;j++) //inner loop for column
			{
				System.out.print("*");
			}
			System.out.println();
			star--;
		}

	}

}
