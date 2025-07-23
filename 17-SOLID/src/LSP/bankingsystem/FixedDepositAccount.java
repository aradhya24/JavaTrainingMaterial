package LSP.bankingsystem;

public class FixedDepositAccount implements IDeposit {

	@Override
	public void deposit() {
        System.out.println("Fixed Deposit Acc allows Deposit..");
	}

}
