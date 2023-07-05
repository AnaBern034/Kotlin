package `Exercicio 2`

fun main() {
    println("Digite um valor ")
    val value= readln().toInt()
    vetores().vetores(value)

}

class vetores {
    fun vetores(valor : Int) {
        val vetor = IntArray(10)

        vetor[0]= valor
        for (i in 1 until  vetor.size){
            vetor[i] = vetor[i - 1] * 2
        }
        println("Vetores resultado")
        for (valores in vetor){
            println(valores)
        }

    }

}
