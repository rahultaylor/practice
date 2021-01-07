object functions{


  def main(args: Array [String]){
    println(add.add(11,29));
    println(minus(29,10));
    println(mult(10,20));
    println(div(47,2));
  }
  object add{
    def add(x : Int ,y : Int):Int = {
      return x + y ;    //We can avoid return as last line of the function will be returned
    }
  }
  def minus(x : Int,y : Int){
    return x - y ;
  }
  def mult(x : Int,y : Int): Int ={
    x * y ;
  }
  def div(x : Float,y: Float): Float= {
    x / y;
  }
}