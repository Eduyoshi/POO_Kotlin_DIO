package one.digitalinovation.digionebank

import java.math.BigDecimal

abstract class Conta {
    val agencia: String,
    val cointa: String,
    val Saldo: BigDecimal,

    fun deposita(valor:BigDecimal){

    }

    fun saca(valor:BigDecimal){

    }
}