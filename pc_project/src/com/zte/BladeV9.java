package com.zte;

public class BladeV9 extends Blade {
	BladeV9(){
		System.out.println("子类无参构造方法");
	}
	BladeV9(String DeviceName,String CpuManufactory){
		System.out.println("有参的构造方法被调用");
		this.DeviceName = DeviceName;
		this.CpuManufactory = CpuManufactory;
		/*注意，static 方法中不允许使用this*/
	}
	String V9CPUInfo = "QCOM8940";
	void getProductName() {
		System.out.println("this is BladeV9");
	}

}
