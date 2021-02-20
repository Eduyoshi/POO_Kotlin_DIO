package one.digitalinovation.digionebank.testes

import one.digitalinovation.digionebank.Banco

fun main (){
    val digiOneBank = Banco(nome = "DigiOne", numero =22)

    println(digiOneBank.nome)
    println(digiOneBank.numero)

    val banco2 = digiOneBank.copy(nome = "Banco2")

    println(banco2.nome)
    println(banco2.numero)
}
