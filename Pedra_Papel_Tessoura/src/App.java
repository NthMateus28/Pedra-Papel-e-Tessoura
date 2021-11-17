import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("JoKenPô");
        System.out.println("");
        System.out.println("1. Papel - 2. Pedra - 3. Tesoura");

        Random gerador = new Random();
        int numeroUsuario;
        int escolhaComputador;
        
        numeroUsuario = teclado.nextInt();
        escolhaComputador = gerador.nextInt(3) + 1;

        switch(escolhaComputador) {
            case 1:
                System.out.println("PC escolheu papel");
                break;
            case 2:
                System.out.println("PC escolheu pedra");
                break;
            case 3:
                System.out.println("PC escolheu tesoura");
                break;
        }

        
        if(numeroUsuario == escolhaComputador) {
            System.out.println("Empate");
        } else if((numeroUsuario - escolhaComputador) == -1 || (numeroUsuario - escolhaComputador) ==2) {
            System.out.println("O usuário é o vencedor");
        } else {
            System.out.println("O computador é o vencedor");
        }

        teclado.close();
    }
}
