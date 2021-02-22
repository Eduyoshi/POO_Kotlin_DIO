package one.digitalinovation.digionebank

class Analista(
        nome: String,
        cpf: String,
        salario: Double
        ) : Funcionario(nome, cpf, salario) {
    override fun calculaAuxilio() =salario * 0.1 //bonus de 10% do salario


}