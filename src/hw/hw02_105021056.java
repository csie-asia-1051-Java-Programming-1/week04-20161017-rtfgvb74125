package hw;

/*
 * Topic: �ϥΪ̿�J����� n �P m �M��p��
 * Date: 2016/10/17
 * Author: 105021056 ���a��
 */
import java.util.Scanner;

public class hw02_105021056 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int v1 = scn.nextInt();
		int v2 = scn.nextInt();
		int sum = 1;
		int sum1 = 1;
		for (int i = 0; i < v2; i++) {
			sum *= v1 - i;
		}
		for (int j = 0; j < v2; j++) {
			sum1 *= v2 - j;
		}
		System.out.println((double) sum / sum1);

	}

}
