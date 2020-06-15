import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Laços de repetiçao");
        int count = 11;
        while(count <= 10) {
            System.out.println("Cris");
            count++;
        }
        int countt = 6;
        do {
            System.out.println("zé");
            countt++;
        } while(countt <=5);

        for(int counttt = 1; counttt <=5; counttt++) {
            System.out.println("joao");
        }

        Person person = new Person("Cris");

        Scanner scan = new Scanner(System.in);

        System.out.println("Digita as vezes q quer ver seu nome");

        System.out.println(person.imprimirNome10x());

        System.out.println(person.imprimirNome5x());

        System.out.println(person.imprimirNome20x());

    }

}