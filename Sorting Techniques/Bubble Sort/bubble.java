package lab;

import java.util.Scanner;

public class Bubble{
	public static void main(String[] args) {
		int c,n;
		System.out.println("Enter the Number Of Elements");

		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		int []a = new int[n];
		for(c=0;c<n;c++)
		{
			a[c] = scan.nextInt();
		}
		Bubble.print(a);
		Bubble.bubble(a, n);
		System.out.println();
		Bubble.print(a);



	}

	public static void bubble(int b[],int k) {
		for (int i = 0; i < k - 1; i++) //run from first cell to last cell
			for (int j = 0; j < k - i - 1; j++) //run from first cell to "last cell - iteration"
				if (b[j] > b[j + 1]) {
					int temp = b[j];
					b[j] = b[j + 1];
					b[j + 1] = temp;
				}
	}
	public static void print(int []a)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+ " ");
		}
	}









}
