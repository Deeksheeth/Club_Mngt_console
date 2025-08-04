import DAO.AdminLogin;
import View.AdminLoginView;
import View.SponsorsView;
import View.StaffsView;
import View.Teamdetailsview;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean b=true;
        while (b){
           System.out.println("1. AdminLogin ");
           System.out.println("2. AdminLogout ");

            int n = sc.nextInt();
            sc.nextLine();
            switch (n){
                case 1 : {
                    System.out.println("Enter username : ");
                    String username = sc.nextLine();
                    System.out.println("Enter password : ");
                    String pass=sc.nextLine();
                    AdminLoginView admin = new AdminLoginView();
                    admin.validate (username,pass);
                    break;
                }
                case 2 : {
                    b = false;
                    System.out.println("Successfully Logged Out");
                    break;
                }
                default: break;
            }

        }

//        Teamdetailsview teamdetailsview = new Teamdetailsview();
//        teamdetailsview.addteamdetails();
//        teamdetailsview.getTeamdetails();
//
//        StaffsView staffsview = new StaffsView();
//        staffsview.addStaff();
//        staffsview.viewStaffDetails();
//
//        SponsorsView sponsorsview = new SponsorsView();
//        sponsorsview.addSponsor();
//        sponsorsview.viewSponsors();


        }
    }