package test12;

import java.util.Scanner;

/*
  ģ����֤�ֻ��ŵĹ��̣���������Ҫ��ʵ����ش��루������ʾ����һ��Ҫ������
	a.	��ʾ�û��ڿ���̨�����ֻ��ţ���һ���ַ���������б���
	b.	�жϸ��ֻ���λ���Ƿ���11λ
	c.	�жϸ��ֻ��ţ��Ƿ�������
	d.	�жϸ��ֻ������3Ϊ�����������ͬ��������Ϊ������
 */
public class Test {

	public static void main(String[] args) {
		String phoneNumber = inputString();
		checkNumber(phoneNumber);
	}
	
	//�˶��ֻ����Ƿ������ʾ�淶
	private static void checkNumber(String input) {
		//�ж��Ƿ�Ϊ11λ����
		String regex = "[1][0-9]{10}";
		if (input.matches(regex)) {
			System.out.println("���ֻ��źϹ�");
			char a = input.charAt(8);
			char b = input.charAt(9);
			char c = input.charAt(10);
			if (a == b && a == c) {
				System.out.println("���ֻ���Ϊ����");
			}
		} else {
			System.out.println("���ֻ��Ų��Ϲ�");
		}
	}

	//�����ֻ���
	private static String inputString() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������ֻ��ţ�");
		String string = sc.nextLine();
		return string;	
	}
	
}
