package SEARCHING_PROGRAMS;
import java.util.Scanner;
public class Bubble_Sort2 {

	public static void BubbleSort(int arr[]) 
	{
		
		int n=arr.length;	//accessing array length and assigning to the n
		for(int i=0;i<n-1;i++)	//where i<n-1 i.e. last elements get sorted automatically hecne no need to check last hecne n-2;
		{
			int flag=0;	//use for when all are already sorted then break the loop
			for(int j=0;j<n-1-i;j++)	//n=7 0<7-1 i.e. 0<6 no need to check each time last it ll automatically sort
			{
				if(arr[j] > arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;	//here we doing adjecent swapping
					flag=1; //it shows swapping is going on 
				}
				
			}
			if(flag==0)
				break;
		}
for(int l=0;l<arr.length;l++)
	{
		System.out.print(arr[l]+"\t");
	}
		
}
	
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();	//accepting array elements from user
		}
		BubbleSort(arr);	//here calling the Bubblesort funciton and passing array
	}
}
