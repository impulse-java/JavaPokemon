package pokemon;

import java.util.Scanner;

class moveSet {
    // moveSet will control all moves for the enemy Pokemon
    // Need to create new class and remove logic from constructors

    private int flamethrower = 25;
    private int fly = 20;
    public static int pHealth = 90;
    private int miss;
    private int critical;
    // Declaring moves and player's health

    public moveSet() throws InterruptedException {

        // These statements need to be moved outside of the constructors
        System.out.println("\nCharizard's turn! ");
        Thread.sleep(1000);
        miss = (int)(Math.random() * 10 + 1);
        critical = (int)(Math.random() * 20 + 1);
        int chooseMove = (int)(Math.random()) * 3 + 1;

        if(chooseMove == 1) {
            if(miss == 1) {
                System.out.println("Charizard's attack missed!");
                return;
            }
            else {
                if(critical == 1) {
                    System.out.println("Charizard used Flamethrower!");
                    pHealth -= flamethrower * 2;
                    Thread.sleep(1000);
                    System.out.println("Critical hit!");
                    System.out.println("\nPikachu has " + pHealth + " health left!");
                    if(pHealth <= 0) {
                        System.out.println("Game over!");
                        System.out.println("You lose!");
                        System.exit(1);
                    }
                    return;
                }
                else {
                    System.out.println("Charizard used Flamethrower!");
                    pHealth -= flamethrower;
                    Thread.sleep(1000);
                    System.out.println("\nPikachu has " + pHealth + " health left!");
                    if(pHealth <= 0) {
                        System.out.println("Game over!");
                        System.out.println("You lose!");
                        System.exit(1);
                    }
                    return;
                }
            }
        }
        if(chooseMove == 2) {
            if(miss == 1) {
                System.out.println("Charizard's attack missed!");
                return;
            }
            else {
                if(critical == 1) {
                    System.out.println("Charizard used Fly!");
                    pHealth -= fly * 2;
                    Thread.sleep(1000);
                    System.out.println("Critical hit!");
                    System.out.println("\nPikachu has " + pHealth + " health left!");
                    if(pHealth <= 0) {
                        System.out.println("Game over!");
                        System.out.println("You lose!");
                        System.exit(1);
                    }
                    return;
                }
                else {
                    System.out.println("Charizard used Fly!");
                    pHealth -= flamethrower;
                    Thread.sleep(1000);
                    System.out.println("\nPikachu has " + pHealth + " health left!");
                    if(pHealth <= 0) {
                        System.out.println("Game over!");
                        System.out.println("You lose!");
                        System.exit(1);
                    }
                    return;
                }
            }
        }
        if(chooseMove == 3) {
            Thread.sleep(1000);
            System.out.println("Charizard used SmokeScreen!");
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
    private int struggle = 10;
    private int miss;
    private int critical;


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
                    if(cHealth <= 0) {
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
                    if(cHealth <= 0) {
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
                if(cHealth <= 0) {
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

    public game() throws InterruptedException {

        System.out.println("You encountered a wild Charizard!");
        Thread.sleep(500);
        System.out.println("Charizard's Health: 120");

        Thread.sleep(1500);

        System.out.println("\nGO! Pikachu!");
        pMoveSet mvs1 = new pMoveSet();

        for(;;) {
            Thread.sleep(3000);
            System.out.println("\nYour turn!");
            pMoveSet mvs2 = new pMoveSet();
        }
    }
}

class Main {

    public static void main(String[] args) throws InterruptedException {
        game ex = new game();
        // Instantiating "game" to run the whole program
    }
}
