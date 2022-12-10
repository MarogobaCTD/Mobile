import java.awt.*;
import java.util.Scanner;
import java.net.URL;
import javax.swing.*;
import javax.sound.sampled.*;

public class RobotPremium extends RobotMarciano implements Acao {
    public static final String ANSI_RESET = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN = "\u001B[42m";
    public static final String ANSI_YELLOW = "\u001B[43m";

    public RobotPremium(String mensagem) {
        super(mensagem);
    }

    @Override
    public void getResposta() throws Exception {

        System.out.println("É pra já!");
        Scanner acao = new Scanner(System.in);
        int numero;
        System.out.println("Escolha uma das ações abaixo:");
        System.out.println("[1] - Contar; [2] - Falar; [3] - Pintar; [4] - Mover");
        numero = acao.nextInt();
        switch (numero) {
            case 1:
                Contar();
                break;
            case 2:
                Cantar();
                break;
            case 3:
                Pintar();
                break;
            case 4:
                Mover();
                break;
            default:
                System.out.println("Você não escolheu uma ação válida!");
        }

    }

    @Override
    public void Cantar() {
        String musica = "./lvb-sym-5-1.wav";
        InputStream input = getClass().getResourceAsStream(musica);
        Clip oClip = AudioSystem.getClip();
        AudioInputStream audioInput = AudioSystem.getAudioInputStream(input);
        oClip.open(audioInput);
        oClip.loop(0);

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    @Override
    public void Contar() {
        int i = 1;
        while (i != -1){
            System.out.println(i);
            i++;
            if ((i % 100) == 0) {
                i = Continuar(i);
            }
        }
    }

    @Override
    public void Mover() throws Exception {
        try {
            Robot robo = new Robot();
            double valorx = Math.random();
            double valory = Math.random();

            int i = 0;
            while (i != -1) {
                robo.mouseMove(i, i);
                robo.delay(200);
                i = i + 10;
                //System.out.println(i);
                if ((i % 400) == 0) {
                    i = Continuar(i);
                    if (i > 1000){
                        i = 0;
                    }
                }
            }

        } catch (AWTException e){
             throw new Exception(e.getMessage());
        }

    }

    @Override
    public void Pintar() {
            int i = 1;
            while (i != -1) {
                System.out.println(ANSI_YELLOW);
                System.out.println(ANSI_RED_BACKGROUND);
                System.out.println(ANSI_GREEN);
                System.out.println(ANSI_RESET);
                i = Continuar(i);
            }
        }
    public int Continuar(int valor){
        Scanner seguir = new Scanner(System.in);
        String continuar;
        System.out.println("Deseja continuar? [S] or [N]");
        continuar = seguir.nextLine();
        if (continuar.equals("N")) {
           return -1;
        }
        return valor;
    }

}
