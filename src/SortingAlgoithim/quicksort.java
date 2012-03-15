package SortingAlgoithim;

public class quicksort {
	public static void main(String[] args){
		int [] shuzu = {4,27,78,34,21,55,44,37,98,115,27,263,18};
		quicks(shuzu,0,shuzu.length-1);
		for(int i=0;i<shuzu.length;i++)
			System.out.println("index£º"+i+"shuzhi£º"+shuzu[i]);
		}
	public static int partition(int[] a, int p, int r){
		int i = p-1, j;
		int swp = a[r];
		for(j = p;j<r;j++){
			if(a[j]<swp){
				i = i+1;
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		a[r] = a[i+1];
		a[i+1] = swp;
		return i+1;
	}
	public static void quicks(int[] a, int p, int r){
		if(p<r){
			int q = partition(a , p, r);
			quicks(a, p, q-1);
			quicks(a, q+1, r);
		}
	}
}
