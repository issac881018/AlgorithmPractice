package SearchingAlgoithim;

import java.util.Scanner;
import java.util.Arrays;

public class seqsearch {
	public static void main(String args[]){
		int [] shuzu = {16,7,10,9,14,8,3,2,4,1,4};
		System.out.println("ԭʼ����Ϊ��"+Arrays.toString(shuzu));
		System.out.println("������Ҫ���ҵ�����");
		Scanner reader = new Scanner(System.in);
		int x = reader.nextInt();
		seq_search(shuzu,x);
	}
	public static void seq_search(int[] a, int x){
		int l = a.length,flag,biaozhi = 0;
		int[] b;
		b = Arrays.copyOf(a, a.length+1);
		b[l] = x;
		System.out.println(Arrays.toString(b));
		for(int i=0;i<b.length;i++){
			if(b[i]==x){
				flag = i;
				if(flag!=l){
					System.out.println("���ҵ�Ŀ��Ԫ��"+x+"��λ��Ϊ��"+flag);
					biaozhi = 1;
				}
			}
		}
		if(biaozhi==0)
			System.out.println("�޸�Ԫ��");
	}

}
