package test08;

import javax.swing.text.StyledEditorKit.ForegroundAction;

/*
  将"zhang wei zhen shuai zhang wei fei chang shuai"每个单词的首字母转换成大写
  其余还是小写字母(不许直接输出Zhang Wei Zhen Shuai Zhang Wei Fei Chang Shuai要用代码实现)
 (1)正常写法，什么方法都可以使用
（2）不允许使用toUpperCase() 和toLowerCase() 的方法
思路：
	先按照" "切割，返回一个字符串数组
	遍历这个数组，截取第一个，变成大写，再截取后面的变成小写。进行拼接。	
 */
public class Test {

	public static void main(String[] args) {
		String string = "zhang wei zhen shuai zhang wei fei chang shuai";
		changeToUpperCase(string);
	}

	private static void changeToUpperCase(String string) {
		String regex = " ";
		StringBuffer buffer = new StringBuffer();
		//分割string
		String[] stringArr = string.split(regex);
		int index = 0;
		for (String string2 : stringArr) {
			//利用ascii码表，小转大-32，大转小+32
			char ch = (char) (string2.charAt(0) - 32);
			String substring = string2.substring(1);
			//合成新的element
			stringArr[index] = ch + substring;
			//为了打印方便利用StringBuffer
			buffer.append(stringArr[index]+" ");
			index++;
		}
		System.out.println(buffer.toString());
	}
	
}
