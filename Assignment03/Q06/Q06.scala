import scala.io.StdIn.readInt
object Q06 extends App{

	println("Enter a number :");

	var number = readInt()

	def fibo(number:Int) : Int = number match{

		case number if number==0 => 0
		case number if number==1 => 1
		case number => fibo(number-1) + fibo(number-2)
	}

	def fibo_sequence(number : Int) : Any={

		if(number>0) fibo_sequence(number-1)
			println(fibo(number))
	}

	println(fibo_sequence(number));
}