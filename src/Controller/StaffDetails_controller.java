package Controller;

import DAO.Staffs;
import Model.StaffDetailsDB;

import java.util.ArrayList;
import java.util.List;

public class StaffDetails_controller implements StaffDetails_interface {
    private static StaffDetailsDB staffDetailsDB = new StaffDetailsDB();

    @Override
    public void addStaffdetails(Staffs s) {
        staffDetailsDB.addDB(s);
    }

    @Override
    public List<Staffs> getStaffDetails() {
        return staffDetailsDB.getDB();
    }

    @Override
    public void updateStaffDetails(Staffs updatedDetails,int id) {
        List<Staffs> upd = staffDetailsDB.getDB();
        for(int i = 0; i < upd.size(); i++){
            if(upd.get(i).getStaff_id() == id){
                staffDetailsDB.updteDB(updatedDetails,i);
                break;
            }
        }
    }
}
