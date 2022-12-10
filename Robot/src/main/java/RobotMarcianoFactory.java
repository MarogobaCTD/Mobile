package main.java;

import java.util.ArrayList;
import java.util.Scanner;

public class RobotMarcianoFactory {

    private static RobotMarcianoFactory instance;
    public static final String SOME = "some";
    public static final String SUBTRAIA = "subtraia";
    public static final String MULTIPLIQUE = "multiplique";
    public static final String DIVIDA = "divida";

    public static final String AGIR = "agir";

    private RobotMarcianoFactory(){};

    public static RobotMarcianoFactory getInstance(){
        if (instance == null){
            instance = new RobotMarcianoFactory();
        }
        return instance;
    }

    public void chamarRobot(String mensagem) throws Exception{

        if (mensagem.indexOf(SOME) == 0 ||
                mensagem.indexOf(SUBTRAIA) == 0 ||
                mensagem.indexOf(MULTIPLIQUE) == 0 ||
                mensagem.indexOf(DIVIDA) == 0) {

            RobotAvancado avancado = new RobotAvancado(mensagem);
            avancado.getResposta();

        } else if (mensagem.indexOf(AGIR) == 0) {

            RobotPremium premium = new RobotPremium(mensagem);
            premium.getResposta();

        } else {
            RobotBasico basico = new RobotBasico(mensagem);
            basico.getResposta();
        }
    }

}
