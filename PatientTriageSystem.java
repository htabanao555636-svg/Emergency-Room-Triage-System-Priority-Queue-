package hampri;

import java.util.*;

public class  PatientTriageSystem {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    ERQueue er = new ERQueue();

 

    boolean running = true;

    while (running) {

      System.out.println("\n=== ER TRIAGE MENU === \n");

      System.out.println( "[1] ADD PATIENT ");

      System.out.println("[2] DISPLAY ");

      System.out.println("[3] TREAT NEXT PATIENT ");

      System.out.println("[4] EXIT ");

      System.out.println("ENTER CHOICE :");

      

      int choice = sc.nextInt();

       

      sc.nextLine(); 

 

      switch (choice) {

        case 1:

          System.out.print("Enter patient name: ");
          String name = sc.nextLine();

 
          System.out.print("Enter priority (1=Critical, 2=Serious, 3=Stable, 4=Minor): ");
          int priority = sc.nextInt();
          sc.nextLine();

 
          System.out.print("Enter condition: ");
          String condition = sc.nextLine();

 

          System.out.print("Enter arrival time (HH:MM): ");
          String time = sc.nextLine();

 
          er.arrive(name, priority, condition, time);  

          	break;

 

        case 2:

          er.displayQueue();

          break;

 

        case 3:

          er.treatNext();

          break;

 

        case 4:

          running = false;

          System.out.println("Exiting ER system...");

          break;

 

        default:

          System.out.println("Invalid choice, try again.");

      }

    }

    sc.close();

  }

}

