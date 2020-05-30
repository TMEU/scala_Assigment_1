object cost extends App {
  def wholesale_cost (count:Int):Double =
  {
    var cover_price : Double = (24.95)*(0.6)*count;
    var shipping_cost : Double  = 0.0;

    if(count > 50) {
      shipping_cost= (3.00)+((count-50)*(0.75));
    }else
    {
      shipping_cost= 3.00;
    }

    var cost_of_books : Double = cover_price + shipping_cost ;
    return cost_of_books;
  }

  println ( "The cost of 60 books =  " + wholesale_cost(60) );
}
