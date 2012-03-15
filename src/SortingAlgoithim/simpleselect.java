package SortingAlgoithim;

public class simpleselect {
	public static void main(String[] args){
		int [] shuzu = {1,2,8,9,14,3,4,7,10,16};
		select(shuzu);
		for(int i=0;i<shuzu.length;i++)
			System.out.println("index£º"+i+" "+"shuzhi£º"+shuzu[i]);
		}
	public static void select(int[]a){
		for(int i = 0;i<a.length;i++){
			int minindex = i;
			for(int j = i;j<a.length;j++){
				if(a[j]<a[minindex])
					minindex = j;
			}
			int temp = a[i];
			a[i] = a[minindex];
			a[minindex]=temp;
		}
	}
}
