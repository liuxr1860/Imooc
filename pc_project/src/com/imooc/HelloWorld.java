/*static变量、方法的使用*/
package com.imooc;

public class HelloWorld {
	static String hobby = "zte";
	String name;
	{
		name = "中兴通讯";
	}
	// 外部类中的show方法
    public void show() { 
		// 定义内部类，这是方法内部类
		class MInner {
			int score = 83;
			public int getScore() {
				return score + 10;
			}
		}
        // 创建方法内部类的对象
        MInner mi = new MInner();
        // 调用内部类的方法
		int newScore = mi.getScore();        
		System.out.println("姓名：" + name + "\n加分后的成绩：" + newScore);
	}
	//定义内部类，这是一个成员内部类
	private class Inner {
		//内部类的方法
		private void show() {
			System.out.println("this is normal inner class!");
		}
	}
	//这是一个静态内部类
	static class InnerExt {
		void show() {
			System.out.println("this is static inner class!");
		}
		
	}
	static void print( ) {
		System.out.println("静态方法中调用静态变量:"+hobby);
//		System.out.println("静态方法中调用非静态变量:"+name);
		/*静态方法中不能调用非静态变量的原因是，静态方法在初始化时就分配了内存空间，但是非静态变量不会，因此此时调用非静态变量，由于没有实例化，该变量在内存中无法访问*/
	}
//这是一个匿名内部类，还需要继续学习
	class UnnamedClass {
		
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
	    System.out.println("2018-0625打卡");
		HelloWorld.print();
		HelloWorld hello = new HelloWorld();
		hello.printExtern();
		/*内部类的使用一定要用外部类的对象来进行初始化*/
		Inner i = hello.new Inner();
		/*静态内部类的初始化不需要外部对象*/
		InnerExt j = new InnerExt();
		i.show();
		j.show();
		// 创建外部类的对象
        HelloWorld mo = new HelloWorld();
        // 调用外部类的方法
		mo.show();
	}

}
