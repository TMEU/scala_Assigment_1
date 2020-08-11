object case_class_q3 extends App{
	val p_1 = Point(2,7)
	val p_2 = Point(1,9)
	
	println("Distance between points "+p_1.distance(p_2))
}

case class Point(x:Int,y:Int){
	
	def distance(that:Point)= math.sqrt((this.x-that.x)*(this.x-that.x)+(this.y-that.y)*(this.y-that.y))
}