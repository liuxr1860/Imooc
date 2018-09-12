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
/*		Blade newProduct = new BladeV9();
		newProduct.getProductName();
		newProduct = new BladeV8();
		newProduct.getProductName();*/
		/*多态的典型应用*/
		Blade P86F = new Blade();
		BladeV9 v9 = new BladeV9();
//		P86F = v9;
//		
		P86F.getProductName();
//		P86F.call();
		v9.call();
		if(P86F instanceof BladeV9) {
			System.out.println("可以转换");
			v9 = (BladeV9)P86F;
			
		}else {
			System.out.println("不能转换");
		}

	}

}
