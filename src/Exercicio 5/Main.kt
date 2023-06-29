package `Exercicio 5`

fun main() {
    println("Digite um numero inteiro")
    val numeroInteiro = readln().toInt()

    if (numeroInteiro >= +1){
        println("Numero posito")
    } else if (numeroInteiro <= -1 ){
        println("Numero negativo")
    }
}