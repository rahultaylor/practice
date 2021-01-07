object Arrays {
  var Rahul : Array[Int] = new Array[Int](5);
  def main(args: Array[String]): Unit ={
    Rahul(0) = 1;
    Rahul(1) = 2;
    Rahul(2) = 3;
    Rahul(3) = 4;
    Rahul(4) = 5;
    println(Rahul);
    Rahul(0)= 100;
    for (x<- Rahul){
      println(x);
    }
    for (i<- 0 to Rahul.length){
      println(i)
    }
  }

}
