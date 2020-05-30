package sort;

public class SelectSort {
	
	public int[] selectionSort(int[] arr) {
		for(int i=0 ; i<=arr.length-1;i++) {
			int min=i;
			for (int j=i+1;j<arr.length;j++) {
				if(arr[min]>arr[j]) {
					min=j;
				}
			}
			if(min!=i) {
				int temp = arr[min];
				arr[min]=arr[i];
				arr[i]=temp;
			}
		}
		for(int i=0;i<arr.length-1;i++) {
			System.out.println(arr[i]);
		}
		return arr;
	}
	
	public void quickSort(int[] arr, int low, int high) {

		if (low < high) {
			// ��Ѱ��׼���ݵ���ȷ����
			int index = getIndex(arr, low, high);

			// ���е�����index֮ǰ��֮������������ͬ�Ĳ���ʹ��������������
			quickSort(arr, 0, index - 1);
			quickSort(arr, index + 1, high);
		}

	}

	private static int getIndex(int[] arr, int low, int high) {
		// ��׼����
		int tmp = arr[low];
		while (low < high) {
			// ����β��Ԫ�ش��ڵ��ڻ�׼����ʱ,��ǰŲ��highָ��
			while (low < high && arr[high] >= tmp) {
				high--;
			}
			// �����βԪ��С��tmp��,��Ҫ���丳ֵ��low
			arr[low] = arr[high];
			// ������Ԫ��С�ڵ���tmpʱ,��ǰŲ��lowָ��
			while (low < high && arr[low] <= tmp) {
				low++;
			}
			// ������Ԫ�ش���tmpʱ,��Ҫ���丳ֵ��high
			arr[high] = arr[low];

		}
		// ����ѭ��ʱlow��high���,��ʱ��low��high����tmp����ȷ����λ��
		// ��ԭ���ֿ��Ժ������֪��lowλ�õ�ֵ������tmp,������Ҫ��tmp��ֵ��arr[low]
		arr[low] = tmp;
		return low; // ����tmp����ȷλ��
	}
	  public  void bubbleSort(int []arr) {
		  int i,j;
		  for(i=0;i<arr.length-1;i++)
	        {
	            for(j=0;j<arr.length-1-i;j++)
	            {
	                if(arr[j]>arr[j+1])
	                {
	                    int temp=arr[j];
	                    arr[j]=arr[j+1];
	                    arr[j+1]=temp;
	                }
	            }
	        }
	    }

}
