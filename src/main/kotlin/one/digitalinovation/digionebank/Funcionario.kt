package one.digitalinovation.digionebank

abstract class Funcionario (
        nome: String,
        cpf: String,
        val salario: Double
        ) :Pessoa(nome, cpf){
        protected abstract fun calculaAuxilio(): Double

        override fun toString(): String = """
                Nome: $nome
                CPF: $cpf
                Salario: $salario
                Auxilio: ${calculaAuxilio()}
        """.trimIndent()

}
