
public class SORT_zero_and_One {

	public static void main(String[] args) {

		int arr[]= {1, 1, 0, 0, 1, 0 };		//n=6 i.e. 0 to 4
		int i=0;
		int j=arr.length-1;
		while(i<j);		//0<4
		{
			int leftIndex=arr[i];
			int rightIndex=arr[j];
			
			if(leftIndex==0)
			{
				i++;
			}
			if(rightIndex==1)
			{
				j--;
			}
			
			if(leftIndex==1 && rightIndex==0)
			{
				arr[i]=rightIndex;
				arr[j]=leftIndex;
				i++;
				j--;
			}
		}
		for(int k=0;k<arr.length;k++)
		{
			System.out.print(arr[k]);
		}
	}

}
