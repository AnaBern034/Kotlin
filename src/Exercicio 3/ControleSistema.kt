package `Exercicio 3`

class ControleSistema {

    fun produtos(quantidadeProduto : Int){
        var pagarTodos = 0.0

        for (i in 1..quantidadeProduto){
            println("Digite o preço do produto $i")
            val precoProduto = readln().toDouble()
            pagarTodos += precoProduto
        }
        println("Total a pagar $$pagarTodos")

    }
}