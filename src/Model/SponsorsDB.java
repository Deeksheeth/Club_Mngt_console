package Model;

import DAO.Sponsors;

import java.util.ArrayList;
import java.util.List;

public class SponsorsDB {
    private static List<Sponsors> list = new ArrayList<>();
    public static void addDB(Sponsors SponsorDetails) {

        list.add(SponsorDetails);
    }
    public static List<Sponsors> getDB() {
        return list;
    }
}
