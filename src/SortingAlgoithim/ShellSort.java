package SortingAlgoithim;

public class ShellSort {
	public static void main(String[] args){
		int [] shuzu = {4,27,78,34,21,55,44,37,98,115,27,263,18};
		shellsort(shuzu);
		for(int i=0;i<shuzu.length;i++)
			System.out.println("index��"+i+" "+"shuzhi��"+shuzu[i]);
		}
	public static void shellsort(int[] a){
		int j;
		for(int gap = a.length/2;gap>0;gap=gap/2){//�趨��ʼ����Ϊ���鳤�ȵ�1/2���Ժ�����۰�
			for(int i = gap;i<a.length;i++){//����һ��ָ���Ĳ�����ÿһ�����򶼿��Կ���һ���������
				int temp = a[i];
				for(j = i;j>=gap&&temp<a[j-gap];j=j-gap)
					a[j]=a[j-gap];
				a[j]=temp;
			}
			
		}
	}

}
//ʹ��ϣ������ʱ��ϣ��������������������ʱ��Ϊ��N2��