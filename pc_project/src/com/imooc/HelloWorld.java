/*static变量、方法的使用*/
package com.imooc;

public class HelloWorld {
	static String hobby = "imooc";
	String name;
	{
		name = "慕课网";
	}
	//定义内部类，这是一个成员内部类
	private class Inner {
		//内部类的方法
		private void show() {
			System.out.println("welcome to imooc!");
		}
	}
	static void print( ) {
		System.out.println("静态方法中调用静态变量:"+hobby);
//		System.out.println("静态方法中调用非静态变量:"+name);
		/*静态方法中不能调用非静态变量的原因是，静态方法在初始化时就分配了内存空间，但是非静态变量不会，因此此时调用非静态变量，由于没有实例化，该变量在内存中无法访问*/
	}
	void printExtern( ) {
		System.out.println("非静态方法中调用非静态变量:"+name);
		System.out.println("非静态方法中调用静态变量:"+hobby);
	}

public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		System.out.println("使用类名访问hobby:"+HelloWorld.hobby);
		HelloWorld hello = new HelloWorld();
		System.out.println("使用对象名来访问hobby:"+hello.hobby);
		hello.hobby = "爱慕课";
		HelloWorld.hobby = "爱慕课";
		System.out.println("使用对象名来访问hobby:"+hello.hobby);
		System.out.println("使用类名访问hobby:"+HelloWorld.hobby);*/
		HelloWorld.print();
		HelloWorld hello = new HelloWorld();
		hello.printExtern();
		Inner i = hello.new Inner();
		i.show();
	}

}
