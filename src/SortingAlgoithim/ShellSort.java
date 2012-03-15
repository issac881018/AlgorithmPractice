package SortingAlgoithim;

public class ShellSort {
	public static void main(String[] args){
		int [] shuzu = {4,27,78,34,21,55,44,37,98,115,27,263,18};
		shellsort(shuzu);
		for(int i=0;i<shuzu.length;i++)
			System.out.println("index："+i+" "+"shuzhi："+shuzu[i]);
		}
	public static void shellsort(int[] a){
		int j;
		for(int gap = a.length/2;gap>0;gap=gap/2){//设定初始步长为数组长度的1/2，以后逐次折半
			for(int i = gap;i<a.length;i++){//对于一个指定的步长，每一次排序都可以看做一组插入排序
				int temp = a[i];
				for(j = i;j>=gap&&temp<a[j-gap];j=j-gap)
					a[j]=a[j-gap];
				a[j]=temp;
			}
			
		}
	}

}
//使用希尔增量时，希尔排序的最坏情形是其运行时间为（N2）