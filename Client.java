
public class Client {

	public static void main(String[] args) {
		ICICIBank bank = new ICICIBank();
		
		System.out.println(bank.createAccount(101, 3000));
		System.out.println(bank.createAccount(102, 3000));
		
		/*try
		{
			System.out.println("Balance = "+bank.withdrawAmount(101, 20000));
		}catch(InvalidAccountNumberException ian)
		{
			System.out.println("invalid account number");
		}catch(InsufficientBalanceException ibe)
		{
			System.out.println("Insufficient balance ");
		}*/
		
		BankRunner bankRunner = new BankRunner(bank);
		
		Thread childThread1=new Thread(bankRunner,"first");
		childThread1.start();
		
		Thread childThread2=new Thread(bankRunner,"second");
		childThread2.start();
		
		

	}

}
