/*static������������ʹ��*/
package com.imooc;

public class HelloWorld {
	static String hobby = "zte";
	String name;
	{
		name = "����ͨѶ";
	}
	// �ⲿ���е�show����
    public void show() { 
		// �����ڲ��࣬���Ƿ����ڲ���
		class MInner {
			int score = 83;
			public int getScore() {
				return score + 10;
			}
		}
        // ���������ڲ���Ķ���
        MInner mi = new MInner();
        // �����ڲ���ķ���
		int newScore = mi.getScore();        
		System.out.println("������" + name + "\n�ӷֺ�ĳɼ���" + newScore);
	}
	//�����ڲ��࣬����һ����Ա�ڲ���
	private class Inner {
		//�ڲ���ķ���
		private void show() {
			System.out.println("this is normal inner class!");
		}
	}
	//����һ����̬�ڲ���
	static class InnerExt {
		void show() {
			System.out.println("this is static inner class!");
		}
		
	}
	static void print( ) {
		System.out.println("��̬�����е��þ�̬����:"+hobby);
//		System.out.println("��̬�����е��÷Ǿ�̬����:"+name);
		/*��̬�����в��ܵ��÷Ǿ�̬������ԭ���ǣ���̬�����ڳ�ʼ��ʱ�ͷ������ڴ�ռ䣬���ǷǾ�̬�������ᣬ��˴�ʱ���÷Ǿ�̬����������û��ʵ�������ñ������ڴ����޷�����*/
	}
//����һ�������ڲ��࣬����Ҫ����ѧϰ
	class UnnamedClass {
		
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
	    System.out.println("2018-0625��");
		HelloWorld.print();
		HelloWorld hello = new HelloWorld();
		hello.printExtern();
		/*�ڲ����ʹ��һ��Ҫ���ⲿ��Ķ��������г�ʼ��*/
		Inner i = hello.new Inner();
		/*��̬�ڲ���ĳ�ʼ������Ҫ�ⲿ����*/
		InnerExt j = new InnerExt();
		i.show();
		j.show();
		// �����ⲿ��Ķ���
        HelloWorld mo = new HelloWorld();
        // �����ⲿ��ķ���
		mo.show();
	}

}
