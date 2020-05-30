import scala.io.StdIn.readInt
object Q03 extends App{

	println(" Enter a number : ");

	var number = readInt();

	def sum(number : Int) : Int = {

		number match {
			case 1 => 1 
			case _ => number + sum( number-1);
		}
	}

	println("Sum =" +sum(number));
}