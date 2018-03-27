package pokemon;

import java.util.Scanner;
import java.util.Random;

class pokemon {
  private final String CHARIZARD;
  private String pika;
  private int c_health;
  private int p_health;
  private String moves;
  private int thunderbolt;
  private int tackle;
  private int dteam;
  private int flamethrower;
  private int fly;
  private int smokescreen;
  private int struggle;
  
  public pokemon() throws InterruptedException {
    Scanner key = new Scanner(System.in);
    
    thunderbolt = 30;
    tackle = 15;
    dteam = 5;
    flamethrower = 25;
    fly = 20;
    smokescreen = 5;
    struggle = 10;
    
    c_health = 120;
    p_health = 90;
    
    CHARIZARD = "Charizard";
    pika = "Pikachu";
    
    System.out.println("You encountered a wild " + CHARIZARD + "!");
    System.out.println("Charizard's Health: " + c_health);
    System.out.println();
    
    Thread.sleep(1500);
    
    System.out.println("GO! " + pika + "!");
    System.out.println("Moves: \n(1) Thunderbolt \n(2) Tackle \n(3) Double-Team");
    System.out.print("> ");
    int chooseMove = key.nextInt();
    switch(chooseMove) {
      case 1:
        System.out.println(pika + " used Thunderbolt!");
        System.out.println("It did " + thunderbolt + " damage!");
        
        Thread.sleep(1000);
        
        c_health = c_health - thunderbolt;
        System.out.println("Charizard has " + c_health + " health left");
        return;
        
      case 2:
        System.out.println(pika + " used Tackle!");
        System.out.println("It did " + tackle + " damage!");
        
        Thread.sleep(1000);
        
        c_health = c_health - tackle;
        System.out.println("Charizard has " + c_health + " health left");
        return;
        
      case 3:
        System.out.println(pika + " used Double-Team!");
        System.out.println("Pikachu's speed went up by " + dteam + "!");
        return;
        
      case 4:
        System.out.println(pika + " used Struggle!");
        System.out.println("It did " + struggle + " damage!");
        
        Thread.sleep(1000);
        
        c_health = c_health - struggle;
        System.out.println("Charizard has " + c_health + " health left");
        return;
        
      default:
        System.out.println("Error!");
        return;
    }
    
  }
}

class Main {
  
  public static void main(String[] args) throws InterruptedException {
    pokemon ex = new pokemon();
  }
}
