package test11;

import java.util.Scanner;

/*
  �ӿ���̨����һ���ַ���
	(1)�����ַ���ת�����ַ�����
	(2)�����ַ������±�Ϊż�����ַ���ӡ������̨
	(3)�����ַ�����ĵ�һ��Ԫ�������һ��Ԫ�ػ���
 */
public class Test {

	public static void main(String[] args) {
		String input = inputString();
		operateString(input);
	}

	private static void operateString(String input) {
		//(1)�����ַ���ת�����ַ�����
		char[] charArrar = input.toCharArray();
		int index = 0;
		//(2)�����ַ������±�Ϊż�����ַ���ӡ������̨
		System.out.println("�±�Ϊż����Ԫ�أ�");
		for (char ch : charArrar) {
			if (index % 2 == 0) {
				System.out.print(ch + " ");
			}
			index++;
		}
		System.out.println("");
		//(3)�����ַ�����ĵ�һ��Ԫ�������һ��Ԫ�ػ���
		char c = charArrar[0];
		charArrar[0] = charArrar[charArrar.length - 1];
		charArrar[charArrar.length - 1] = c ;
		System.out.println("��һ��Ԫ�������һ��Ԫ�ػ���");
		for (char i : charArrar) {
			System.out.print(i);
		}
	}

	//�����ַ���
	private static String inputString() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������ַ�����");
		String string = sc.nextLine();
		return string;	
	}
	
}
