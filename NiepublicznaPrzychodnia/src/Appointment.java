
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Appointment implements Serializable {
    
    private static final long SerialVersionUID =1L;
    
    public static List<Appointment> appointmentList = new ArrayList<>();
    
    private Patient patient;
    private Employee employee;
    private MedicalActivities medicalActivities;
    private String numberOfCabinet;
    private String date;
    private int hour;
    
    
    public Appointment(Patient patient, Employee employee, MedicalActivities medicalActivities, String numberOfCabinet, String date,int hour) {
        this.patient = patient;
        this.employee = employee;
        this.medicalActivities = medicalActivities;
        this.numberOfCabinet = numberOfCabinet;
        this.date = date;
        this.hour=hour;
    }
    
     public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public MedicalActivities getMedicalActivities() {
        return medicalActivities;
    }

    public void setMedicalActivities(MedicalActivities medicalActivities) {
        this.medicalActivities = medicalActivities;
    }

    public String getNumberOfCabinet() {
        return numberOfCabinet;
    }

    public void setNumberOfCabinet(String numberOfCabinet) {
        this.numberOfCabinet = numberOfCabinet;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }
    
    
   public static void makeAnAppointment(
        Patient patient, Employee employee, 
        MedicalActivities medicalActivities, String numberOfCabinet, String date , int hour) {
        Appointment a = new Appointment(patient, employee, medicalActivities, numberOfCabinet, date,hour);
        boolean ifFree = true;
        
        if(appointmentList.contains(a)) {
            System.out.println("Wizyta dla wskazanego pacjenta już została zarejestrowana w systemie.");
        } 
        
        for(Appointment appointment : appointmentList) {
            if(appointment.getDate().equals(date) || appointment.getHour()== hour || appointment.getEmployee().getSurname().equals(employee.getSurname()) ){
                ifFree = false;
            } 
        }
        
        if(ifFree) {
            appointmentList.add(a);
        } else {
             System.out.println("Termin zajety , wybierz inny!!.");
        }
    } 
    
    
}
