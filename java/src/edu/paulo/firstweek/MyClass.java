package edu.paulo.firstweek;
public class MyClass {
    
    public static void main(String[] args){
        String primeiroNome = "Paulo";
        String segundoNome = "Roberto";

        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }
    public static String nomeCompleto (String primeiroNome, String segundoNome){

        return "Resultado do metodo: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
