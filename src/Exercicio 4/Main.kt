package `Exercicio 4`

fun main() {
    println(Logica().logic())
}

class Logica {
    fun logic(){
        val read = IntArray(10)

        println("Digite 10 numeros inteiros")
        for (i in read.indices) {
            read[i] = readln().toInt()
        }
            for (par in read){
            if (par % 2 == 0)
            println("Os numeros pares são $par")
            }

        }
    }
}