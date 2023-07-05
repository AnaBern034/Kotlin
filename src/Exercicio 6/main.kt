package `Exercicio 6`

fun main() {
    var tabuada = IntArray (10)
    var calculo = 0

    for (i in 1 until tabuada.size){
        calculo = i * 9
        println(" $i * 9 = $calculo")
    }
}
