package com.imooc;

public class Telphone {
	//���캯��
	public Telphone() {
		System.out.println("���캯��ִ��");
	}
	//����
	float screen = 4.0f;
	float cpu = 1.0f;
	float mem = 2.0f;
	//����
	void call( ) {
		System.out.println("Telphone���д�绰�Ĺ���");
	}
    void sendMessage( ) {
    	System.out.println("Telphone���з����ŵĹ���");
    }
    void settings( ) {
    	System.out.println("�ֻ����õ���ĻΪ:"+screen);
    }

}
