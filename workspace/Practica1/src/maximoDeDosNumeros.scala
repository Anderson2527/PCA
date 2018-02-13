

object maximoDeDosNumeros {
  
  def max(x: Int, y: Int): Int = {
    if (x > y) x
    else y
  }
  
  def main(args: Array[String]) {
    
    val num = max(6,7)
    println(s"El maximo entre 6 y 7 es ==>  $num")
  }
}