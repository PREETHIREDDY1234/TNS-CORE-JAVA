package tnscorejava1;

import java.util.Scanner;
public class Practice {

	public static void main(String[] args) {
		int arr[]=new int[3];
		System.out.println("enter array index:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("enter array elements:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}


		
	}

}
