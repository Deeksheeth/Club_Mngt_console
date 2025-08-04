package DAO;

public class Schedule {
    private int teamid;
    private int opponentteamid;
    private String teamName;
    private String opponentTeamName;
    private String date;
    private String time;
    private String venue;

    public Schedule(int teamid, int opponentteamid, String teamName, String opponentTeamName, String date, String time, String venue) {
        this.teamid = teamid;
        this.opponentteamid = opponentteamid;
        this.teamName = teamName;
        this.opponentTeamName = opponentTeamName;
        this.date = date;
        this.time = time;
        this.venue = venue;
    }

    public int getTeamid() {
        return teamid;
    }

    public void setTeamid(int teamid) {
        this.teamid = teamid;
    }

    public int getOpponentteamid() {
        return opponentteamid;
    }

    public void setOpponentteamid(int opponentteamid) {
        this.opponentteamid = opponentteamid;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getOpponentTeamName() {
        return opponentTeamName;
    }

    public void setOpponentTeamName(String opponentTeamName) {
        this.opponentTeamName = opponentTeamName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    @Override
    public String toString() {
        return "{" +
                "teamid=" + teamid +
                ", opponentteamid=" + opponentteamid +
                ", teamName='" + teamName + '\'' +
                ", opponentTeamName='" + opponentTeamName + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", venue='" + venue + '\'' +
                '}';
    }
}
