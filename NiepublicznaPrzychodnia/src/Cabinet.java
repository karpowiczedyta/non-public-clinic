
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class Cabinet implements Serializable{
    
    private String numberOfCabinet;  
    
    public static List<Cabinet> listOfCabinets = new ArrayList<Cabinet>();
    
    public Cabinet (String numberOfCabinet) {
        this.numberOfCabinet = numberOfCabinet;
    }
     
    public String getNumberOfCabinet()
    {
        return numberOfCabinet;
    }
    
    public void setNumberOfCabinet(String numberOfCabinet)
    {
        this.numberOfCabinet = numberOfCabinet;
    }
    
    
}
