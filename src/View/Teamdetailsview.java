package View;

import Controller.Teamdetails_controller;
import DAO.TeamDetails;
import java.util.Scanner;

public class Teamdetailsview {
    //    private TeamDetails teamDetails = new TeamDetails();
     static Scanner sc = new Scanner(System.in);

    public void addteamdetails() {
        System.out.println("Enter Team Id : ");
//        String teamid = "FCB11";
        String teamId = sc.nextLine();
        System.out.println("Enter Team Name : ");
//        String teamame = "FC Barcelona";
        String teamName = sc.nextLine();
        System.out.println("Enter total no. of players : ");
        int totalPlayers = sc.nextInt();
        System.out.println("Enter owner name : ");
        sc.nextLine();
        String ownerName = sc.nextLine();
        System.out.println("Enter headcoach name : ");
        String headCoachName = sc.nextLine();
        System.out.println("Enter captain name : ");
        String captainName = sc.nextLine();
        System.out.println("Enter net worth of the team : ");
        int netWorth = sc.nextInt();
        TeamDetails details = new TeamDetails(teamId, teamName, totalPlayers, ownerName, headCoachName, captainName, netWorth);
        Teamdetails_controller controller = new Teamdetails_controller();
        controller.addTeamdetails(details);
    }


    public void getTeamdetails() {
        Teamdetails_controller controller = new Teamdetails_controller();
        System.out.println(controller.getTeamDetails());
    }

//    public void updatedetails() {
//        Teamdetails_controller controller = new Teamdetails_controller();
//        System.out.println("Enter TeamId to be updated");
//        String teamId = sc.nextLine();
//        System.out.println(controller.updateTeamDetails(teamId));
//
//    }
}