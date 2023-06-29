package `Exercicio 3`

fun main() {
    println("Digite um numero inteiro")
    val numeroInteiro = readln().toInt()

    if (numeroInteiro % 5 == 0){
        val calculo = numeroInteiro/5
        println("Esse numero é divisivel 5")
    }else{
        println("Esse numero não é divisivel")
    }
}

