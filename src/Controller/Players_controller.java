package Controller;

import DAO.Playerdetails;
import Model.PlayersDB;

import java.util.List;

public class Players_controller implements Players_inteface {
    private static PlayersDB db = new PlayersDB();

    @Override
    public void addPlayerDetails(Playerdetails s){
        db.addDB(s);
    }

    @Override
    public List<Playerdetails> getPlayerDetails() {
        return db.getDB();
    }
}
