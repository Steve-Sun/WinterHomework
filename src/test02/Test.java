package test02;

import java.util.ArrayList;

/*
 �����������󣬲��ô���ʵ�֣�
	(1)���������ַ�������{"010","3223","666","7890987","123123"}
	(2)�жϸ������ַ��������е������ַ����Ƿ��ǶԳ�
	(��һ�����ֺ����һ��������ȣ��ڶ������ֺ͵����ڶ�����������ȵģ���������)�ģ�
	��������
	(3)�磺010 �ǶԳƵģ�3223 �ǶԳƵģ�123123 ���ǶԳƵ�
	(4)���մ�ӡ�������жԳ��ַ����ĸ���
	
	��ʾ��ѭ����ȡ�ַ�����ÿһ���ַ������αȽϵ�һ�������һ�����ڶ����͵����ڶ���������
 */
public class Test {

	public static void main(String[] args) {
		String[] strArray = {"010","3223","666","7890987","123123"};
		checkSymmetry(strArray);
	}

	private static void checkSymmetry(String[] strArray) {
		int count = 0;
		for (String string : strArray) {
			//ֱ�ӵ���check�Ƿ���ȼ���
			StringBuffer checkArray = new StringBuffer();
			checkArray.append(string);
			String check = checkArray.reverse().toString();
			if (string.equals(check)) {
				System.out.println(string+" �ǶԳƵ� ");
				count++;
				continue;
				
			}
			System.out.println(string+" �ǲ��ԳƵ� ");
		}
		System.out.println("�ԳƵ��ַ����� " + count + " ��");
	}

}
