object Lists {
  val mylist : List[Int] = List(0,1,2,3,4);
  var names : List[String] = List("Rahul","Max","Spring");
  def main(args : Array[String]){
    println(mylist);
    println(0:: names);
    println(0:: 7::6::7:: Nil);
    println(mylist.isEmpty);
    println(names.tail);
    println(mylist.max);
    println(List.fill(5)(13));
    println(names.reverse);
    println(mylist.reverse);
    println(mylist.min);
    println(names(0));
    println(names);
  }

}