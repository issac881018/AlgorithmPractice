package SearchingAlgoithim;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	public static void main(String args[]){
		int [] shuzu = {1,7,8,13,14,24,28,33,44,57,89};
		System.out.println("ԭʼ����Ϊ��"+Arrays.toString(shuzu));
		System.out.println("������Ҫ���ҵ�����");
		Scanner reader = new Scanner(System.in);
		int x = reader.nextInt();
		binary_search(shuzu,x);
	}
	public static void binary_search(int[] a,int x){
		int l = a.length;
		int low = 0, high = l-1, mid, flag = 0;
		while(low<=high){
			mid = (low + high)/2;
			if(a[mid]==x){
				flag = 1;
				System.out.println("�ҵ�Ŀ��Ԫ�أ�"+x+"���������е�λ��Ϊ��"+mid);
				break;
			}
			else if(a[mid]<x)
				low = mid+1;
			else
				high = mid - 1;
		}
		if(flag == 0)
			System.out.println("û���ҵ���Ԫ��");
	}

}
