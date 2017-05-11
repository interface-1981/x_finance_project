package finance.common.types;

public  enum LoanOrDeposit {
	Loan("Rec", "Loan"),
	Deposit("Pay", "Deposit");
	public String payOrRec;
	public String position;
	private LoanOrDeposit(String payOrRec, String position) {

		this.payOrRec = payOrRec;
		this.position = position;
	}
}