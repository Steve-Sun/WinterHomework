package test05;
/*
 *	����String�����ϰ�⣬�������н����
 *	
 *	demo1	���ڳ�����true��true	
 *	demo2	������������,"abc"�ڳ�������,new String�ڶ��ڴ���
 *	demo3	new��һ���¶���false��ture
 *	demo4	����ʱȷ����ֱ�����ó�����true��true
 *	demo5	s1+"c"�ڱ������޷�ȷ��false��ture
 * 
 */
public class Test {	
	public static void main(String[] args) {
		//demo1(); 
		//demo2();
		//demo3();
		//demo4();
		demo5();
	}
	private static void demo5() {
		String s1 = "ab";
		String s2 = "abc";
		String s3 = s1 + "c";
		System.out.println(s3 == s2);
		System.out.println(s3.equals(s2)); 	
	}
	private static void demo4() {
		//byte b = 3 + 4;						
		String s1 = "a" + "b" + "c";
		String s2 = "abc";
		System.out.println(s1 == s2); 			
		System.out.println(s1.equals(s2)); 		
	}
	private static void demo3() {
		//==�Ƚϵ��ǵ�ֵַ
		String s1 = new String("abc");				
		String s2 = "abc";					
		System.out.println(s1 == s2); 			
		System.out.println(s1.equals(s2)); 		
	}
	private static void demo2() {
		//������������		
		String s1 = new String("abc");		
		System.out.println(s1);
	}
	private static void demo1() {				
		String s1 = "abc";
		String s2 = "abc";
		System.out.println(s1 == s2); 			
		System.out.println(s1.equals(s2)); 		
	}
}