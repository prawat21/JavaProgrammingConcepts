package codechefpractice;

import java.util.Scanner;

public class RatingImprovement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0)
	    {
	        int x=sc.nextInt();
	        int y=sc.nextInt();
	        int a=x+200;
	        if(y>=x && y<=a)
	        {
	            System.out.println("YES");
	        }
	        else
	        {
	            System.out.println("NO");
	        }
	        
	    }

	}

}
