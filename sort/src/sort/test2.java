package sort;

public class test2 {
	public  static void main(String args) {
		int []a= {8558,623,631,2223,4423,696};
		quickSort.quicklySort(a,0,5);
		for(int i=0;i<=a.length-1;i++) {
			System.out.println(a[i]);
		}
	}
}
