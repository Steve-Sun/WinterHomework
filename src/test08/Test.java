package test08;

import javax.swing.text.StyledEditorKit.ForegroundAction;

/*
  ��"zhang wei zhen shuai zhang wei fei chang shuai"ÿ�����ʵ�����ĸת���ɴ�д
  ���໹��Сд��ĸ(����ֱ�����Zhang Wei Zhen Shuai Zhang Wei Fei Chang ShuaiҪ�ô���ʵ��)
 (1)����д����ʲô����������ʹ��
��2��������ʹ��toUpperCase() ��toLowerCase() �ķ���
˼·��
	�Ȱ���" "�и����һ���ַ�������
	����������飬��ȡ��һ������ɴ�д���ٽ�ȡ����ı��Сд������ƴ�ӡ�	
 */
public class Test {

	public static void main(String[] args) {
		String string = "zhang wei zhen shuai zhang wei fei chang shuai";
		changeToUpperCase(string);
	}

	private static void changeToUpperCase(String string) {
		String regex = " ";
		StringBuffer buffer = new StringBuffer();
		//�ָ�string
		String[] stringArr = string.split(regex);
		int index = 0;
		for (String string2 : stringArr) {
			//����ascii���Сת��-32����תС+32
			char ch = (char) (string2.charAt(0) - 32);
			String substring = string2.substring(1);
			//�ϳ��µ�element
			stringArr[index] = ch + substring;
			//Ϊ�˴�ӡ��������StringBuffer
			buffer.append(stringArr[index]+" ");
			index++;
		}
		System.out.println(buffer.toString());
	}
	
}
