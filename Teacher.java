/**
 * creating a Teacher class
 * 
 * @author (Sanskriti Agrahari)
 * @version (20th Jan, 2024)
 */
public class Teacher {
    // attributes of the teacher class
    private int teacherId;
    private String teacherName;
    private String address;
    private String workingType;
    private String employmentStatus;
    private int workingHours;
    
    
    // constructor for the Teacher class
    public Teacher(int teacherId, String teacherName, String address, String workingType, String employmentStatus)
    {
     // assigning of parameter values to the attributes of the Teacher class
     this.teacherId=teacherId;
     this.teacherName=teacherName;
     this.address=address;
     this.workingType=workingType;
     this.employmentStatus=employmentStatus;
    }
    
    //getter method for teacherId attribute
    public int getTeacherId(){
        return this.teacherId;
    }
    
    // getter method for teacherName attribute
    public String getTeacherName(){
        return this.teacherName;
    }
    
    // getter method for address attribute
    public String getAddress(){
        return this.address;
    }
    
    // getter method for workingType attribute
    public String getWorkingType(){
        return this.workingType;
    }
    
    // getter method for employmentStatus attribute
    public String getEmploymentStatus(){
        return this.employmentStatus;
    }
    
    // getter method for workingHours attribute
    public int getWorkingHours(){
        return this.workingHours;
    }
    
    // setter method for workingHours attribute
  public void setWorkingHours(int workingHours)
    {
     this.workingHours=workingHours;
    }
    
    // display method for the Teacher class
    public void displayDetails()
    {
     System.out.println("Teacher ID:"+ this.teacherId);
     System.out.println("Teacher name:"+ this.teacherName);
     System.out.println("Address:"+ this.address);
     System.out.println("Working type:"+ this.workingType);
     System.out.println("Employment Status:"+ this.employmentStatus);
     
     // if conditions to display a message in case no working hours have been assigned
     if (workingHours > 0){
     System.out.println("Working hours:"+ this.workingHours);
    }
    else{
        System.out.println("Working hours have not been assigned.");
    }
  }
}
