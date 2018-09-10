package com.zte;

public class Blade {
	/*构造函数*/
	Blade(){
		System.out.println("无参的构造方法被调用");
	}
	Blade(String DeviceName,String CpuManufactory){
		System.out.println("有参的构造方法被调用");
		this.DeviceName = DeviceName;
		this.CpuManufactory = CpuManufactory;
		/*注意，static 方法中不允许使用this*/
	}
	/*属性*/
	String DeviceName="6739Device";
	String CpuManufactory = "MTK";
	int DPI = 320;
	float ROM = 32.0f;
	float RAM = 2.0f;
	/*方法*/
	void getDeviceName() {
		System.out.println("DeviceName is:"+DeviceName);
	}
	void getCpuInfo() {
		System.out.println("CPU Manufactory is:"+CpuManufactory);		
	}
	float getDataSize(float systemSize) {
		/*成员变量*/
		float dataSize = this.ROM - systemSize;
		return dataSize;
	}

}
