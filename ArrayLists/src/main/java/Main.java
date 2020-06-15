import java.lang.reflect.Array;

/**
 * @autor Cristian
 * @version 1.0.0
 * @since 02/06/2020 - 14:46
 * @category View
 */
public class Main {
    public static void main(String[] args) {

        String[] names = new String[3];
        names[0] = "Cris";
        names[1] = "Myllena";
        names[2] = "Kenny";

        for(int indice = 0 ; indice < names.length ; indice++) {
            System.out.println(names[indice]);
        }

        String[] namess = {"Tris", "Jurema", "Luna"};

        Array.set(namess, 2, "Sarabi");

        for(int indice = 0 ; indice < names.length ; indice++) {
            System.out.println(namess[indice]);
        }

        //foreach
        for(String name : names) {
            System.out.println(name);
        }

        int[] numbers = new int[3];
        numbers[0] = 100;
        numbers[1] = 200;
        numbers[2] = 300;

        System.out.println("segunda opçao: " + numbers[1]);

        for(int indice = 0 ; indice < numbers.length ; indice++) {
            System.out.println(numbers[indice]);
        }

        //foreach
        for(int number : numbers) {
            System.out.println(number);
        }

        //matriz quadratica 3x3
        int[][] matriz = new int[3][3];

//        matriz[0][0] = 1;
//        matriz[0][1] = 2;
//        matriz[0][2] = 3;
//        matriz[1][0] = 4;
//        matriz[1][1] = 5;
//        matriz[1][2] = 6;
//        matriz[2][0] = 7;
//        matriz[2][1] = 8;
//        matriz[2][2] = 9;

        for(int linha = 0 ; linha < 3 ; linha++) {
            for(int coluna = 0 ; coluna < 3 ; coluna++) {
                if (linha == coluna) {
                    matriz[linha][coluna] = 1;
                } else {
                    matriz[linha][coluna] = 0;
                }
            }
        }

        for(int linha = 0 ; linha < 3 ; linha++) {
            for(int coluna = 0 ; coluna < 3 ; coluna++) {
                System.out.print(" " + matriz[linha][coluna] + " ");
            }
            System.out.println("\n");
        }

        for(int linha = 0 ; linha < 3 ; linha++) {
            for(int coluna = 0 ; coluna < 3 ; coluna++) {
                matriz[linha][coluna] = 0;
            }
        }



    }
}
