package LSP.bankingsystem;

public class SavingDepositAccount implements IDeposit,IWithdraw{

	@Override
	public void withdraw() {
		System.out.println("Saving Deposit Acc allows Deposit..");
	}

	@Override
	public void deposit() {
		System.out.println("Saving Deposit Acc allows Withdraw..");
	}

}
