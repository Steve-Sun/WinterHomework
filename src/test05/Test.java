package test05;
/*
 *	关于String类的练习题，分析运行结果？
 *	
 *	demo1	都在常量池true，true	
 *	demo2	创建两个对象,"abc"在常量池中,new String在堆内存中
 *	demo3	new了一个新对象false，ture
 *	demo4	编译时确定，直接引用常量池true，true
 *	demo5	s1+"c"在编译器无法确定false，ture
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
		//==比较的是地址值
		String s1 = new String("abc");				
		String s2 = "abc";					
		System.out.println(s1 == s2); 			
		System.out.println(s1.equals(s2)); 		
	}
	private static void demo2() {
		//创建几个对象		
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