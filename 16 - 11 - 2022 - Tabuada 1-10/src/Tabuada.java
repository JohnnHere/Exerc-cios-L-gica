import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Escreva um número de 1 a 10: ");
        int number = leia.nextInt();

        if(number <= 0 || number >= 11) {
            System.out.println("Digite apenas valores entre 1 e 10. Tente novamente.");
        }

        else
            for(int value = 1; value <= 10; value++){
                System.out.println("A tabuada deste número é: " + number * value);

        }
    }
}
