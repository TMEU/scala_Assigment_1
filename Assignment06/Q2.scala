object case_class_q2 extends App{
	val p_1 = Point(3,8)
	
	println(p_1)
	println(p_1.move(2,3))
}

case class Point(x:Int,y:Int){
	
	def move(dx:Int,dy:Int)= Point(this.x+dx,this.y+dy)
}