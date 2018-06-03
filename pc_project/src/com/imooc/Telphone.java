package com.imooc;

public class Telphone {
	//构造函数
	Telphone() {
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

}
