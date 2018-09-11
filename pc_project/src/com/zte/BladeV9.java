package com.zte;

public class BladeV9 extends Blade {
	BladeV9(String DeviceName,String CpuManufactory){
		System.out.println("有参的构造方法被调用");
		this.DeviceName = DeviceName;
		this.CpuManufactory = CpuManufactory;
		/*注意，static 方法中不允许使用this*/
	}

}
