package hw;
/*
 * Topic: ���ϥΪ̿�J1, 2, 3, �P4�ﶵ�A
          1.��J n ����ܹϧ� (ex: n = 5)
          2.��J n ����ܹϧ�
          3.��J n (�����O�_��)����ܹϧ�
          4.�����{��
 * Date: 2016/10/17
 * Author: 105021056 ���a��
 */
import java.util.Scanner;
public class hw04_105021056 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J�ﶵ(1,2,3,4)");
		int x = scn.nextInt();
		switch (x) {
		case 1:
			System.out.println("�п�Jn");
			int v1 = scn.nextInt();
			for (int i = v1 / 2 + 1; i > 0; i--) {
				for (int j = i; j > 0; j--) {
					System.out.print("@");
				}
				System.out.println();
			}
			for (int a = 0; a < v1 / 2; a++) {
				for (int b = 0; b < 2 + a; b++) {
					System.out.print("@");
				}
				System.out.println();
			}
			break;
		case 2:
			System.out.println("�п�Jn");
			int v2 = scn.nextInt();
			for (int i = 0; i < v2 / 2 + 1; i++) {
				for (int j = 0; j <= i; j++) {
					System.out.print("%");
				}
				System.out.println();
			}
			for (int a = v2 / 2; a > 0; a--) {
				for (int b = a; b > 0; b--) {
					System.out.print("%");
				}
				System.out.println();
			}
			break;
		case 3:
			System.out.println("�п�Jn");
			int v3 = scn.nextInt();
			for (int i = 0; i < v3 / 2 + 1; i++) {
				for (int j = v3 / 2 - i; j > 0; j--) {
					System.out.print(" ");
				}
				for (int k = 0; k <= 2 * i; k++) {
					System.out.print("#");
				}
				System.out.println();
			}
			for (int a = 0; a < v3 / 2; a++) {
				for (int b = 0; b <= a; b++) {
					System.out.print(" ");
				}
				for (int c = v3 - (a * 2) - 2; c > 0; c--) {
					System.out.print("#");
				}
				System.out.println();
			}
			break;
		case 4:
			System.out.println("�{���w����");
			break;
		default:
			System.out.println("�ϥΪ̿�J���~");
			break;
		}

	}

}
