package one.digitalinovation.digionebank.testes

import one.digitalinovation.digionebank.Cliente
import one.digitalinovation.digionebank.ClienteTipo

fun main () {
    val eduardo = Cliente(
            nome = "Eduardo Yoshizato",
            cpf = "123.456.789.10",
            clienteTipo = ClienteTipo.PF,
            senha = "123456"
    )

    println(eduardo)

    TesteAutenticacao().autentica(eduardo)


}