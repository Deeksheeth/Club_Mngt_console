package Model;

import DAO.TeamDetails;

import java.util.ArrayList;
import java.util.List;

public class TeamDetailsDB {
    private static List<TeamDetails> list = new ArrayList<TeamDetails>();
    public static void addDB(TeamDetails teamDetails) {
        list.add(teamDetails);
    }
    public static List<TeamDetails> getDB() {

        return list;
    }

}
