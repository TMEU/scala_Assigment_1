import scala.io.StdIn.readInt
object Q05 extends App{

	println("Enter a number :");

	var number = readInt();

	def isEven(number : Int) : Boolean = number match{

		case 0 => true
		case _ => isOdd(number-1)
	}

	def isOdd(number : Int) : Boolean = !(isEven(number))

	def evenSum(number: Int, t:Int=0) : Unit = {

		if(number== -1)println(t)

		else{

			if(isEven(number)) evenSum(number-1,t+number)

			else evenSum(number-1,t)
		}
	}
	evenSum(8)
}