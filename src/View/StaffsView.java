package View;

import Controller.StaffDetails_controller;
import DAO.Staffs;

import java.util.Scanner;

public class StaffsView {
    static Scanner sc=new Scanner(System.in);
    private static int id=1;

    public static void addStaff() {
        System.out.println("Enter the name of your staff");
        String name=sc.nextLine();
        System.out.println("Nationality : ");
        String nationality=sc.nextLine();
        System.out.println("Enter the age of your staff");
        int age=sc.nextInt();
        System.out.println("Enter the role of the staff"); sc.nextLine();
        String role=sc.nextLine();
        System.out.println("Enter salary of the staff");
        double salary=sc.nextDouble();
        System.out.println("Enter the contract starting year : "); sc.nextLine();
        int contractYear=sc.nextInt();
        System.out.println("Enter the contract ending year : "); sc.nextLine();
        int contractEndingYear=sc.nextInt(); sc.nextLine();
        Staffs details = new Staffs(name, nationality,age, role, salary, contractYear, contractEndingYear);
        details.setStaff_id(id++);
        StaffDetails_controller controller = new StaffDetails_controller();
        controller.addStaffdetails(details);
    }

    public static void updatestaffDetails(){
        System.out.println("Enter the id to be updated : ");
        int id=sc.nextInt(); sc.nextLine();
        System.out.println("Enter the name to be updated : ");
        String name=sc.nextLine();
        System.out.println("Nationality to be updated : ");
        String nationality=sc.nextLine();
        System.out.println("Enter the age of your staff to be updated");
        int age=sc.nextInt();
        System.out.println("Enter the role of the staff to be updated : "); sc.nextLine();
        String role=sc.nextLine();
        System.out.println("Enter salary of the staff to be updated : ");
        double salary=sc.nextDouble();
        System.out.println("Enter the contract starting year to be updated : "); sc.nextLine();
        int contractYear=sc.nextInt();
        System.out.println("Enter the contract ending year to be updated : "); sc.nextLine();
        int contractEndingYear=sc.nextInt(); sc.nextLine();
        Staffs details = new Staffs(name, nationality,age, role, salary, contractYear, contractEndingYear);
        StaffDetails_controller controller = new StaffDetails_controller();
        controller.updateStaffDetails(details,id);

    }

    public static void viewStaffDetails() {
        StaffDetails_controller controller = new StaffDetails_controller();
        System.out.println(controller.getStaffDetails());
    }

}
