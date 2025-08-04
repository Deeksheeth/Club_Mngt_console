package View;

import Controller.Players_controller;
import DAO.Playerdetails;

import java.util.Scanner;

public class PlayerdetalsView {
    static Scanner sc=new Scanner(System.in);
    public static void addPlayersDetails(){
        System.out.println("Enter playerid : ");
        int id = sc.nextInt(); sc.nextLine();
        System.out.println("Enter the name of the player : ");
        String name = sc.nextLine();
        System.out.println("Enter the age of the player : ");
        int age = sc.nextInt(); sc.nextLine();
        System.out.println("Enter jersey number of the player : ");
        int jno = sc.nextInt(); sc.nextLine();
        System.out.println("Enter the position of the player : ");
        String pos=sc.nextLine();
        System.out.println("Nationality : ");
        String nantionality=sc.nextLine();
        System.out.println("Enter matches played : ");
        int matches=sc.nextInt(); sc.nextLine();
        System.out.println("Total Carrer Goals : ");
        int goals = sc.nextInt(); sc.nextLine();
        System.out.println("Total Carrer Assists : ");
        int assists =sc.nextInt(); sc.nextLine();
        System.out.println("Total Contract starting year : ");
        int constart= sc.nextInt(); sc.nextLine();
        System.out.println("Total Contract ending year : ");
        int conend= sc.nextInt(); sc.nextLine();
        System.out.println("Enter Salary : ");
        double salary= sc.nextInt();

        Playerdetails details=new Playerdetails(id,name,age,jno,pos,nantionality,matches,goals,assists,constart,conend,salary);
        Players_controller controller=new Players_controller();
        controller.addPlayerDetails(details);
    }

    public static void viewPlayerdetails(){
        Players_controller controller=new Players_controller();
        System.out.println(controller.getPlayerDetails());
    }
}
