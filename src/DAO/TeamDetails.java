package DAO;

public class TeamDetails {
    private String teamid;
    private String teamName;
    private int  totalplayers;
    private String owner;
    private String headcoach;
    private String captain;
    private int networth;

    public TeamDetails(String teamid, String teamName, int totalplayers, String owner, String headcoach, String captain, int networth) {
        this.teamid = teamid;
        this.teamName = teamName;
        this.totalplayers = totalplayers;
        this.owner = owner;
        this.headcoach = headcoach;
        this.captain = captain;
        this.networth = networth;
    }

    public String getTeamid() {
        return teamid;
    }

    public void setTeamid(String teamid) {
        this.teamid = teamid;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getTotalplayers() {
        return totalplayers;
    }

    public void setTotalplayers(int totalplayers) {
        this.totalplayers = totalplayers;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getHeadcoach() {
        return headcoach;
    }

    public void setHeadcoach(String headcoach) {
        this.headcoach = headcoach;
    }

    public String getCaptain() {
        return captain;
    }

    public void setCaptain(String captain) {
        this.captain = captain;
    }

    public int getNetworth() {
        return networth;
    }

    public void setNetworth(int networth) {
        this.networth = networth;
    }

    @Override
    public String toString() {
        return "{" +
                "teamid='" + teamid + '\'' +
                ", teamName='" + teamName + '\'' +
                ", totalplayers=" + totalplayers +
                ", owner='" + owner + '\'' +
                ", headcoach='" + headcoach + '\'' +
                ", captain='" + captain + '\'' +
                ", networth=" + networth +
                '}';
    }

}
