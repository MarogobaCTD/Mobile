package com.example.robomarciano

open class Marciano () {
        val pergunta = "Certamente"
        val grito = "Opa! Calma aí!"
        val pergunta_grito = "Relaxa, eu sei o que estou fazendo!"
        val eu = "A responsabilidade é sua"
        val vazio = "Não me incomode"
        val outro = "Tudo bem, como quiser"

        open fun responda(comando: String): String {
            comando.run {
                return when {
                    isNullOrBlank() -> vazio
                    contains("eu").or(contains("Eu").or(contains("EU"))) -> eu
                    contains("?").and(split(" ").any { it.uppercase().equals(it) }) -> pergunta_grito
                    split(" ").any { it.uppercase().equals(it) } -> grito
                    contains("?") -> pergunta
                    else -> outro
                }
            }
        }

}
