package `Exercicio 1`
fun main (){
    println("Digite um numero")
    val numeroDigitado = readln().toInt()

    if (!numeroDigitado.equals(0)){
        val antecessor = numeroDigitado - 1;
        println("O numero é  $numeroDigitado e o antecessor é $antecessor")
    }
}

