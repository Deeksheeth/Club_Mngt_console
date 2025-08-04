package DAO;

public class Playerdetails {
    private int playerid;
    private String playername;
    private int playerage;
    private int jerseynumber;
    private String position;
    private String nationality;
    private int matchesplayed;
    private int goals;
    private int assists;
    private int contractstart;
    private int contractend;
    private double salary;
//    private boolean isCaptain;

    public Playerdetails(int id, String name, int age, int jno, String pos, String nantionality, int matches, int goals, int assists, int constart, int conend, double salary) {
        this.playerid = playerid;
        this.playername = playername;
        this.playerage = playerage;
        this.jerseynumber = jerseynumber;
        this.position = position;
        this.nationality = nationality;
        this.matchesplayed = matchesplayed;
        this.goals = this.goals;
        this.assists = this.assists;
        this.contractstart = contractstart;
        this.contractend = contractend;
        this.salary = this.salary;
//        this.isCaptain = isCaptain;
    }

    public int getPlayerid() {
        return playerid;
    }

    public void setPlayerid(int playerid) {
        this.playerid = playerid;
    }

    public String getPlayername() {
        return playername;
    }

    public void setPlayername(String playername) {
        this.playername = playername;
    }

    public int getPlayerage() {
        return playerage;
    }

    public void setPlayerage(int playerage) {
        this.playerage = playerage;
    }

    public int getJerseynumber() {
        return jerseynumber;
    }

    public void setJerseynumber(int jerseynumber) {
        this.jerseynumber = jerseynumber;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getMatchesplayed() {
        return matchesplayed;
    }

    public void setMatchesplayed(int matchesplayed) {
        this.matchesplayed = matchesplayed;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

//    public boolean isCaptain() {
//        return isCaptain;
//    }
//
//    public void setCaptain(boolean captain) {
//        isCaptain = captain;
//    }

    @Override
    public String toString() {
        return "{" +
                "playerid=" + playerid +
                ", playername='" + playername + '\'' +
                ", playerage='" + playerage + '\'' +
                ", jerseynumber=" + jerseynumber +
                ", position='" + position + '\'' +
                ", nationality='" + nationality + '\'' +
                ", matchesplayed=" + matchesplayed +
                ", goals=" + goals +
                ", assists=" + assists +
                ", contractstart=" + contractstart +
                ", contractend=" + contractend +
                ", salary=" + salary +
//                ", isCaptain=" + isCaptain +
                '}';
    }
}
