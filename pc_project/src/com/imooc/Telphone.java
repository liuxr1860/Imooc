package com.imooc;

public class Telphone {
	//构造函数
	public Telphone() {
		System.out.println("构造函数执行");
	}
	//属性
	float screen = 4.0f;
	float cpu = 1.0f;
	float mem = 2.0f;
	//方法
	void call( ) {
		System.out.println("Telphone具有打电话的功能");
	}
    void sendMessage( ) {
    	System.out.println("Telphone具有发短信的功能");
    }
    void settings( ) {
    	System.out.println("手机配置的屏幕为:"+screen);
    }

}
