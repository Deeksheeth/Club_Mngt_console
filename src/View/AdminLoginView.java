package View;

import DAO.AdminLogin;
import DAO.TeamDetails;
import View.Main1;
import java.util.Scanner;

public class AdminLoginView {
    static Scanner sc = new Scanner(System.in);
    static AdminLogin admin = new AdminLogin("Deeksheeth","Dk123");
    public static void validate(String username,String pass) {
        if (admin.getUsername().equals(username) && admin.getPassword().equals(pass)) {
            Teamdetailsview teamdetails = new Teamdetailsview();
            teamdetails.addteamdetails();
            boolean b = true;
            while (b) {
                System.out.println("1. About Team");
                System.out.println("2. About Coaching Staffs");
                System.out.println("3. About Sponsors");
                System.out.println("4. About Players");
                System.out.println("5. Exit");
                int a = sc.nextInt(); sc.nextLine();
                Main1 main = new Main1();
                switch (a) {
                    case 1: {
                        main.team();
                        break;
                    }
                    case 2: {
                        main.staff();
                        break;
                    }
                    case 3:{
                        main.sponsors();
                    }
                    case 4:{
                        main.players();
                        break;
                    }
                    case 5:{
                        b=false;
                        return;
                    }
                    default:
                        break;
                }
            }
        }
        else {
            System.out.println("Invalid Login");
        }
    }

}
