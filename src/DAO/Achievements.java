package DAO;

public class Achievements {
    private int teamid;
    private int trophies;
    private String trophies_name;
    private String individualawards;

    public Achievements(int teamid, int trophies, String trophies_name, String individualawards) {
        this.teamid = teamid;
        this.trophies = trophies;
        this.trophies_name = trophies_name;
        this.individualawards = individualawards;
    }

    public int getTeamid() {
        return teamid;
    }

    public void setTeamid(int teamid) {
        this.teamid = teamid;
    }

    public int getTrophies() {
        return trophies;
    }

    public void setTrophies(int trophies) {
        this.trophies = trophies;
    }

    public String getTrophies_name() {
        return trophies_name;
    }

    public void setTrophies_name(String trophies_name) {
        this.trophies_name = trophies_name;
    }

    public String getIndividualawards() {
        return individualawards;
    }

    public void setIndividualawards(String individualawards) {
        this.individualawards = individualawards;
    }

    @Override
    public String toString() {
        return "{" +
                "teamid=" + teamid +
                ", trophies=" + trophies +
                ", trophies_name='" + trophies_name + '\'' +
                ", individualawards='" + individualawards + '\'' +
                '}';
    }
}
