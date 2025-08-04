package Controller;

import DAO.TeamDetails;
import Model.TeamDetailsDB;

import java.util.List;
import java.util.Scanner;

public class Teamdetails_controller implements TeamDetails_interface {
    private TeamDetailsDB teamdetailsDB = new TeamDetailsDB();

    @Override
    public void addTeamdetails(TeamDetails s) {
        teamdetailsDB.addDB(s);
    }

    @Override
    public List<TeamDetails> getTeamDetails() {
        return teamdetailsDB.getDB();
    }

//    @Override
//    public List<TeamDetails> updateTeamDetails(String teamId) {
////        Scanner sc = new Scanner(System.in);
//        TeamDetails teamDetails = new TeamDetails();
//        if (teamId.equals(teamDetails.getTeamid())){
//
//        }
//        return List.of();
//    }


}
