package edu.paulo.firstweek;

public class BreakContinue {
    public static void main(String[] args) {

        for (int numero = 1; numero <= 5; numero++) {
            if (numero == 3) {
                continue;
            }

            System.out.println(numero);
        }
    }

}
