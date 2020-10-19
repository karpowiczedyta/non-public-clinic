
import static java.awt.PageAttributes.MediaType.C;
import java.io.*;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class SaveToFile implements Serializable{
    
     public static void savePatient(List<Patient> list,String path) {
        try{
            ObjectOutputStream outS = new ObjectOutputStream(new FileOutputStream(path));
            
            outS.writeObject(list);
            
            outS.close();
            
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public static void saveGraphic(List<Graphic> list,String path) {
        try{
            ObjectOutputStream outS = new ObjectOutputStream(new FileOutputStream(path));
            
            outS.writeObject(list);
            
            outS.close();
        } catch (Exception e){
          System.out.println(e.getMessage());
        }
    }
    
        public static void saveAppointment(List<Appointment> list,String path) {
        try{
            ObjectOutputStream outS = new ObjectOutputStream(new FileOutputStream(path));
            
            outS.writeObject(list);
            
            outS.close();
            
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

     public static void readPatient(List<Patient> list,DefaultTableModel model,String path) {
        try 
        {
            ObjectInputStream inS = new ObjectInputStream(new FileInputStream(path));
            List<Patient> readList = (List<Patient>)inS.readObject();
            for(Patient p : readList)
            {
                list.add(p);
                model.addRow(new Object[]{p.getName(),p.getSurname(),p.getPesel(),p.getDate(),p.getAddress(),p.getTelephone(),p.getEmail()}); 
            }
            inS.close();
        } catch (Exception e) 
        {
           System.out.println(e.getMessage());
        }
    }
     
     public static void readAppointment(List<Appointment> list,DefaultTableModel model,String path) {
        try 
        {
            ObjectInputStream inS = new ObjectInputStream(new FileInputStream(path));
            List <Appointment> readList = (List<Appointment>)inS.readObject();
            
            for(Appointment a : readList )
            {
                list.add((a));
            
            model.addRow(new Object[]{a.getPatient().getName(),a.getPatient().getSurname(),a.getEmployee().getName(),a.getEmployee().getSurname(),
            a.getMedicalActivities().getMedicalActivities(),a.getNumberOfCabinet(),a.getDate(),a.getHour()});
            
            }
            inS.close();
            
        } catch (Exception e) 
        {
            System.out.println(e.getMessage());
        }
    }
     
     public static void readGraphic(List<Graphic> list,DefaultTableModel model,String path) {
        try 
        {
            ObjectInputStream o = new ObjectInputStream(new FileInputStream(path));
            List<Graphic> readList = (List<Graphic>) o.readObject();
            
            for(Graphic graphic : readList )
            {
                
                list.add( graphic);
                model.addRow(new Object[]{graphic.employee.getName(),graphic.employee.getSurname(),graphic.numberOfCabinet.getNumberOfCabinet(),graphic.getDate(),graphic.getTheOpeningHoursOfWork(),graphic.getTheClosingHoursOfWork()});
        
            }                                        
             o.close();
        }
           catch (Exception e) 
        {
           System.out.println(e.getMessage());
        }
           
        } 
    }
  


