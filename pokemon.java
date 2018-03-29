package pokemon;

import java.util.Scanner;
import java.util.Random;

class moveSet {
  
  private int flamethrower;
  private int fly;
  private int smokescreen;
  private int struggle;
  public int p_health = 90;
  
  public moveSet() throws InterruptedException {
    flamethrower = 25;
    fly = 20;
    smokescreen = 5;
    struggle = 10;
    
    System.out.println();
    System.out.println("Charizard's turn! ");
    System.out.println();
    Thread.sleep(1000);
    int moveRand = (int) (Math.random() * 4 + 1);
    if(moveRand == 1) {
      Thread.sleep(1000);
      
      System.out.println();
      System.out.println("Charizard used Flamethrower! ");
      Thread.sleep(1000);
      
      p_health = p_health - flamethrower;
      System.out.println("Pikachu has " + p_health + " health left!");
      if(p_health == 0) {
          System.out.println("Pikachu has been knocked out!");
          System.out.println("Game over! ");
          return;
      }
    }
    if(moveRand == 2) {
      Thread.sleep(1000);
      
      System.out.println();
      System.out.println("Charizard used Fly! ");
      Thread.sleep(1000);
      
      p_health = p_health - fly;
      System.out.println("Pikachu has " + p_health + " health left!");
      if(p_health == 0) {
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

class p_moveSet {
  private final String CHARIZARD;
  private String pika;
  public static int c_health = 120;
  public static int p_health = 90;
  private String moves;
  private int thunderbolt;
  private int tackle;
  private int dteam;
  private int flamethrower;
  private int fly;
  private int smokescreen;
  private int struggle;
  private int miss;
  
  public p_moveSet() throws InterruptedException {
    Scanner key = new Scanner(System.in);
    
    thunderbolt = 30;
    tackle = 15;
    dteam = 5;
    flamethrower = 35;
    fly = 20;
    smokescreen = 5;
    struggle = 10;
    
    CHARIZARD = "Charizard";
    pika = "Pikachu";
    
    miss = (int)(Math.random() * 10);
    
    System.out.println("Moves: \n(1) Thunderbolt \n(2) Tackle \n(3) Double-Team");
    System.out.print("> ");
    int chooseMove = key.nextInt();
    switch(chooseMove) {
      case 1:
        System.out.println(pika + " used Thunderbolt!");
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
                System.out.println("Game over! ");
                System.out.println("You win!");
                break;
            }
            moveSet atk1 = new moveSet();
        }
      break;
        
      case 2:
        System.out.println(pika + " used Tackle!");
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
            System.out.println("Game over! ");
            System.out.println("You win!");
            break;
            }
        }
        moveSet atk2 = new moveSet();
       break;
        
      case 3:
        System.out.println(pika + " used Double-Team!");
        System.out.println();
        Thread.sleep(1000);
        System.out.println("Pikachu's speed went up by " + dteam + "!");
        moveSet atk3 = new moveSet();
        break;
        
      case 4:
        System.out.println(pika + " used Struggle!");
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
          System.out.println("Game over! ");
          System.out.println("You win!");
          return;
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
  private final String CHARIZARD;
  private String pika;
  public static int c_health;
  public static int p_health;
  private int thunderbolt;
  private int tackle;
  private int dteam;
  private int flamethrower;
  private int fly;
  private int smokescreen;
  private int struggle;
  
  public game() throws InterruptedException {
    Scanner key = new Scanner(System.in);
    
    thunderbolt = 30;
    tackle = 15;
    dteam = 5;
    flamethrower = 25;
    fly = 20;
    smokescreen = 5;
    struggle = 10;
    
    c_health = 120;
    
    CHARIZARD = "Charizard";
    pika = "Pikachu";
    
    System.out.println("You encountered a wild " + CHARIZARD + "!");
    Thread.sleep(500);
    System.out.println("Charizard's Health: " + c_health);
    System.out.println();
    
    Thread.sleep(1500);
    
    System.out.println("GO! " + pika + "!");
    p_moveSet mvs1 = new p_moveSet();
    
    Thread.sleep(3000);
    System.out.println();
    System.out.println("Your turn!");
    p_moveSet mvs2 = new p_moveSet();
    
    Thread.sleep(3000);
    System.out.println();
    System.out.println("Your turn!");
    p_moveSet mvs3 = new p_moveSet();
    
    Thread.sleep(3000);
    System.out.println();
    System.out.println("Your turn!");
    p_moveSet mvs4 = new p_moveSet();
    
    Thread.sleep(3000);
    System.out.println();
    System.out.println("Your turn!");
    p_moveSet mvs5 = new p_moveSet();
    
    Thread.sleep(3000);
    System.out.println();
    System.out.println("Your turn!");
    p_moveSet mvs6 = new p_moveSet();
    
    Thread.sleep(3000);
    System.out.println();
    System.out.println("Your turn!");
    p_moveSet mvs7 = new p_moveSet();
  }
}

class Pokemon {
  
  public static void main(String[] args) throws InterruptedException {
    game ex = new game();
  }
}
