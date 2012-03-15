package SortingAlgoithim;

public class zhebaninsertsort {
	public static void main(String[] args){
		int [] shuzu = {4,27,78,34,21,55,44,37,98,115,27,263,18};
		zhebansort(shuzu);
		for(int i=0;i<shuzu.length;i++)
			System.out.println("index£º"+i+" "+"shuzhi£º"+shuzu[i]);
		}
	public static void zhebansort(int[] a){
		for(int i=2;i<a.length;i++){
			int temp = a[i];
			int low =1, high = i-1;
			while(low<=high){
				int mid = (low+high)/2;
				if(temp<a[mid])
					high = mid-1;
				else low = mid+1;
			}
			for(int j=i-1;j>=low;j--)
				a[j+1]=a[j];
			a[low] = temp;
		}
	}
}
