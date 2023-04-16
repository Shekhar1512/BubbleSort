package javaPrograms;

public class BubbleSort16 {

//	bubble sort fun. definition
	
	
	public static void bubblesort(int a[])
	{
		for(int i=0;i<a.length-1;i++)
		{
			int  flag =0;
			 
			for(int j=0; j<a.length-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					flag=1;
				}
			}
			if(flag==0)
			{
				break;
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		int a[] = {16,14,5,6,8};
		
		bubblesort(a);                 //call bubble sort function
		
		//print final sorted array
		for(int i:a)
		{
			System.out.print(i+"  ");
			
		}

	}

}
