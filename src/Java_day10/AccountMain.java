package Java_day10;

public class AccountMain {

	public static void main(String[] args) {
		
		Account accobj = new Account();
		
		accobj.setAcc_no(123456);
		accobj.setName("John");
		accobj.setAmount(5000.00);
		
		System.out.println(accobj.getAcc_no());
		System.out.println(accobj.getName());
		System.out.println(accobj.getAmount());

	}

}
