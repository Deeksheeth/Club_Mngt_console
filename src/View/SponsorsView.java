package View;

import Controller.SponsorsDetails_controller;
import DAO.Sponsors;

import java.util.Scanner;

public class SponsorsView {
    static Scanner sc = new Scanner(System.in);

    public static void addSponsor() {
        System.out.println("Enter the name of the sponsor : ");
        String name = sc.nextLine();
        System.out.println("Enter the sponsor shares : ");
        double sponsorshares = sc.nextInt(); sc.nextLine();
        System.out.println("Enter the contract start year : ");
        int startYear = sc.nextInt(); sc.nextLine();
        System.out.println("Enter the contract end year : ");
        int endYear = sc.nextInt(); sc.nextLine();

        Sponsors sponsors = new Sponsors( name, sponsorshares, startYear, endYear);
        SponsorsDetails_controller controller = new SponsorsDetails_controller();
        controller.addSponsorsdetails(sponsors);

    }

    public static void viewSponsors() {
        SponsorsDetails_controller controller = new SponsorsDetails_controller();
        System.out.println(controller.getSponsorsDetails());
    }
}
