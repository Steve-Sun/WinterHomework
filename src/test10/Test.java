package test10;

import java.util.Scanner;

/*
  ����һ���ַ���,�ֱ�ͳ�Ƴ�����Ӣ����ĸ���ո����ֺ������ַ�������
 */
public class Test {

	public static void main(String[] args) {
		String string = inputString();
		countNumber(string);
	}
	
	//ͳ��,��toCharArray��������
	private static void countNumber(String string) {
		int countOfChar = 0;
		int countOfSpace = 0;
		int countOfNumber = 0;
		int countOfOthers = 0;
		char[] charArr = string.toCharArray();
		for (char ch : charArr) {
			if (ch >= 'a' && ch <= 'z' ) {
				countOfChar++;
			} else if (ch >= 'a' && ch <= 'z' ) {
				countOfChar++;
			} else if (ch >= '0' && ch <= '9' ) {
				countOfNumber++;
			} else if (ch == ' ') {
				countOfSpace++;
			} else {
				countOfOthers++;
			}
		}
		System.out.println("����Ӣ����ĸ��"+countOfChar+"�������֣�"+countOfNumber
				+"�����ո��"+countOfSpace+"���������ַ���"+countOfOthers+"��");
	}

	//�����ַ���
	private static String inputString() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������ַ�����");
		String string = sc.nextLine();
		return string;
	}
}
