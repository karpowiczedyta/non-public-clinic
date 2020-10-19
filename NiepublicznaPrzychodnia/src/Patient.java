
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Patient implements Serializable {

    private static final long SerialVersionUID =1L;
    
public static List<Patient> listOfPatients =  new ArrayList<Patient>();    
private String name;
private String surname;
private String pesel;
private String dateOfBirth;
private String address;
private long telephone;
private String email;
public List<String> autorizedPeopleToHealthInformationList = new ArrayList<>();
public List<String> autorizedPeopleToMedicalRecorsList = new ArrayList<>();
private String nameAndSurname1;
private String nameAndSurname2;

public Patient()
{
    
}


public Patient(String name , String surname , String pesel , String dateOfBirth , String address,long telephone,String email )
{
    this.name = name;
    this.surname = surname ; 
    this.pesel = pesel;
    this.dateOfBirth = dateOfBirth;
    this.address = address;
    this.telephone = telephone;
    this.email = email;
}

  

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

public void setSurame(String surname)
{
    this.surname = surname;
}
 
public String getPesel()
{
    return pesel;
}

public void setPesel(String pesel)
{
    this.pesel = pesel;
}

public String getDate()
{
    return dateOfBirth;
}

public void setDate(String dateOfBirth)
{
    this.dateOfBirth = dateOfBirth;
    
}
public String getAddress()
{
    return address;
}

public void setAddress(String address)
{
    this.address = address;
}

public long getTelephone()
{
    return telephone;
}

public void setTelephone(long telephone)
{
    this.telephone = telephone;
}

public String getEmail()
{
    return email;
}

public void setEmail(String email)
{
    this.email = email;
}

public String getNameAndSurname1()
{
    return nameAndSurname1;
}

public void setNameAndSurname1(String nameAndSurname1)
{
    this.nameAndSurname1 = nameAndSurname1;
}

public String getNameAndSurname2()
{
    return nameAndSurname2;
}

public void setNameAndSurname2(String nameAndSurname2)
{
    this.nameAndSurname2 = nameAndSurname2;
}

}
