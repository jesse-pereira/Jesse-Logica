import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("OI");
        Porta porta = new Porta("Azul", 23021997);
        System.out.println(porta);

        do {
            System.out.println("\nQual a senha?");
            porta.abrirPorta(scan.nextInt());
            System.out.println("Senha errada!" + "\n");
        } while (porta.getEstado().equals("Fechada"));

        System.out.println(porta);
    }
}
