package main.java;

import java.awt.*;

public abstract class RobotMarciano {

    private String mensagem;

    public RobotMarciano(String mensagem) {
        this.mensagem = mensagem;
    };

    public abstract void getResposta() throws Exception;

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
