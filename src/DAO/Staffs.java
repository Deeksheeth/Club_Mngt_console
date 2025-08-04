package DAO;

public class Staffs {
    private int idc=1;
    private static int staff_id;
    private static String staff_name;
    private String nationality;
    private int staff_age;
    private String staff_role;
    private double staff_salary;
    private int contractstart;
    private int contractend;

    public Staffs(String staff_name, String nationality, int staff_age, String staff_role, double staff_salary, int contractstart, int contractend) {
//        this.staff_id = idc++;
        this.staff_name = staff_name;
        this.nationality = nationality;
        this.staff_age = staff_age;
        this.staff_role = staff_role;
        this.staff_salary = staff_salary;
        this.contractstart = contractstart;
        this.contractend = contractend;
    }

    public int getStaff_id() {
        return staff_id;
    }

    public static void setStaff_id(int staff_id) {
        Staffs.staff_id = staff_id;
    }

    public String getStaff_name() {
        return staff_name;
    }

    public void setStaff_name(String staff_name) {
        this.staff_name = staff_name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getStaff_age() {
        return staff_age;
    }

    public void setStaff_age(int staff_age) {
        this.staff_age = staff_age;
    }

    public String getStaff_role() {
        return staff_role;
    }

    public void setStaff_role(String staff_role) {
        this.staff_role = staff_role;
    }

    public double getStaff_salary() {
        return staff_salary;
    }

    public void setStaff_salary(double staff_salary) {
        this.staff_salary = staff_salary;
    }

    public int getContractstart() {
        return contractstart;
    }

    public void setContractstart(int contractstart) {
        this.contractstart = contractstart;
    }

    public int getContractend() {
        return contractend;
    }

    public void setContractend(int contractend) {
        this.contractend = contractend;
    }

    @Override
    public String toString() {
        return
                "{ staff_id=" + staff_id +
                ", staff_name='" + staff_name + '\'' +
                ", nationality='" + nationality + '\'' +
                ", staff_age=" + staff_age +
                ", staff_role='" + staff_role + '\'' +
                ", staff_salary=" + staff_salary +
                ", contractstart='" + contractstart + '\'' +
                ", contractend='" + contractend + '\'' +
                '}';
    }
}
