package com.zte;

public class Blade {
	/*���캯��*/
	Blade(){
		System.out.println("�޲εĹ��췽��������");
	}
	Blade(String DeviceName,String CpuManufactory){
		System.out.println("�вεĹ��췽��������");
		this.DeviceName = DeviceName;
		this.CpuManufactory = CpuManufactory;
		/*ע�⣬static �����в�����ʹ��this*/
	}
	/*����*/
	String DeviceName="6739Device";
	String CpuManufactory = "MTK";
	int DPI = 320;
	float ROM = 32.0f;
	float RAM = 2.0f;
	/*����*/
	void getDeviceName() {
		System.out.println("DeviceName is:"+DeviceName);
	}
	void getCpuInfo() {
		System.out.println("CPU Manufactory is:"+CpuManufactory);		
	}
	float getDataSize(float systemSize) {
		/*��Ա����*/
		float dataSize = this.ROM - systemSize;
		return dataSize;
	}

}
