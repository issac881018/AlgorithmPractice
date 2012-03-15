package SortingAlgoithim;

public class heapsort2 {
	public static void main(String[] args){
		int [] shuzu = {4,27,78,34,21,55,44,37,98,115,27,263,18};
		myheapsort(shuzu);
		for(int i=0;i<shuzu.length;i++)
			System.out.println("index："+i+" "+"shuzhi："+shuzu[i]);
		}

	public static void maxheapify(int[] a, int i, int heapsize) {
		int temp, largest;
		int l = 2 * i - 1, r = 2 * i;
		System.out.println(i);
		if (l <= heapsize && a[l] > a[i - 1]) {
			// System.out.println(i);
			largest = l;
		} else
			largest = i - 1;
		if (r <= heapsize && a[r] > a[largest])
			largest = r;
		if (largest != i - 1) {
			temp = a[i - 1];
			a[i - 1] = a[largest];
			a[largest] = temp;
		}
		if (2 * (1 + largest) < heapsize) {
			maxheapify(a, largest, heapsize);
		}
	}
	//对任意一个输入数组建堆
	public static void buildmaxheap(int[] a,int heapsize){
		for(int k = heapsize/2;k>=1;k--)
			maxheapify(a,k,heapsize);
	}
	//堆排序函数
	public static void myheapsort(int[] a){
		int heapsize = a.length;
		buildmaxheap(a,heapsize);
		for(int j = a.length;j>1;j--){
			System.out.println(heapsize);
			int rc = a[j-1];
			a[j-1] = a[1];
			a[0] = rc;
			heapsize = heapsize-1;
			maxheapify(a,1,heapsize);
		}
	}

}

