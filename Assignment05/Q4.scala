object Q4{
	
	class Account(id: String, num: Int, bal: Double){

		 private val accountNumber: Int = number;
		 private val nicNumber: String = id;
		 private var accountBalance: Double = balance;
		 
		 def getAccountNumber = this.accountNumber;
		 def getNICNumber = this.nicNumber;
		 def getAccountBalance = this.accountBalance;
		 
		 def deposit(am: Double) = this.accountBalance = this.accountBalance + am;
		 def withdraw(am: Double) = this.accountBalance = this.accountBalance - am;
		 def transfer(that: Account, am: Double) = {this.withdraw(am); that.deposit(am);}
		 
		 override def toString = nicNumber + " : " + accountNumber.toString + " : Rs." + accountBalance.toString;
		
	
	}

	def main(args: Array[String]): Unit = {
		
		val acc1 = new Account("976839301V", 159994, 204.5);
		val acc2 = new Account("904657231V", 252641, 191.45);

		printf("Account Acc1 = %s\nAccount Acc2 = %s\n\n", acc1.toString, acc2.toString);
		printf("Transfering Rs.50 from Acc2 to Acc1:\n");

		acc2.transfer(acc1, 50);
		printf("\t%s\n\t%s\n", acc1.toString, acc2.toString);
		
		
		var bank : List[Account] = List(
			new Account("976839301V", 159994, 204.5),
			new Account("904657231V", 252641, 191.45),
			new Account("625673647V", 273632, -12.65),
			new Account("534389474V", 398734, 2435.80)
			
		);
		
	
	}
}