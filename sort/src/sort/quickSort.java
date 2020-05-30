package sort;

public class quickSort {
	
	public static int getMiddle(int[] arr,int low,int hight)
	{
		int temp=arr[low];
		while(low<hight)
		{
			while((low<hight)&&(temp<arr[hight])) {
				hight--;
			}
			arr[low]=arr[hight];
			while((low<hight)&&(temp>arr[low])) {
				low++;
			}
			arr[hight]=arr[low];
		}
		arr[low]=temp;
		return low;
	}
	
	public static void quicklySort(int[]arr,int low,int hight) {
		if(low<hight) 
		{
		int middle=getMiddle(arr,low,hight);
		quicklySort(arr,low,middle-1);
		quicklySort(arr,middle+1,hight);
		}
		
	}
}
