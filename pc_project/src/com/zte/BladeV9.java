package com.zte;

public class BladeV9 extends Blade {
	BladeV9(){
		System.out.println("�����޲ι��췽��");
	}
	BladeV9(String DeviceName,String CpuManufactory){
		System.out.println("�вεĹ��췽��������");
		this.DeviceName = DeviceName;
		this.CpuManufactory = CpuManufactory;
		/*ע�⣬static �����в�����ʹ��this*/
	}
	String V9CPUInfo = "QCOM8940";
	void getProductName() {
		System.out.println("this is BladeV9");
	}

}
