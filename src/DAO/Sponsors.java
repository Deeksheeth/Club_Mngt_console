package DAO;

public class Sponsors {
    private static int sponsorid=1;
    private String sponsorname;
    private double sponsoramount;
    private int contractstart;
    private int contractend;

    public Sponsors( String sponsorname, double sponsoramount, int contractstart, int contractend) {
        sponsorid = sponsorid++;
        this.sponsorname = sponsorname;
        this.sponsoramount = sponsoramount;
        this.contractstart = contractstart;
        this.contractend = contractend;
    }

    public static int getSponsorid() {
        return sponsorid;
    }

    public static void setSponsorid(int sponsorid) {
        Sponsors.sponsorid = sponsorid;
    }

    public String getSponsorname() {
        return sponsorname;
    }

    public void setSponsorname(String sponsorname) {
        this.sponsorname = sponsorname;
    }

    public double getSponsoramount() {
        return sponsoramount;
    }

    public void setSponsoramount(double sponsoramount) {
        this.sponsoramount = sponsoramount;
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
        return "{" +
                "sponsorid=" + sponsorid +
                ", sponsorname='" + sponsorname + '\'' +
                ", sponsoramount=" + sponsoramount +
                ", contractstart='" + contractstart + '\'' +
                ", contractend='" + contractend + '\'' +
                '}';
    }
}
