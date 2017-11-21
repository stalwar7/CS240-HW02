import java.util.Random;

public class MergeSort_Recursive {
	
	public static void merge(int arraySort[], int first, int mid, int last)
	{
		int splitOne = mid-first + 1;
		int splitTwo = last - mid;
		
		int firstHalf[] = new int[splitOne];
		int secondHalf[] = new int[splitTwo];
		
		for (int i = 0; i < splitOne; i++)
		{
			firstHalf[i] = arraySort[first+1];
		}
		
		for (int j = 0; j < splitTwo; j++)
		{
			secondHalf[j] = arraySort[mid + 1 + j];
		}
		int i = 0;
		int j = 0;
		int k = first;
		
		while (i < splitOne && j < splitTwo)
		{
			if(firstHalf[i] <= secondHalf[i])
			{
				arraySort[k] = firstHalf[i];
				i++;
			}
			else
			{
				arraySort[k] = secondHalf[j];
				j++;
			}
			k++;			
		}	
	}
	
	public void sort ( int arraySort[], int first, int last)
	{
		if(first < last)
		{
			int mid = (first+last)/2;
			sort(arraySort, first, mid);
			sort(arraySort, mid+1, last);
			merge(arraySort, first, mid, last);			
		}
	}
	public static void main (String args[])
	{
		int arraySort[] = new int[10];
		Random randomObj = new Random();	
		for (int i = 0; i< arraySort.length; i++)
		{
		   	int x = randomObj.nextInt(1000);
		   	arraySort[i] = x;
		   	System.out.print(arraySort[i] + " ");
		} 
		System.out.println();
		long startTime = System.nanoTime();
		MergeSort_Recursive ms = new MergeSort_Recursive();
		ms.sort(arraySort,0, arraySort.length - 1);
		long endTime = System.nanoTime();
		long duration = (endTime - startTime);
		System.out.println("Sorted Array ");
		for(int i = 0; i < arraySort.length; i ++)
		{
			System.out.print(arraySort[i] + " ");
		}
		System.out.println();
		System.out.println(duration);
		
	}

}
