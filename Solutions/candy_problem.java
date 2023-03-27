import java.io.*;
import java.util.*;
class Main{
  static int countCandies(int arr[], int n)
{
	int sum = 0;
	int[] a = new int[n];
	if (n == 1)
	{
		return 1;
	}
	for(int i = 0; i < n; i++)
		a[i] = 1;
	for(int i = 0; i < n - 1; i++)
	{
		if (arr[i + 1] > arr[i])
		{
			a[i + 1] = a[i] + 1;
		}
	}
	for(int i = n - 2; i >= 0; i--)
	{
		if (arr[i] > arr[i + 1] &&
			a[i] <= a[i + 1])
		{
			a[i] = a[i + 1] + 1;
		}
		sum += a[i];
	}
	sum += a[n - 1];
	return sum;
  }
  public static void main(String[] args)
  {
	int m;
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter number of elements in the array");
	m=sc.nextInt();
	int arr[]=new int [m] ;
	System.out.println("Enter the array elements");
	for(int i=0;i<m;i++)
	{
	    arr[i]=sc.nextInt();
	}
	System.out.println(countCandies(arr, m));
   }
}
