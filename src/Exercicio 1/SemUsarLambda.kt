package `Exercicio 1`

fun main() {
    println(Valor().SomarValore())
}
public class Valor(){
    fun SomarValore(){
        var vetor = arrayOf(1,2,3,4,5)
        val soma = vetor.sum()
        println("A soma dos valore é $soma")
    }
}