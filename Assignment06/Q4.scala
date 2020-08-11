object case_class_q4 extends App{
	val p_1 = Point(2,8)
	
	println("Inverse : "+p_1.invert)
}

case class Point(x:Int,y:Int){
	
	def invert = Point(y,x)
	
}