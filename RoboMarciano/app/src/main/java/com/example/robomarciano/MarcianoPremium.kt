package com.example.robomarciano

open class MarcianoPremium(val acao: MarcianoInterface): MarcianoAvancado() {
    override fun responda(comando: String): String {
        return if (comando.equals("agir")) {
            "É pra já!\n${acao.agir()}"
        } else super.responda(comando)
    }
}
