package com.example.robomarciano

open class MarcianoAvancado(): Marciano() {
    open fun responda(comando: String, oper1: Double? = null, oper2: Double? = null): String {
        if (oper1 != null && oper2 != null) {
            val res = when(comando) {
                "some" -> oper1 + oper2
                "subtraia" -> oper1 - oper2
                "multiplique" -> oper1 * oper2
                "divida" -> oper1 / oper2
                else -> "Ou não"
            }
            return "Essa eu sei. $res"
        }
        else return super.responda(comando)
    }

}