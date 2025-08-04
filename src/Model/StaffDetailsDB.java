package Model;

import DAO.Staffs;

import java.util.ArrayList;
import java.util.List;

public class StaffDetailsDB {
    private static List<Staffs> list = new ArrayList<>();
    public static void addDB(Staffs staffDetails) {
        list.add(staffDetails);
    }
    public static List<Staffs> getDB() {
        return list;
    }

    public void updteDB(Staffs updateDetails, int n){
        list.set(n,updateDetails);
    }


}
