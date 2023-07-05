package `Exercicio 4`

fun main() {
    val gato = IntArray(3)
    val cachorro = IntArray(2)
    println("== Controle de estoque ==")
    for (i in gato.indices){
        println("Digite a quantidade de gatos na posição $i")
        gato[i]= readln().toInt()
    }
    println("== Cachorro ==")
    for (i in cachorro.indices){
        println("Digite a quantidade de cachorro na posiçao $i")
        cachorro[i]= readln().toInt()
    }
    println("Quantidade de gatos "+gato.sum())
    println("Quantidade de cachorro "+cachorro.sum())



}
