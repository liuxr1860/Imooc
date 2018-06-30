package com.imooc;

public class StaticInJava {
	/*静态变量*/
	static int a = 1;
	int b = 2;
	public StaticInJava() {
		a =2;
		System.out.println("构造函数中访问静态 变量 a= "+a);
	}

	/*静态方法*/
	static void staticShow() {
		System.out.println("静态方法中访问 静态变量 a= "+a);
		StaticInJava inStatic = new StaticInJava();
		System.out.println("静态方法中访问 非静态变量b = "+inStatic.b);
	}
	/*普通方法*/
	void normalShow() {
		System.out.println("普通方法中访问变量静态a= "+a);
		System.out.println("静态方法中访问 非静态变量b = "+b);
	}
	/*静态块*/
	static {
		a =3;
		System.out.println("静态块中访问变量a=  "+a);
	}

}
/*Java static的使用心得*/
/*1、静态只能访问静态
 2、非静态可以访问静态和非静态
 3、如果一定要在静态方法中访问非静态，必须实例化后访问*/ 
 