package main.java;

import java.util.Scanner;

public class Main {

    static String resposta = "";
    static Scanner leia = new Scanner(System.in);

    static RobotMarcianoFactory robo = RobotMarcianoFactory.getInstance();

    public static void main(String[] args) {

        System.out.println("Oi, sou o Rôbo Marciano! Segue algumas instruções:");
        System.out.println("Se você digitar algum operador matemático: some, subtraia, multiplique ou divida, realizei cálculos matemáticos!");
        System.out.println("Se digitar: agir, tenho alguma ações a serem feitas!");
        System.out.println("Vamos começar?");

        while (!resposta.toUpperCase().equals("FIM")){
            try{
                resposta = leia.nextLine();
                if (!resposta.toUpperCase().equals("FIM")) {
                    'robo'.chamarRobot(resposta);
                }

            } catch (Exception e){
                System.out.println("Erro encontrado: \n" + e.getMessage());
            }
        }
    }
}
