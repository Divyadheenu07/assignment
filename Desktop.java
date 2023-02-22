package org.system;

public class Desktop extends Computer{
	public void desktopsize() {
		String Size ="12 inches";
		System.out.println("The size of the desktop is "+Size);
	}
	public static void main(String[] args) {
		Desktop specifications=new Desktop();
		specifications.computerModel();
		specifications.desktopsize();
	}

}
