package starPattern;

public class Pattern4 {

	public static void main(String[] args) {
//*****
// ****
//  ***
//   **
//    *
		int space=0;    //1st row there is no space i.e space=0
		int star=5;     //1st row there is 5 stars  i.e star=5
        
		for(int i=1;i<=5;i++)  //outer loop for rows
		{
			for(int j=1;j<=space;j++)  //used space because it start with space
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)  //star start after space
			{
				System.out.print("*");
			}
			System.out.println();
			star--;
			space++;
		}
	}

}
