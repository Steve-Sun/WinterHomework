package test01;

import java.util.Scanner;

/*
 �����������󣬲��ô���ʵ�֣�
	(1)�������·���public static String getPropertyGetMethodName(String property);
	(2)�÷����Ĳ���ΪString���ͣ���ʾ�û������ĳ�Ա���������֣�
	����ֵ����ΪString���ͣ�����ֵΪ��Ա������Ӧ��get����������
	(3)�磺�û����ô˷���ʱ�����Ĳ���Ϊ"name",�÷����ķ���ֵΪ"getName"
*/
public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the name of varibale :");
		String name = sc.next();
		String getName = getPropertyGetMethodName(name);
		System.out.println(getName);
	}

	private static String getPropertyGetMethodName(String name) {
		String start = name.substring(0,1);
		String end = name.substring(1);
		String big = start.toUpperCase();
		String small = end.toLowerCase();
		return "get"+big+small;
	}
}
