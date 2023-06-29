package `Exercicio 2`

fun main() {
    println("Digite sua idade")
    val numeroIdade = readln().toInt()

    if (!numeroIdade.equals("0")){
        var calculo = numeroIdade * 365
        println("Você ja viveu $calculo dias")
    }
}

