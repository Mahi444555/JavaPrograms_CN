package SEARCHING_PROGRAMS;
import java.util.Scanner;
public class Leaner_Search1 {

public static int match(int arr[],int x)
{
	int n=arr.length-1;		//assigning array length to the n using .length function
	for(int i=0;i<=n;i++)
	{
		if(x == arr[i])
			return i;
	}
	return -1;
}

public static int[] takeInput()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the no of elements");
	int n=sc.nextInt();
	int arr[]=new int[n];//declaration of an array 
	for(int i=0;i<=arr.length-1;i++)
	{
		arr[i]=sc.nextInt();	//here we taking an array elements from system
	}
	return arr;	//here we returning an array hence taken return type of function int[] 
	
}
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the no of test cases to be run");
	int t=sc.nextInt();
	int i=1;

	while(i<=t)	//where t is no of test cases will be run 
	{
		int m[]=takeInput();	//takeInput function will return an array hence m will be m[]
		System.out.println("enter the elemnts to be match");
		int x=sc.nextInt();
		int result=match(m,x);
		System.out.print("matched at index"+result+"\t");
		i++;
	}
}
}
