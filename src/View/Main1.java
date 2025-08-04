package View;

import DAO.Sponsors;

import java.util.Scanner;

public class Main1 {
    static Scanner sc = new Scanner(System.in);
    public static void team(){
        boolean b = true;
        while (b) {
            System.out.println("1. Updating Team Details");
            System.out.println("2. View Team Details");
            System.out.println("3. Exit");
            Teamdetailsview team = new Teamdetailsview();
            int e = sc.nextInt(); sc.nextLine();
            switch (e) {
                case 1:
//                    team.updatedetails();
                    System.out.println("Updated Successfully");
                    break;
                case 2:
                    team.getTeamdetails();
                    break;
                case 3:
                    b = false;
                    return;
                default:
                    break;
            }
        }
    }

    public static void staff(){
        boolean b=true;
        while (b) {
            System.out.println("1.Adding Coaching Staff Details");
            System.out.println("2.Updating Coaching Staff Details by ID");
            System.out.println("3. View Staff Details ");
            System.out.println("4. Exit");
            int e = sc.nextInt(); sc.nextLine();
            StaffsView staff = new StaffsView();
            switch (e) {
                case 1:
                    staff.addStaff();
                    break;
                case 2 :
                    staff.updatestaffDetails();
                    break;
                case 3:
                    staff.viewStaffDetails();
                    break;
                case 4:
                    b = false;
                    return ;
                default:
                    break;
            }
        }
    }

    public static void sponsors(){
        boolean b=true;
        while (b) {
            System.out.println("1.Adding Sponsor Details");
            System.out.println("2. View Sponsor Details ");
            System.out.println("3. Exit");
            int e = sc.nextInt(); sc.nextLine();
            SponsorsView sponsors = new SponsorsView();
            switch (e) {
                case 1:
                    sponsors.addSponsor();
                    break;
                case 2:
                    sponsors.viewSponsors();
                    break;
                case 3:
                    b=false;
                    return ;
                default:
                    break;
            }
        }
    }

    public static void players(){
        boolean b=true;
        while (b) {
            System.out.println("1.Adding Players Details");
            System.out.println("2. View Players Details ");
            System.out.println("3. Exit");
            int e = sc.nextInt(); sc.nextLine();
            PlayerdetalsView sponsors = new PlayerdetalsView();
            switch (e) {
                case 1:
                    sponsors.addPlayersDetails();
                    break;
                case 2:
                    sponsors.viewPlayerdetails();
                    break;
                case 3:
                    b = false;
                    return ;
                default:
                    break;
            }
        }
    }
}
