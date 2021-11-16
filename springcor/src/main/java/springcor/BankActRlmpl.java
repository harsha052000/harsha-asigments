package springcor;

public  abstract class BankActRlmpl implements ActBankR {
	private void BankAccRepositoryImpl(){
		  ActBank bankaccount = new ActBank();
		  bankaccount.setAccountHolderName("Mounika");
		  bankaccount.setAccountId(65);
		  bankaccount.setAccountType("Savings");
		  bankaccount.setAccountBalance((long) 20345.5);
		  }

}
