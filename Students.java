package week3.day1;

public class Students {
	
	public void getStudentInfo(long id) {
		System.out.println("ID: " +id);
	}
	
	public void getStudentInfo(long id, String name) {
		System.out.println("ID and Name:");
		System.out.println(id+" "+name);
	}
	
	public void getStudentInfo(String emailaddress, String phonenumber) {
		System.out.println("Email and Phone Number:");
		System.out.println(emailaddress+" "+phonenumber);
	}
	
	public static void main(String[] args) {
		Students student=new Students();
		student.getStudentInfo(12345);
		student.getStudentInfo(12345, "Sivakumar Asokan");
		student.getStudentInfo("sivakumarasokan@gmail.com", "9444186385");
	}

}
