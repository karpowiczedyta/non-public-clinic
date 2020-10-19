
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class Employee implements Serializable {
    
    private String name;
    private String surname;
    private int yearOfStartingWork;
    public static List<Employee> listOfEmployee = new ArrayList<Employee>();
    public  List<MedicalActivities> listOfMedicalActivities1 = new ArrayList<MedicalActivities>() ;
    
//    Employee(String name,String surname,int yearOfStartingWork)
//    {
//      this.name = name;
//      this.surname = surname;
//      this.yearOfStartingWork = yearOfStartingWork;
//      
//    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
        
    }
    public String getSurname()
    {
        return surname;
    }
    
    public void setSurname(String surname)
    {
        this.surname = surname;
        
    }
    
    public int getYearOfStartingWork()
    {
        return yearOfStartingWork;
    }
    
    public void setYearOfStartingWork(int yearOfStartingWork )
    {
        this.yearOfStartingWork = yearOfStartingWork;
        
    }
    
//     public static List<MedicalActivities> getMedicalActivities()
//    {
//        return listOfMedicalActivities;
//    }
//
//     
//     
//       public  void setMedicalActivities(List<MedicalActivities> listOfMedicalActivities )
//    {
//        this.listOfMedicalActivities = listOfMedicalActivities;
//    }
//       
    
    
   
       
   }


