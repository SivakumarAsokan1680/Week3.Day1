package week3.day1;

public class SmartPhone extends AndroidPhone {

	private void connectWhatsApp() {
		System.out.println("Connect To Whats App");

	}
	public static void main(String[] args) {
	
		SmartPhone mySmartPhone = new SmartPhone();
		
		mySmartPhone.connectWhatsApp();
		
		mySmartPhone.takeVideo();
		
		mySmartPhone.sendMsg();
		mySmartPhone.makeCall();
		mySmartPhone.saveContact();
		
		

	}

}
