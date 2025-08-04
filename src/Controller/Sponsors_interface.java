package Controller;

import DAO.Sponsors;

import java.util.List;

public interface Sponsors_interface {
    void addSponsorsdetails(Sponsors s);

    List<Sponsors> getSponsorsDetails() ;

}
