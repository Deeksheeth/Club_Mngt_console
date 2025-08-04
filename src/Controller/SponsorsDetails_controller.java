package Controller;

import DAO.Sponsors;
import Model.SponsorsDB;

import java.util.List;

public class SponsorsDetails_controller implements Sponsors_interface {
    private static SponsorsDB sponsorsDB = new SponsorsDB();


    @Override
    public void addSponsorsdetails(Sponsors s) {

        sponsorsDB.addDB(s);
    }

    @Override
    public List<Sponsors> getSponsorsDetails() {
        return sponsorsDB.getDB();
    }

}
