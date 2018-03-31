package pokemon;

import java.util.Scanner;
import java.util.Random;

class moveSet {
  // moveSet will control all moves for the enemy Pokemon
  // Need to create new class and remove logic from constructors
  
  private int flamethrower;
  private int fly;
  private int smokescreen;
  private int struggle;
  public int pHealth = 90;
  // Declaring moves and player's health
  
  public moveSet() throws InterruptedException {
    flamethrower = 25;
    fly = 20;
    smokescreen = 5;
    struggle = 10;
    
    System.out.println();
    System.out.println("Charizard's turn! ");
    Thread.sleep(1000);
    int moveRand = (int) (Math.random() * 4 + 1);
    if(moveRand == 1) {
      Thread.sleep(1000);
      
      System.out.println("\nCharizard used Flamethrower! ");
      Thread.sleep(1000);
      
      pHealth = pHealth - flamethrower;
      System.out.println("Pikachu has " + pHealth + " health left!");
      if(pHealth == 0) {
          System.out.println("Pikachu has been knocked out!");
          System.out.println("Game over! ");
          return;
      }
    }
    if(moveRand == 2) {
      Thread.sleep(1000);
      
      System.out.println("\nCharizard used Fly! ");
      Thread.sleep(1000);
      
      pHealth = pHealth - fly;
      System.out.println("Pikachu has " + pHealth + " health left!");
      if(pHealth == 0) {
          System.out.println("Pikachu has been knocked out!");
          System.out.println("Game over! ");
          return;
      }
    }
    if(moveRand == 3) {
      Thread.sleep(1000);
      
      System.out.println();
      System.out.println("Charizard used Smokescreen!");
    }
    if(moveRand == 4) {
        System.out.println("Charizard's attack missed!");
    }
  }
}

class pMoveSet {
  // Player's move-set controlled from this constructor
  // Logic also needs to be moved out of these constructors
  
  private final String CHARIZARD;
  private  final String PIKA;
  public static int c_health = 120;
  public static int pHealth = 90;
  private String moves;
  private int thunderbolt;
  private int tackle;
  private int dteam;
  private int flamethrower;
  private int fly;
  private int smokescreen;
  private int struggle;
  private int miss;
  
  public pMoveSet() throws InterruptedException {
    // Method controls all of the moves available to the player
    Scanner key = new Scanner(System.in);
    
    thunderbolt = 30;
    tackle = 15;
    dteam = 5;
    flamethrower = 35;
    fly = 20;
    smokescreen = 5;
    struggle = 10;
    
    CHARIZARD = "Charizard";
    PIKA = "Pikachu";
    
    miss = (int)(Math.random() * 10);
    
    System.out.println("Moves: \n(1) Thunderbolt \n(2) Tackle \n(3) Double-Team");
    System.out.print("> ");
    int chooseMove = key.nextInt();
    switch(chooseMove) {
      case 1:
        System.out.println("\n" + PIKA + " used Thunderbolt!");
        if(miss == 1) {
            System.out.println("Pikachu's attack missed!");
            moveSet atk1 = new moveSet();
            break;
        }
        else {
            Thread.sleep(2000);
            System.out.println("\nIt did " + thunderbolt + " damage!");
        
            Thread.sleep(1000);
        
            c_health = c_health - thunderbolt;
            System.out.println("Charizard has " + c_health + " health left");
            Thread.sleep(2000);
            if(c_health == 0) {
                System.out.println("Charizard has been knocked out!");
          
                Thread.sleep(1000);
                System.out.println("\nGame over! ");
                System.out.println("You win!");
                System.exit(1);
            }
            moveSet atk1 = new moveSet();
        }
      break;
        
      case 2:
        System.out.println("\n" + PIKA + " used Tackle!");
        if(miss == 1) {
            System.out.println("Pikachu's attack missed!");
            moveSet atk2 = new moveSet();
            break;
        }
        else {
            Thread.sleep(2000);
            System.out.println("\nIt did " + tackle + " damage!");
        
            Thread.sleep(1000);
        
            c_health = c_health - tackle;
            System.out.println("Charizard has " + c_health + " health left");
            Thread.sleep(2000);
            if(c_health == 0) {
            System.out.println("Charizard has been knocked out!");
          
            Thread.sleep(1000);
            System.out.println("\nGame over! ");
            System.out.println("You win!");
            System.exit(1);
            }
        }
        moveSet atk2 = new moveSet();
       break;
        
      case 3:
        System.out.println("\n" + PIKA + " used Double-Team!");
        System.out.println();
        Thread.sleep(1000);
        System.out.println("Pikachu's speed went up by " + dteam + "!");
        moveSet atk3 = new moveSet();
        break;
        
      case 4:
        System.out.println(PIKA + " used Struggle!");
        System.out.println();
        Thread.sleep(1000);
        System.out.println("It did " + struggle + " damage!");
        
        Thread.sleep(1000);
        
        c_health = c_health - struggle;
        System.out.println("Charizard has " + c_health + " health left");
        Thread.sleep(2000);
        if(c_health == 0) {
          System.out.println("Charizard has been knocked out!");
          
          Thread.sleep(1000);
          System.out.println("\nGame over! ");
          System.out.println("You win!");
          System.exit(1);
        }
        moveSet atk4 = new moveSet();
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
  public static int c_health;

  
  public game() throws InterruptedException {
    c_health = 120;
    
    CHARIZARD = "Charizard";
    PIKA = "Pikachu";
    
    System.out.println("You encountered a wild " + CHARIZARD + "!");
    Thread.sleep(500);
    System.out.println("Charizard's Health: " + c_health);
    
    Thread.sleep(1500);
    
    System.out.println("\nGO! " + PIKA + "!");
    pMoveSet mvs1 = new pMoveSet();
    
    do {
      Thread.sleep(3000);
      System.out.println();
      System.out.println("Your turn!");
      pMoveSet mvs2 = new pMoveSet();
    }while(c_health >= 0);
  }
}

class Main {
  
  public static void main(String[] args) throws InterruptedException {
    game ex = new game();
    // Instantiating "game" to run the whole program
  }
}
