object case_class_q1 extends App{
	val p_1 = Point(9,3)
	val p_2 = Point(1,7)
	
	println("Addition : "+p_1.add(p_2))
	
}

case class Point(x:Int,y:Int){
	
	def add(that:Point) = Point(this.x+that.x,this.y+that.y)
}