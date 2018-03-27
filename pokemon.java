package pokemon;

import java.util.Scanner;
import java.util.Random;

class pokemon {
  private final String CHARIZARD;
  private String pika;
  private int health;
  private String moves;
  
  public pokemon() throws InterruptedException {
    Scanner key = new Scanner(System.in);
    
    CHARIZARD = "Charizard";
    pika = "Pikachu";
    health = 120;
    System.out.println("You encountered a wild " + CHARIZARD + "!");
    System.out.println("Charizard's Health: " + health);
    System.out.println();
    
    Thread.sleep(1500);
    
    System.out.println("GO! " + pika + "!");
    System.out.println("Moves: \n(1) Thunderbolt \n(2) Tackle (3) Double-Team");
    int chooseMove = key.nextInt();
    switch(chooseMove) {
      case 1:
        // hold
        
      case 2:
        // hold
        
      case 3:
        // hold
        
      case 4:
        // hold
        
      default:
      System.out.println("Error!");
        continue;
    }
    
    
    System.out.println("Charizard's Health: " + health);
    
    
  }
}

class Main {
  
  public static void main(String[] args) throws InterruptedException {
    pokemon ex = new pokemon();
  }
}
