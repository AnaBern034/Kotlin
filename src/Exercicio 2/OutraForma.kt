package `Exercicio 2`

fun main() {
    val vetor = IntArray(10){i-> Math.pow(2.0,i.toDouble()).toInt()}

    println("Vetor resultado")
    for (resultado in vetor){
        println(resultado)
    }
}