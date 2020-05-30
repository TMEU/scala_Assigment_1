object Q01 extends App {

	def normal_hours_payment(hours : Double) : Double = hours*150;

	def OT_hours_payment(hours : Double ) : Double = hours*75;

	def salary(normalhours : Double, othours : Double) : Double = normal_hours_payment(normalhours) + OT_hours_payment(othours);

	def tax_payment(salary : Double) : Double = salary*10/100;

	def take_home_salary(normalhours : Double, othours : Double) : Double = {

		salary(normalhours,othours) - tax_payment(salary(normalhours,othours));
	}


	println("Take home salary = Rs. "+" " + take_home_salary(40,20));


	
}