package one.digitalinovation.digionebank

class Pessoa {
    var nome: String = "Eduardo"

    var cpf: String = "123.123.123-11"
    private set
}

fun main (){
    val eduardo = Pessoa()

    println(eduardo)
    println(eduardo.nome)
    println(eduardo.cpf)


}