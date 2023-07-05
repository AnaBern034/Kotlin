package `Exercicio 7`

fun main() {
    println("Digite a quantidade de alunos")
    val quantidade = readln().toInt()
    turmaA(quantidade)
}
fun turmaA(quantidadeAlunos : Int){
    val alunos = IntArray(5)

    println("Digite a média")
    val média = readln().toInt()
    for (i in alunos.indices){
        alunos[i] = média
        println( "A média do aluno na posição $i é "+alunos[i] )
    }


}
fun turmaB(){
}