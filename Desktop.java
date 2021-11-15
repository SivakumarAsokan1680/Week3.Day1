package org.system;

public class Desktop extends Computer {

	public void desktopSize() {
		System.out.println("15 Inch");

	}	public static void main(String[] args) {
	
		Desktop myDesktop = new Desktop();
		myDesktop.computerModel();
		myDesktop.desktopSize();
}
}