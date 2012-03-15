package SortingAlgoithim;

public class heapsort {
	public static void main(String[] args){
		int [] shuzu = {16,7,10,9,14,8,3,2,4,1};
		myheapsort(shuzu);
		for(int i=0;i<shuzu.length;i++)
			System.out.println("index："+i+" "+"shuzhi："+shuzu[i]);
		}
	//保持大根堆性质的函数
	public static void maxheapify(int[] a, int i,int heapsize){
		int temp = a[i-1],h;
		//System.out.println(i);
		for(h = 2*i-1;h<=heapsize-1;h = 2*h+1){
			if(h<heapsize-1&&a[h]<a[h+1])
				h++;
			if(a[h]<=temp)
				break;
			a[i-1] = a[h];
			i = h+1;
		}
		a[i-1] = temp;
	}
	//对任意一个输入数组建堆
	public static void buildmaxheap(int[] a,int heapsize){
		for(int k = heapsize/2;k>=1;k--)
			maxheapify(a,k,heapsize);
	}
	//堆排序函数
	public static void myheapsort(int[] a){
		int heapsize = a.length;
		//System.out.println(heapsize);
		buildmaxheap(a,heapsize);
		for(int j = a.length;j>1;j--){
			System.out.println(heapsize);
			int rc = a[j-1];
			a[j-1] = a[0];
			a[0] = rc;
			heapsize = heapsize-1;
			maxheapify(a,1,heapsize);
		}
	}

}
