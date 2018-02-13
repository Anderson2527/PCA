package pca

object conceptosBasicos {

  def headerExcercice(title: String) {
    println(s"\n***** Ejercicio $title *****\n")
  }

  def main(args: Array[String]) {

    headerExcercice("2.1.1")

    (0 to 10).foreach(println)

    headerExcercice("For aniado 2.1.2")
    for (i <- 1 to 5; j <- 6 to 10) {
      println("i: " + i + " j: " + j)
    }

    headerExcercice("2.1.3")

    var i = 0
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
    imprimePrimos()

    headerExcercice("2.1.4")
    var opcion: String = "PCyA"
    do {
      println("Teclea opción ")
      opcion = readLine()
    } while (opcion != "PCyA")

    printf("Tecleaste la opción mágica %s \n", "PCyA")

    headerExcercice("Con for 2.1.5")

    def obtenerSuma(args: Int*): Int = {
      var suma: Int = 0
      for (num <- args) {
        suma += num
      }
      suma
    }

    println("Suma obtenida " + obtenerSuma(1, 2, 3, 4, 5, 6))

    headerExcercice("Con args 2.1.5")

    def obtenerSumaRec(args: Int*): Int = {
      (0 /: args)(_ + _)
    }
    println("Suma obtenida " + obtenerSumaRec(1, 2, 3, 4, 5, 6))

    // End main
  }

  // End conceptosBasicos
}