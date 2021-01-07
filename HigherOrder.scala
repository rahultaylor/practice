object HigherOrder {
  def math(x : Double,y: Double, z: Double, f : (Double,Double) => Double) : Double = f(f(x,y),z) ;
  def main(args: Array[String]): Unit ={
    val result = math (10,20,30,(x,y) => x max y);
    println(result);
  }
}
