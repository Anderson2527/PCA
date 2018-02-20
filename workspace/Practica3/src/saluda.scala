
object saluda {
  
    def main(args: Array[String]) {
     
  val saludos = new Array[String](3)
    saludos.update(0, "Hello")
    saludos.update(1, "Hola")
    saludos.update(2, "Ciao")
    for (i <- 0.to(2))
      print (saludos.apply(i))
   
   }

}