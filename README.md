# WinterHomework
The winter homework of Itheima 
1.分析以下需求，并用代码实现：
	(1)定义如下方法public static String getPropertyGetMethodName(String property);
	(2)该方法的参数为String类型，表示用户给定的成员变量的名字，返回值类型为String类型，返回值为成员变量对应的get方法的名字
	(3)如：用户调用此方法时给定的参数为"name",该方法的返回值为"getName"
	
2.分析以下需求，并用代码实现：
	(1)定义数字字符串数组{"010","3223","666","7890987","123123"}
	(2)判断该数字字符串数组中的数字字符串是否是对称(第一个数字和最后一个数字相等，第二个数字和倒数第二个数字是相等的，依次类推)的，并逐个输出
	(3)如：010 是对称的，3223 是对称的，123123 不是对称的
	(4)最终打印该数组中对称字符串的个数
	
	提示：循环获取字符串的每一个字符，依次比较第一个和最后一个，第二个和倒数第二个。。。
	
3.分析以下需求，并用代码实现：
	(1)从键盘循环录入录入一个字符串,输入"end"表示结束
	(2)将字符串中大写字母变成小写字母，小写字母变成大写字母，其它字符用"*"代替,并统计字母的个数
		举例:
			键盘录入：Hello12345World
			输出结果：hELLO*****wORLD
					  总共10个字母
					  
4.分析以下需求，并用代码实现：
	(1)从键盘循环录入录入一个字符串,输入"end"表示结束
	(2)定义一个方法
		public Object[] deleteSubString(String str1,String str2) {
	
		}
	(3)方法功能描述:从str1中删除所有的str2,并返回删除后的结果,返回结果为Object[]数组
		* 该数组的第一个元素为删除所有的str2后的最终的字符串
		* 该数组的第二个元素为删除的str2的个数		

5.关于String类的练习题，分析运行结果？
	public class Test01 {	
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
		private static void demo3() {//==比较的是地址值
			String s1 = new String("abc");				
			String s2 = "abc";					
			System.out.println(s1 == s2); 			
			System.out.println(s1.equals(s2)); 		
		}
		private static void demo2() {
			//创建几个对象
			//创建两个对象,一个在常量池中,一个在堆内存中
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
	
6 检查QQ号码是否合法(5-10位纯数字组成，0不能开头)的正则表达式如何编写？
7  Hello12345World6789012"将所有数字替换掉
   String类方法replaceAll(正则规则,替换后的新字符串)


8.将"zhang wei zhen shuai zhang wei fei chang shuai"每个单词的首字母转换成大写其余还是小写字母(不许直接输出Zhang Wei Zhen Shuai Zhang Wei Fei Chang Shuai要用代码实现)
(1)正常写法，什么方法都可以使用
（2）不允许使用toUpperCase() 和toLowerCase() 的方法
思路：
	先按照" "切割，返回一个字符串数组
	遍历这个数组，截取第一个，变成大写，再截取后面的变成小写。进行拼接。
	

9 有一个字符串"woaijavahahajavaaiwo"删除该字符串中所有的"java"并且统计删除了多少个“java


10 输入一个字符串,分别统计出其中英文字母、空格、数字和其它字符的数量



11 从控制台接受一串字符串(8分)
	(1)将该字符串转换成字符数组(2分)
	(2)将该字符数组下标为偶数的字符打印倒控制台(3分)
	(3)将该字符数组的第一个元素与最后一个元素互换(3分)


12 模拟验证手机号的过程，按照以下要求实现相关代码（友情提示：不一定要用正则）
	a.	提示用户在控制台输入手机号，用一个字符串对其进行保存
	b.	判断该手机号位数是否是11位
	c.	判断该手机号，是否都是数字
	d.	判断改手机号最后3为数字如果是相同数字则认为是靓号


记忆java基础和面向对象的知识点
