package Controller;

import DAO.Playerdetails;

import java.util.List;

public interface Players_inteface {
    void addPlayerDetails(Playerdetails s);

    List<Playerdetails> getPlayerDetails() ;
}
