package `Exercicio 9`

fun main() {
    println(LerFrase().leitorDeFrase())
}
public class LerFrase(){
    fun leitorDeFrase(){
        println("Digite uma frase")
        val read = readln().toString()

        println("Lendo frase...")
        println("sua frase é: $read")
    }

}