import scala.io.StdIn.{ readLine, readInt } // Para lectura de datos
import scala.math._ // Para funciones matem�ticas
import scala.collection.mutable.ArrayBuffer // Para arrays variables
import java.io.PrintWriter // Para imprimir en fichero
import scala.io.Source // Para lectura desde fichero

object pruebaScala {
  def main(args: Array[String]) {

    /*  var op: String = "PCyA"
    var op1: String = "P"
    var op2: String = "C"
    var op3: String = "y"
    var op4: String = "A"

    println("Introduce una opcion: ")
    op = readLine.toString

    while (op != "PCyA") {
      println("\n Continua Buscando el conjunto de teclas magicas, SUERTE :) ")

      if (op == "P") {
        println("\n La tecla que has introducido forma parte del conjunto de teclas magicas y es la que esta en la  1� posicion (Total del conjunto 4 letras)")
      } else if (op == "C") {
        println("\n La tecla que has introducido forma parte del conjunto de teclas agicas y es la que esta en la  2� posicion (Total del conjunto 4 letras)")
      } else if (op == "y") {
        println("\n La tecla que has introducido forma parte del conjunto de teclas magicas y es la que esta en la  3� posicion (Total del conjunto 4 letras)")
      } else if (op == "A") {
        println("\n La tecla que has introducido forma parte del conjunto de teclas magicas y es la que esta en la  4� y ultima posicion (Total del conjunto 4 letras)")
      } else {
        println("Esta tecla no pertnece al conjunto magico :( ")
      }
      op = readLine.toString
    }

    if (op == "PCyA") {
      println("\n Conjunto completo teclas magicas: " + op)
      println("\n Winner :)")
    }*/
    //2.1.1
    //(0 to 10).foreach(println)

    //2.1.2
    /* for (i <- 1 to 5; j <- 6 to 10) {
      println("i: " + i + " j: " + j)
    }*/

    //2.1.3
    /* var i = 0
      def imprimePrimos() {
      val listaPrimos = List(1, 2, 3, 5, 7, 11)
      for (i <- listaPrimos) {
        if (i == 11) {
          return
        }
        if (i != 1) {
          println(i)
        }
      }
    }
    imprimePrimos*/

    //2.1.4
    /*var opcion: String = "PCyA"
    do {
      print("Teclea opci�n ")
      opcion = readLine.toString
    } while (opcion != "PCyA")
    printf("Tecleaste la opci�n m�gica %s \n", "PCyA")*/

    //2.1.5
    /* def obtenerSuma(args: Int*): Int = {
      var suma: Int = 0
      for (num <- args) {
        suma += num
      }
      suma
    }*/
    def obtenerSuma(args: Int*): Int = {
      (0 /: args)(_ + _)
    }
    println("Suma obtenida " + obtenerSuma(1, 2, 3, 4, 5, 6))
  }
}
//println("Suma obtenida " + obtenerSuma(1, 2, 3, 4, 5, 6))*/