package BubbleSort;
import java.util.Scanner;
public class BubbleSORTadjecentSwap {

public static void bubbleSort(int arr[])
	{
		int n=arr.length;
		int counter=1;
		while(counter<n) 	//if n=5 then 1<5 i.e. 1  2 3 4 only iteration
		{
			for(int i=0;i<n-counter;i++)	//where i<n-counter 0<5-1 i.e. 0 to 3 only 0 1 2 3 
			{
				if(arr[i]>arr[i+1])
				{
					int temp=arr[i];		//arr[i]=is 0th num assign to temp
					   arr[i]=arr[i+1];		// arr[i+1=is 1st number assign to 0th place
					   arr[i+1]=temp;  			//swapping 
				}
			}
			counter++;
		}
		for(int i=0;i<=n-1;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int arr[]=new int[N];		//My_array of name arr[] and size=N
		for(int i=0;i<=N-1;i++)
		{
			arr[i]=sc.nextInt();
		}
		bubbleSort(arr);		//calling bubbleSort and passing our array arr
	}

}


/*

  
  	public static void bubbleSort(int arr[])
  	{
  		
  		for(int i=0;i<arr.length-1;i++)
  		{
  			for(int j=0;j<arr.length-1-i;j++)
  			{
  			if(arr[j]>arr[j+1])
  			{
  			int temp=arr[j];
  				arr[j]=arr[j+1];
  				arr[j+1]=temp;	//swapping largest no to last location
  			}
  		}
      }	
  	}
  	
  	public static void main(String[] args)
  	{
  	int arr[]={100 , 80, 50 , 200 };
  	bubbleSort(arr);		//calling function and passing array
  	for(int i=0;i<arr.length;i++)
  	{
  	   System.out.print(arr[i]+" ");
  	}
   }
 } 

  */

 
