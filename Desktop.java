package org.comp;

public class Desktop implements Hardware,Software{

	@Override
	public void softwareResource() {
		System.out.println("Windows 11");
	}

	@Override
	public void hardwareResource() {
		System.out.println("intel core i7");
	}
	
private void desktopmodel() {
	System.out.println("HP DESKTOP");
}
public static void main(String[] args) {
	Desktop d=new Desktop();
	d.desktopmodel();
	d.hardwareResource();
	d.softwareResource();
	
	
}

}
