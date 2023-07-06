package `Exercicio 3`

class Employe(nome: String,sobreNome: String,horasTrabalhadas: Int,valorPorHora: Double){
     var nome = String
     var sobreNome = String
     var horasTrabalhadas = Int
     var valorPorHora = Double
     var salario = Double


companion object {
    fun NomeCompleto(nome: String, sobreNome: String): String {
        return "Seu nome é : $nome $sobreNome"
    }

    fun CalcularSalario(horasTrabalhadas: Int, valorPorHora: Double): Double {
        var salario = horasTrabalhadas * valorPorHora
        return salario
    }

    fun IncrementarHoras(horasTrabalhadas: Int) {
        var mudarHora =+ horasTrabalhadas
        println("Horas incrementada $mudarHora")
    }
}
}
