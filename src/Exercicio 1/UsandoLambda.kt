package `Exercicio 1`

fun main() {
println(SomaValore().somarValores())

} public class SomaValore{
    fun somarValores() {
        val numero = Array(5, { i -> i })

        for(i in numero.indices){
            println("Digite os valores")
            numero[i] = readln().toInt()
        }
        val somar = numero.sum()
        println("A soma dos valores é $somar")
    }
    //Pesquisar mais afundo lambda em kotlin
}