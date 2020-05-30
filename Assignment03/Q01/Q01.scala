object Q01 extends App{

	def gcd(a:Int,b:Int) : Int=b match{

		case 0 => a
		case x if x>a => gcd(x,a)
		case _ => gcd(b,a%b)
	}

	def prime(n:Int, i : Int=2) : Boolean = i match{

		case x if(x==n) => true
		case x if gcd(n,x)>1 => false
		case x => prime(n,x+1)
	}

	println(prime(7));
	println(prime(2));
}