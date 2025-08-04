package Model;

import DAO.Playerdetails;

import java.util.ArrayList;
import java.util.List;

public class PlayersDB {
    static List<Playerdetails> players=new ArrayList<>();
    public static void addDB(Playerdetails s){
        players.add(s);
    }
    public static List<Playerdetails> getDB(){
        return players;
    }
}
