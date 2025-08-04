package Controller;

import DAO.Staffs;

import java.util.List;

public interface StaffDetails_interface {


    void addStaffdetails(Staffs s);

    List<Staffs> getStaffDetails() ;

    void updateStaffDetails(Staffs details,int id);
}
