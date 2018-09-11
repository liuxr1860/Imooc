package com.zte;

public class InitialBlade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Blade A530 = new Blade();
//		Blade A531 = new Blade("A531","MTK");
//		A530.getDeviceName();
//		A531.getDeviceName();
//		A531.getCpuInfo();
/*		BladeV9 V9 = new BladeV9("V9","QCOM");
		V9.getDeviceName();
	V9.getCpuInfo();*/	
		
//		Blade V9vita = new BladeV9();
//		V9vita.getDeviceName();/*方法的多态*/
		Blade newProduct = new BladeV9();
		newProduct.getProductName();
		newProduct = new BladeV8();
		newProduct.getProductName();
		/*多态的典型应用*/

	}

}
