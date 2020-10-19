
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Graphic implements Serializable {
    
    private static final long SerialVersionUID =1L;
    
    public static List<Graphic> graphicList = new ArrayList<Graphic>();
 
    Employee employee ;
    Cabinet numberOfCabinet;
    private String date;
    private int  theOpeningHoursOfWork;
    private int theClosingHoursOfWork;
    
   public String getDate()
   {
       return this.date;
   }
    
   
   public void setDate(String date)
   {
       this.date = date;
   }
   
    public int getTheOpeningHoursOfWork()
   {
       return this.theOpeningHoursOfWork;
   }
   
      public void setTheOpeningHoursOfWork(int theOpeningHoursOfWork)
   {
       this.theOpeningHoursOfWork = theOpeningHoursOfWork;
   }
   
   
     public int getTheClosingHoursOfWork()
   {
       return this.theClosingHoursOfWork;
   }
   
      public void setTheClosingHoursOfWork(int theClosingHoursOfWork)
   {
       this.theClosingHoursOfWork = theClosingHoursOfWork;
   }
   
//       public String getNumberOfCabinet()
//   {
//       return this.numberOfCabinet;
//   }
//    
//   
//   public void setNumberOfCabinet(String numberOfCabinet)
//   {
//       this.numberOfCabinet = numberOfCabinet;
//   }
    
}
