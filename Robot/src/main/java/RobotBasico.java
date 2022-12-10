package main.java;

public class RobotBasico extends RobotMarciano{

    public RobotBasico(String mensagem) {
        super(mensagem);
    }

    @Override
    public void getResposta() {
        String auxMensagem = this.getMensagem().toUpperCase();

        if (this.getMensagem().isEmpty()){
            System.out.println("Não me incomode!");
        } else if (PalavraEu(this.getMensagem())){
            System.out.println("A responsabilidade é sua!");
        } else if (this.getMensagem().contains("?") && auxMensagem.equals(this.getMensagem())){
            System.out.println("Relaxa, eu sei o que estou fazendo!");
        } else if (PalavraMaiuscula(this.getMensagem())){
            System.out.println("Opa! Calma aí!");
        } else if (this.getMensagem().contains("?")){
            System.out.println("Certamente!");
        } else {
            System.out.println("Tudo bem, como quiser!");
        }
    }

    private boolean PalavraEu(String mensagem){
        String[] fraseSeparada = mensagem.split(" ");
        String palavra = "eu";
        int i =0;
        while (i < fraseSeparada.length){
            if (palavra.equals(fraseSeparada[i].toLowerCase())) {
                return true;
            }
            i++;
        }
        return false;
    }

    private boolean PalavraMaiuscula(String mensagem){
        String[] fraseSeparada = mensagem.split(" ");
        String palavra;
        int i =0;
        while (i < fraseSeparada.length){
            palavra = fraseSeparada[i].toUpperCase();

            if (palavra.equals(fraseSeparada[i])) {
                return true;
            }
            i++;
        }
        return false;
    }
}
