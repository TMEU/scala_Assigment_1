class rationalNumber(n:Int,d:Int){

 	require(d>0);
    def numer = n/gcd(n,d);
    def denom = d/gcd(n,d);
    

   // if(denom < 0){

    	//numer *= -1;  //both numer and denom are multiplied by negative
    	//denom *= -1;
  //  }


    def this(n:Int)=this(n,1);

    private def gcd(x:Int,y:Int):Int = if(y == 0) x else gcd(y, x % y);

    def neg = new rationalNumber(-this.numer, this.denom);

    override def toString= numer + "/" + denom;
}

object Q1
{
	def main(args : Array[String])
	{
		
		
		val rational1 = new rationalNumber(5,8);

		val rational2 = rational1.neg
		
		printf(" Neg : " + rational2);

		
	}

}