

object maximoDeDosNumeros {
  def max(x: Int, y: Int): Int = {
    if (x > y) x
    else y
  }
  def main(args: Array[String]) {
    println("El maximo entre 6 y 7 es ==> " + max(6,7))
  }
}