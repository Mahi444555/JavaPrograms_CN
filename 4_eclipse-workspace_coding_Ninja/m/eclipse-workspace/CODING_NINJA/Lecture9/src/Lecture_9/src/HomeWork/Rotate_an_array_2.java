package HomeWork;
import java.util.Scanner;
public class Rotate_an_array_2 {

//	//rotate array in left side hece 0th index element stored in temp 
//	//my function 
//	public static void RotateArray(int arr[],int d) {
//		int n=arr.length;
//		while(d>0) {	//these loop is for no of times array elements to be shift i.e. d 
//			int temp=arr[0];
//			for(int i=0;i<n-1;i++) {//i<n-1 i.e. if n=5 then it will iterate till n-2 because we  
//									//have to store 0th element at last 
//				arr[i]=arr[i+1];
//			//we storing next element to previous index hence arr[i]=arr[i+1]
//			}
//			arr[n-1]=temp;
//			d--;
//		}
//		for(int i=0;i<n;i++) {
//			System.out.print(arr[i]+" ");
//		}
//	}
	
	public static void RotateArray(int arr[],int d) {	//passing an array and d ie. no of rotation
		int temp[]=new int[arr.length];	//my temporary new array   let d=2
		for(int i=d;i<arr.length;i++)		//these loop directly start from d i.e no of roation till n-1
		{
			temp[i-d]=arr[i];	//storing in array temp[2-2] [0] at 0th index 2nd index element  
		}
		for(int i=0;i<d;i++)
		{
			temp[arr.length-d-i]=arr[i];
		}
		for(int i=0;i<arr.length;i++) {
			arr[i]=temp[i];
		}
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();//where t=no of test cases to be run
		int q=1;	//q is iteration till t
		while(q<=t) {
			System.out.println("enter the d no of rotation");
			int d=sc.nextInt();	//where 'd' is no of times rotates an array
			int n=sc.nextInt();
			int arr[]=new int[n];	//my array of size passing n
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();	//taking array elements from Systems and storing in arr
			}
			RotateArray(arr,d);	//calling array arr
			q++;	
		}
		
	}

}
