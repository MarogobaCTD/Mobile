package main.java;
import java.util.Scanner;

public class RobotAvancado extends RobotMarciano{

    public RobotAvancado(String mensagem) {
        super(mensagem);
    }

    @Override
    public void getResposta() {
        Scanner leia1 = new Scanner(System.in);
        Scanner leia2 = new Scanner(System.in);
        System.out.println("Digite o 1o numero: ");
        double numero1 = leia1.nextDouble();
        System.out.println("Digite o 2o numero: ");
        double numero2 = leia2.nextDouble();

        getRespostaMatematica(this.getMensagem(), numero1, numero2);
    }

    public void getRespostaMatematica(String mensagem, double numero1, double numero2) {
        double valor = 0;

        String[] fraseSeparada = mensagem.split(" ");

        switch (Operacoes.valueOf(fraseSeparada[0].toUpperCase())) {
            case SOME:
               valor =  numero1 + numero2;
               break;
            case SUBTRAIA:
                valor = numero1 - numero2;
                break;
            case MULTIPLIQUE:
                valor = numero1 * numero2;
                break;
            case DIVIDA:
                valor = numero1 / numero2;
                break;
            default:
                valor = 0;
        }
        System.out.println("Essa eu sei! Resultado: " + valor);
    }

}

