package `Exercicio 10`

fun main() {
  println(LerSucesor().sucessor())
}
public class LerSucesor(){
    fun sucessor(){
        println("Digite um numero")
        val numeroDigitado = readln().toInt()

        if (!numeroDigitado.equals(0)){
            val antecessor = numeroDigitado + 1
            println("O numero é  $numeroDigitado e o sucessor é $antecessor")
        }
    }
}