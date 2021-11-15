package week3.day1;

public class AndroidPhone extends Mobile {

	public void takeVideo() {
		System.out.println("Take Video");

	}
	
	public static void main(String[] args) {
	
		AndroidPhone myAndroidPhone = new AndroidPhone();
		
		myAndroidPhone.takeVideo();
		
		myAndroidPhone.sendMsg();
		myAndroidPhone.makeCall();
		myAndroidPhone.saveContact();		
		

	}

}
