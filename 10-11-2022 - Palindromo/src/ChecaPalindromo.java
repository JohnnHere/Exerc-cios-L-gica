import java.util.Scanner;

public class ChecaPalindromo {

    public static boolean checaPalindromo (String palavra){
        int letra = 0;
        int letraPalavra = palavra.length() - 1;

        if(letra < letraPalavra){

            if(palavra.charAt(letra) != palavra.charAt(letraPalavra))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Escreva a palavra ");

        String palavra = leia.next();

        if (checaPalindromo(palavra))
        System.out.print("A palavra é um palíndromo");

        if (!checaPalindromo(palavra))
        System.out.print("A palavra não é um palíndromo");

    }

}
