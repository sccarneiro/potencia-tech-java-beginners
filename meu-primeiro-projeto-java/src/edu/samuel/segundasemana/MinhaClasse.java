package edu.samuel.segundasemana;
public class MinhaClasse {
    public static void main(String[] args) {
        String primeiroNome = "Samuel";
        String segundoNome = "Carneiro";
        
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultad do método " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
