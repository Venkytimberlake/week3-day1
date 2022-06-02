package week3.day1;

public class OverrideAxisbank extends OverrideBankinfo{

	public void deposit() {
		System.out.println("Deposit: 3000");
	}
	public static void main(String[] args) {
OverrideAxisbank ram=new OverrideAxisbank();
ram.deposit();
ram.saving();
ram.fixed();
	}

}
