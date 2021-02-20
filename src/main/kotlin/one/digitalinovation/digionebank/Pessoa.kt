package one.digitalinovation.digionebank

class Pessoa {
    var nome: String = "Eduardo"

    var cpf: String = "123.123.123-11"
    private set

    constructor ()

    fun pessoaInfo() = "Nome:$nome e cpf:$cpf"

}

fun main (){
    val eduardo = Pessoa()

    println(eduardo)
    println(eduardo.pessoaInfo())

}