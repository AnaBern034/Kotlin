package `Exercicio 7`

fun main() {
    val coia = MétodoParaCalcular()
    println(coia.BaseEAltura())

}
public class MétodoParaCalcular{
    fun BaseEAltura() {
        println("Escreva as dimensões de um retangulo")
        println("Escreva a base")
        val numeroBase = readln().toDouble()

        println("Escreva a altura")
        val numeroAltura = readln().toDouble()

        val calculo = numeroBase * numeroAltura

        println("A base e a altura é $calculo")
    }
}