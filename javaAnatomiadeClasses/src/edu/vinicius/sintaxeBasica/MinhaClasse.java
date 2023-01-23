package edu.vinicius.sintaxeBasica;
public class MinhaClasse {

    public static void main(String [] args){

        String primeiroNome = "Jeremias";
        String segundoNome = "Moraes";
        int dataNascimento = 1950;
        int anoVijente = 2023;
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        int idade = sub(dataNascimento, anoVijente);
        System.out.println("o nome é " + nomeCompleto + " e a idade atual é " + idade);
    }
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
    public static int sub(int dataNascimento, int anoVijente){
        return (anoVijente - dataNascimento);
    }
    //Utilização de métodos e variáveis para exibir mensagens na tela
    
}
