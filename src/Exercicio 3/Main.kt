package `Exercicio 3`

fun main() {
    Employe("Luis","Silva",10,25.0)
    println( Employe.NomeCompleto("Luis","Silva"))
    println(Employe.CalcularSalario(10,25.0))
    println(Employe.IncrementarHoras(8))

    val funcionario = ArrayList<Employe>()

  funcionario.add(Employe("Ana","Bernardes",10,100.00))
    println( Employe.NomeCompleto("Ana","Bernardes"))
    println(Employe.CalcularSalario(10,100.0))
    println(Employe.IncrementarHoras(10))

    funcionario.add(Employe("Ana","Alves",10,100.00))
    println( Employe.NomeCompleto("Ana","Alves"))
    println(Employe.CalcularSalario(10,100.0))
    println(Employe.IncrementarHoras(10))

}