import java.util.Scanner;

public class Main {

    static String resposta = "";
    static Scanner leia = new Scanner(System.in);

    static RobotMarcianoFactory robo = RobotMarcianoFactory.getInstance();

    public static void main(String[] args) {

        System.out.println("Oi, sou o Rôbo Marciano! Vamos conversar?");

        while (!resposta.toUpperCase().equals("FIM")){
            try{
                resposta = leia.nextLine();
                if (!resposta.toLowerCase().equals("FIM")) {
                    robo.chamarRobot(resposta);
                }

            } catch (Exception e){
                System.out.println("Erro encontrado: \n" + e.getMessage());
            }
        }
    }
}
