package `Exercicio  10`
fun main() {
    println("Digite o valor de x:")
    val x = readLine()?.toIntOrNull()

    println("Digite o valor de y:")
    val y = readLine()?.toIntOrNull()

    if (x != null && y != null) {
        if (x == y) {
            println("Os valores são iguais.")
        } else {
            println("Os valores são diferentes.")
        }
    } else {
        println("Valores inválidos.")
    }
}