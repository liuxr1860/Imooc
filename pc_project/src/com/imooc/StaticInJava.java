package com.imooc;

public class StaticInJava {
	/*��̬����*/
	static int a = 1;
	int b = 2;
	public StaticInJava() {
		a =2;
		System.out.println("���캯���з��ʾ�̬ ���� a= "+a);
	}

	/*��̬����*/
	static void staticShow() {
		System.out.println("��̬�����з��� ��̬���� a= "+a);
		StaticInJava inStatic = new StaticInJava();
		System.out.println("��̬�����з��� �Ǿ�̬����b = "+inStatic.b);
	}
	/*��ͨ����*/
	void normalShow() {
		System.out.println("��ͨ�����з��ʱ�����̬a= "+a);
		System.out.println("��̬�����з��� �Ǿ�̬����b = "+b);
	}
	/*��̬��*/
	static {
		a =3;
		System.out.println("��̬���з��ʱ���a=  "+a);
	}

}
/*Java static��ʹ���ĵ�*/
/*1����ֻ̬�ܷ��ʾ�̬
 2���Ǿ�̬���Է��ʾ�̬�ͷǾ�̬
 3�����һ��Ҫ�ھ�̬�����з��ʷǾ�̬������ʵ���������*/ 
 