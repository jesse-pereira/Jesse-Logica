import java.io.PrintStream;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

/**
 * @author Cristian
 * @version 1.0.0
 * @since 05/06/2020 - 01:05
 * @category view
 */
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        GameStoreArray storedGames = new GameStoreArray();
        GameStore game = null;
        boolean var4 = false;
        int option;

        do {
            System.out.println("1-Register game\n2-Games on Stock\n3-Delete Game\n4-Search Game\n5-Stock amount\n6-Clear Stock\n7-Value in stock\n8-Rent a game\n9-Rented time\n10-Back the game\n11-Edit game\n20-Quit");
            option = scan.nextInt();

            switch (option) {
                case 1:
                    game = new GameStore();
                    System.out.println("Name of game you will register");
                    game.setNameOfGame(scan.next());
                    System.out.println("The category of game");
                    game.setCategory(scan.next());
                    System.out.println("What is the rent price?");
                    game.setPrice(scan.nextDouble());
                    System.out.println("How much games of this you have?");
                    game.setAmount(scan.nextInt());
                    storedGames.register(game);
                    System.out.println("The game is registered");
                    break;

                case 2:
                    if(storedGames.stockAmount() != 0) {
                        List var10000 = storedGames.search();
                        PrintStream var10001 = System.out;
                        Objects.requireNonNull(var10001);
                        var10000.forEach(var10001::println);
                        break;
                    } else {
                        System.out.println("Don't have games on stock. =(");
                    }
                    break;

                case 3:
                    System.out.println("The position to delete");
                    int index = scan.nextInt();
                    storedGames.delete(index);
                    System.out.println("Game deleted successful");
                    break;

                case 4:
                    game = new GameStore();
                    System.out.println("What the game you are search?");
                    game.setNameOfGame(scan.next());
                    game = storedGames.filter(game, 1);
                    System.out.println(game != null ? game : "Game not found");
                    break;

                case 5:
                    System.out.println("Have: " + storedGames.stockAmount() + " game(s) on stock");
                    break;

                case 6:
                    storedGames.clearStock();
                    System.out.println("Stock cleared");
                    break;

                case 7:
                    game = new GameStore();
                    System.out.println("What the game you are search the value on stock?");
                    game.setNameOfGame(scan.next());
                    game = storedGames.filter(game, 1);
                    System.out.println(game != null ? game + "\nValue in stock: " + game.valueInStock() : "Game not found =(");
                    break;

                case 8:
                    game = new GameStore();
                    System.out.println("What the game you are rent?");
                    game.setNameOfGame(scan.next());
                    game = storedGames.filter(game, 1);

                    if(game != null) {

                        if(game.getAmount() > 0) {
                            game.gameRent();
                            System.out.println("How much hours you will rent?");
                            int hours = scan.nextInt();
                            game.rentedHours(hours);
                            System.out.println("All okay deliver the game!"
                                             + "\nThe price is: $" + game.priceToPay(hours));
                            break;
                        } else {
                            System.out.println("Not have game on stock =(");
                            break;
                        }

                    } else {
                        System.out.println("Game not found =(");
                        break;
                    }

                case 9:
                    game = new GameStore();
                    System.out.println("What the game you are search?");
                    game.setNameOfGame(scan.next());
                    game = storedGames.filter(game, 1);
                    System.out.println(game != null ? game + "\nRented time: " + game.getRentHours() : "Game not found =(");
                    break;

                case 10:
                    game = new GameStore();
                    System.out.println("What the game are back?");
                    game.setNameOfGame(scan.next());
                    game = storedGames.filter(game, 1);

                    if(game != null) {
                        game.gameBack();
                        System.out.println("Alright store this =)");
                        break;
                    } else {
                        System.out.println("Game not found =(");
                        break;
                    }

                case 11:
                    int option2 = 0;

                    do {
                    game = new GameStore();
                    System.out.println("What the game you edit?");
                    game.setNameOfGame(scan.next());
                    game = storedGames.filter(game, 1);

                    if (game != null) {
                        System.out.println("What you want edit?\n1-Name\n2-Category\n3-Price\n4-Amount\n5-Back");
                        option2 = scan.nextInt();
                        switch (option2) {
                            case 1:
                                System.out.println("What is the new name?");
                                game.setNameOfGame(scan.next());
                                System.out.println("Fine!");
                                break;
                            case 2:
                                System.out.println("What is the new category?");
                                game.setCategory(scan.next());
                                System.out.println("Okay!");
                                break;
                            case 3:
                                System.out.println("What is the new price?");
                                game.setPrice(scan.nextDouble());
                                System.out.println("Good!");
                                break;
                            case 4:
                                System.out.println("How much you have?");
                                game.setAmount(scan.nextInt());
                                System.out.println("There is!");
                                break;
                            case 5:
                                break;
                            default:
                                System.out.println("Not is a valid option");
                                break;
                        }
                    } else {
                        System.out.println("Game not found =(");
                        break;
                    }

                    } while (option2 != 5);
                    break;

                case 20:
                    System.out.println("Good Bye! =D");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Not is a valid option");
                    break;

            }
        } while (option != 20);
    }
}