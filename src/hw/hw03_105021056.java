package hw;

/*
 * Topic: �{���ӵ{�����ϥΪ̳s���J��� (���ơB�t�Ƥιs)�A
 * ����ϥΪ̿�J 999 �ɰ���A�M����ܥ��Ʀ��h�֭ӡA0 ���X�ӡA
 * �t���`�@���X�ӡA�ϥΪ̥i�H���а��檽��ϥΪ̿�Jn
 * Date: 2016/10/17
 * Author: 105021056 ���a��
 */
import java.util.Scanner;

public class hw03_105021056 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true){
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J�ƭ�");
		int v1 = scn.nextInt();
		int sum = 0;
		int a = 0;
		int b = 0;
		int c = 0;
		
		while (v1 != 999) {
			v1 = scn.nextInt();
			if (v1 > 0) {
				a++;
			} else if (v1 < 0) {
				b++;
			} else if (v1 == 0) {
				c++;
			}
		}
		System.out.println("����"+a+"�t��"+b+"�s"+c);
		System.out.println("�O�_�~��Y/N");
		char ch1 = scn.next().charAt(0);
		if(ch1=='n'||ch1=='N'){
			System.out.println("�{�������P�¨ϥ�");
			break;
		}
		}
		
	}
}
