package bank;

public class AxisBank extends BankInfo {
	
		public void deposit() {		
			System.out.println("Axis Bank Deposit");
		}
		
		public static void main(String[] args) {
			
			AxisBank Dep = new AxisBank();
					
			Dep.deposit();
			Dep.saving();
			Dep.fixed();
					
		}
}

