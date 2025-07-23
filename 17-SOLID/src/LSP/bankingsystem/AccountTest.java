package LSP.bankingsystem;

public class AccountTest {
    public static void main(String[] args) {
		SavingDepositAccount savingDepositAccount = new SavingDepositAccount();
		savingDepositAccount.deposit();
		savingDepositAccount.withdraw();
		
		FixedDepositAccount fixedDepositAccount = new FixedDepositAccount();
		fixedDepositAccount.deposit();
	}
}
