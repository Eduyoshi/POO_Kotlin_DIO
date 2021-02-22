package one.digitalinovation.digionebank.testes

import one.digitalinovation.digionebank.Analista
import one.digitalinovation.digionebank.Funcionario

fun main() {
    val eduyoshi = Analista(nome = "Eduyoshi", cpf = "123.456.789.10", salario = 2000.0)

    ImprimeRelatorioFuncionario.imprime(eduyoshi)
}
