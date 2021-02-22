package one.digitalinovation.digionebank.testes

import one.digitalinovation.digionebank.Gerente
import one.digitalinovation.digionebank.Funcionario

fun main() {
    val simone = Gerente(nome = "Simone", cpf = "123.456.789.10", salario = 5000.0)

    ImprimeRelatorioFuncionario.imprime(simone)
}

