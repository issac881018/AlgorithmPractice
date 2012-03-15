package SortingAlgoithim;
import java.util.*;

public class StraightInsertionSort {
	public static void main(String[] args){
	int [] shuzu = {4,27,78,34,21,55,44,37,98,115,27,263,18};
	simplesort(shuzu);
	for(int i=0;i<shuzu.length;i++)
		System.out.println("index£º"+i+" "+"shuzhi£º"+shuzu[i]);
	}
	public static void simplesort(int[] shuzu){
		int j;
		for(int k=1;k<shuzu.length;k++){
			int temp = shuzu[k];
			for(j=k;j>0 && temp<shuzu[j-1];j--){
				shuzu[j] = shuzu[j-1];
			}
			shuzu[j] = temp;
		}
	}
	

}
