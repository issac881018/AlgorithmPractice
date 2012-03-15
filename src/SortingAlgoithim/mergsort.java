package SortingAlgoithim;
import java.util.Arrays;

public class mergsort {
	public static void main(String[] args){
		int [] shuzu = {1,2,8,9,14,3,4,7,10,16};
		mergesort(shuzu);
		for(int i=0;i<shuzu.length;i++)
			System.out.println("index£º"+i+" "+"shuzhi£º"+shuzu[i]);
		}
	
	public static void sort(int[] a, int left, int right){
		int center = (left+right)/2;
		if(left<right){
		sort(a,left,center);
		sort(a,center+1,right);
		merge(a,left,center,right);
		}
	}
	
	public static void merge(int[] a, int left, int center, int right){
		int second = center+1;
		int[] b = new int[a.length];
		int first = left, third = right, biao = left;
		while(left<=center&&second<=right){
			if(a[left]<a[second]){
				b[first++] = a[left++];
			}else{
				b[first++] = a[second++];
			}
		}
		while(first <=center){
			b[first++]=a[left++];
		}
		while(second<=third)
			b[first++]=a[second++];
		//for(int i=0;i<b.length;i++){
		//	System.out.println("index£º"+i+" "+"shuzhi£º"+b[i]);
		//}
		while(biao<=right){
			a[biao] = b[biao++];
		}
	}
	public static void mergesort(int[] a){
		sort(a, 0, a.length-1);
	}

}
