package test04;

import java.util.Scanner;

/*
  �����������󣬲��ô���ʵ�֣�
	(1)�Ӽ���ѭ��¼��¼��һ���ַ���,����"end"��ʾ����
	(2)����һ������
		public Object[] deleteSubString(String str1,String str2) {
	
		}
	(3)������������:��str1��ɾ�����е�str2,������ɾ����Ľ��,���ؽ��ΪObject[]����
		* ������ĵ�һ��Ԫ��Ϊɾ�����е�str2������յ��ַ���
		* ������ĵڶ���Ԫ��Ϊɾ����str2�ĸ���	
 */
public class Test {

	public static void main(String[] args) {
		String input = inputString();
		String delet = deleteString();
		Object[] objectArray = deleteSubString(input,delet);
		
	}

	//����һ������public Object[] deleteSubString(String str1,String str2)
	private static Object[] deleteSubString(String input, String delet) {
		Object[] object = new Object[2];
		int beginIndex = 0;
		int count =0;
		String inputString = input;
		while (inputString.contains("java")) {
			beginIndex = inputString.indexOf("java");
			inputString = inputString.substring(beginIndex + 4);
			count++;
		}
		object[0] = input.replaceAll(delet, "");
		object[1] = count;
		return object;
	}

	//������Ҫɾ�����ַ���
	private static String deleteString() {
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ҫɾ�����ַ�����");
		String string = sc.nextLine(); 
		return string;
	}

	//ѭ������
	private static  String inputString() {
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
		return string.toString();
	}

}