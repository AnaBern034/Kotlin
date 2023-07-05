package `Exercicio  8`

fun main() {
    println("Digite seu nome:")
    val nome = readLine()

    if (nome != null) {
        for (letra in nome) {
            println(letra)
        }
    }
}