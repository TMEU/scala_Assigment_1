object volume extends App {

  def volume_of_sphere(r:Double):Double =
  {
    var volume : Double = (4.0/3.0)(22.0/7.0)(r*r*r);
    return volume;
  }

  println("sphere volume - radius 5 = " + volume_of_sphere(5));
}
