/*static������������ʹ��*/
package com.imooc;

public class HelloWorld {
	static String hobby = "imooc";
	String name;
	{
		name = "Ľ����";
	}
	//�����ڲ��࣬����һ����Ա�ڲ���
	private class Inner {
		//�ڲ���ķ���
		private void show() {
			System.out.println("welcome to imooc!");
		}
	}
	static void print( ) {
		System.out.println("��̬�����е��þ�̬����:"+hobby);
//		System.out.println("��̬�����е��÷Ǿ�̬����:"+name);
		/*��̬�����в��ܵ��÷Ǿ�̬������ԭ���ǣ���̬�����ڳ�ʼ��ʱ�ͷ������ڴ�ռ䣬���ǷǾ�̬�������ᣬ��˴�ʱ���÷Ǿ�̬����������û��ʵ�������ñ������ڴ����޷�����*/
	}
	void printExtern( ) {
		System.out.println("�Ǿ�̬�����е��÷Ǿ�̬����:"+name);
		System.out.println("�Ǿ�̬�����е��þ�̬����:"+hobby);
	}

public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		System.out.println("ʹ����������hobby:"+HelloWorld.hobby);
		HelloWorld hello = new HelloWorld();
		System.out.println("ʹ�ö�����������hobby:"+hello.hobby);
		hello.hobby = "��Ľ��";
		HelloWorld.hobby = "��Ľ��";
		System.out.println("ʹ�ö�����������hobby:"+hello.hobby);
		System.out.println("ʹ����������hobby:"+HelloWorld.hobby);*/
		HelloWorld.print();
		HelloWorld hello = new HelloWorld();
		hello.printExtern();
		Inner i = hello.new Inner();
		i.show();
	}

}
