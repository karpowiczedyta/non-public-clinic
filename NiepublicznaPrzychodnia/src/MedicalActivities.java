
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class MedicalActivities implements Serializable{
   
    public static List<MedicalActivities> listOfMedicalActivities = new ArrayList<MedicalActivities>();
    
    private String medicalActivities;
    
//     MedicalActivities(String medicalActivities)
//    {
//        this.medicalActivities = medicalActivities;
//    }
    
           
    public String getMedicalActivities()
    {
        return medicalActivities;
    }
    
    public  void setMedicalActivities(String mdicalActivities )
    {
        this.medicalActivities = mdicalActivities; 
    }
   
}

