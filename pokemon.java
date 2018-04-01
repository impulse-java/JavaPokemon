package pokemon;

import java.util.Scanner;
import java.util.Random;

class moveSet {
    // moveSet will control all moves for the enemy Pokemon
    // Need to create new class and remove logic from constructors

    private int flamethrower = 25;
    private int fly = 20;
    private int smokescreen = 5;
    private int struggle = 10;
    public int pHealth = 90;
    // Declaring moves and player's health

    public moveSet() throws InterruptedException {

        System.out.println("\nCharizard's turn! ");
        Thread.sleep(1000);
        int moveRand = (int) (Math.random() * 4 + 1);
        if(moveRand == 1) {
            Thread.sleep(1000);

            System.out.println("\nCharizard used Flamethrower! ");
            Thread.sleep(1000);

            pHealth -= flamethrower;
            System.out.println("Pikachu has " + pHealth + " health left!");
            if(pHealth == 0) {
                System.out.println("Pikachu has been knocked out!");
                System.out.println("Game over! ");
                System.exit(1);
            }
            return;
        }
        if(moveRand == 2) {
            Thread.sleep(1000);

            System.out.println("\nCharizard used Fly! ");
            Thread.sleep(1000);

            pHealth -= fly;
            System.out.println("Pikachu has " + pHealth + " health left!");
            if(pHealth == 0) {
                System.out.println("Pikachu has been knocked out!");
                System.out.println("Game over! ");
                System.exit(1);
            }
            return;
        }
        if(moveRand == 3) {
            Thread.sleep(1000);

            System.out.println();
            System.out.println("Charizard used Smokescreen!");
            return;
        }
        if(moveRand == 4) {
            System.out.println("Charizard's attack missed!");
            return;
        }
    }
}

class pMoveSet {
    // Player's move-set controlled from this constructor
    // Logic also needs to be moved out of these constructors

    private final String CHARIZARD = "Charizard";
    private  final String PIKA = "Pikachu";
    public static int cHealth = 120;
    private int thunderbolt = 30;
    private int tackle = 15;
    private int dteam = 5;
    private int flamethrower = 25;
    private int fly = 20;
    private int smokescreen = 5;
    private int struggle = 10;
    private int miss;

    public pMoveSet() throws InterruptedException {
        // Method controls all of the moves available to the player
        Scanner key = new Scanner(System.in);

        miss = (int)(Math.random() * 10);

        System.out.println("Moves: \n(1) Thunderbolt \n(2) Tackle \n(3) Double-Team");
        System.out.print("> ");
        int chooseMove = key.nextInt();
        moveSet atk;

        // This massive switch statement is a mess. Really needs to be fixed
        switch(chooseMove) {
            case 1:
                System.out.println("\n" + PIKA + " used Thunderbolt!");
                if(miss == 1) {
                    System.out.println("Pikachu's attack missed!");
                    atk = new moveSet();
                    return;
                }
                else {
                    Thread.sleep(2000);
                    System.out.println("\nIt did " + thunderbolt + " damage!");

                    Thread.sleep(1000);

                    cHealth -= thunderbolt;
                    System.out.println("Charizard has " + cHealth + " health left");
                    Thread.sleep(2000);
                    if(cHealth == 0) {
                        System.out.println("Charizard has been knocked out!");

                        Thread.sleep(1000);
                        System.out.println("\nGame over! ");
                        System.out.println("You win!");
                        System.exit(1);
                    }
                    atk = new moveSet();
                }
                return;

            case 2:
                System.out.println("\n" + PIKA + " used Tackle!");
                if(miss == 1) {
                    System.out.println("Pikachu's attack missed!");
                    atk = new moveSet();
                    break;
                }
                else {
                    Thread.sleep(2000);
                    System.out.println("\nIt did " + tackle + " damage!");

                    Thread.sleep(1000);

                    cHealth -= tackle;
                    System.out.println("Charizard has " + cHealth + " health left");
                    Thread.sleep(2000);
                    if(cHealth == 0) {
                        System.out.println("Charizard has been knocked out!");

                        Thread.sleep(1000);
                        System.out.println("\nGame over! ");
                        System.out.println("You win!");
                        System.exit(1);
                    }
                }
                atk = new moveSet();
                return;

            case 3:
                System.out.println("\n" + PIKA + " used Double-Team!");
                System.out.println();
                Thread.sleep(1000);
                System.out.println("Pikachu's speed went up by " + dteam + "!");
                atk = new moveSet();
                return;

            case 4:
                System.out.println(PIKA + " used Struggle!");
                System.out.println();
                Thread.sleep(1000);
                System.out.println("It did " + struggle + " damage!");

                Thread.sleep(1000);

                cHealth -= struggle;
                System.out.println("Charizard has " + cHealth + " health left");
                Thread.sleep(2000);
                if(cHealth == 0) {
                    System.out.println("Charizard has been knocked out!");

                    Thread.sleep(1000);
                    System.out.println("\nGame over! ");
                    System.out.println("You win!");
                    System.exit(1);
                }
                atk = new moveSet();
                return;

            default:
                System.out.println("Error!");
                return;
        }
    }
}

class game {
    // Set up to run the entire program
    private final String CHARIZARD;
    private final String PIKA;
    public static int cHealth;


    public game() throws InterruptedException {
        cHealth = 120;

        CHARIZARD = "Charizard";
        PIKA = "Pikachu";

        System.out.println("You encountered a wild " + CHARIZARD + "!");
        Thread.sleep(500);
        System.out.println("Charizard's Health: " + cHealth);

        Thread.sleep(1500);

        System.out.println("\nGO! " + PIKA + "!");
        pMoveSet mvs1 = new pMoveSet();

        do {
            Thread.sleep(3000);
            System.out.println("\nYour turn!");
            pMoveSet mvs2 = new pMoveSet();
        }while(cHealth >= 0);
    }
}

class Main {

    public static void main(String[] args) throws InterruptedException {
        game ex = new game();
        // Instantiating "game" to run the whole program
    }
}
