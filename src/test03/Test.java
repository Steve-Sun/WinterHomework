package test03;

import java.util.Scanner;

/*
  �����������󣬲��ô���ʵ�֣�
	(1)�Ӽ���ѭ��¼��¼��һ���ַ���,����"end"��ʾ����
	(2)���ַ����д�д��ĸ���Сд��ĸ��Сд��ĸ��ɴ�д��ĸ��
	�����ַ���"*"����,��ͳ����ĸ�ĸ���
		����:
			����¼�룺Hello12345World
			��������hELLO*****wORLD
					  �ܹ�10����ĸ
 */
public class Test {

	public static void main(String[] args) {
		StringBuffer input = inputString();
		changeCaseOfString(input.toString());
	}
	
	//��Сдת��,������*���
	private static void changeCaseOfString(String inputString) {
		StringBuffer string = new StringBuffer();
		int count = 0;
		for (int i=0; i < inputString.length(); i++) {
			char ch = inputString.charAt(i); 
			if (ch>='A' && ch<='Z') {
				string.append((ch + "").toLowerCase());
				count++;
			} else if (ch>='a' && ch<='z') {
				string.append((ch + "").toUpperCase());
				count++;
			} else {
				string.append("*");
			}
		}
		System.out.println(string.toString());
		System.out.println("�ܹ�"+count+"����ĸ");
		return;
	}
	
	//ѭ������
	private static  StringBuffer inputString() {
		StringBuffer string = new StringBuffer();
		Scanner sc = new Scanner(System.in);
        String str=null;  
		while (true) {
			System.out.println("�������ַ��� ��"); 
			String input = sc.nextLine(); 
			if (input.equals("end")) {
				System.out.println("�������");
				break;
			}
			string.append(input);
		}
		return string;
	}

}
