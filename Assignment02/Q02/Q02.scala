object Q02 extends App{

	def customer(price : Int): Int = ( 15-price)/5*20 + 120;

	def income(price : Int): Int  = customer(price)*price;

	def cost(price : Int): Int = customer(price) + 500;

	def profit(price : Int): Int = income(price) - cost(price);


	def outcome() {

		var a = 5;
		var b = profit(a);

		while( b < profit(a+5)) {

			b = profit(a+5);
			a = b+5;
		}

		println( "Best price = Rs. ",b);
		println(" Best ticket price = Rs. ",a);
	}

	outcome();


}