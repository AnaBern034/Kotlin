package `Exercicio 1`

fun main() {

    println("O calculo dos numeros são  {${calculo(valueX(), valueY())}}")

}
fun calculo(numberX: Int, numberY: Int) : Int{
     var calculo= numberX + numberY
    return calculo
}
fun valueX() : Int {
    var continuar = true
    println("Digite o primeiro numero")
    var numberX = readln().toInt()
    do {
        if  (numberX % 13 == 0){
            println("esse numero é multiplo de 13")
            continuar = false


        } else if(numberX % 13 != 0) {
            println("Faça novamente, os numeros precisam ser multiplos de 13 ")
            numberX = readln().toInt()
            continuar
        }
    } while (continuar)
    return numberX
}

fun valueY() : Int {
    var continuar = true
    println("Digite o segundo numero")
    var numberY = readln().toInt()
    do {
        if (numberY % 13 != 0) {
            println("Faça novamente, os numeros precisam ser multiplos de 13 ")
            numberY = readln().toInt()
            continuar

        } else if(numberY % 13 == 0){
            println("esse numero é multiplo de 13")
            continuar = false
        }
    } while (continuar)
    return numberY
}
