/**
 * creating a Lecturer class that extends Teacher class
 * 
 * @author (Sanskriti Agrahari)
 * @version (20th Jan, 2024)
 */
public class Lecturer extends Teacher{
    //attributes of the Lecturer class
    private String department;
    private int yearsOfExperience;
    private int gradedScore;
    private boolean hasGraded;
    private String grade;// attribute grade is added in order grade the assignments later on in the code
    
    // constructor for the Lecturer class
    public Lecturer(int teacherId, String teacherName, String address, String workingType, 
    String employmentStatus, String department, int yearsOfExperience)
    {
      // calling the superclass Teacher constructor with five parameters
      super(teacherId, teacherName, address, workingType, employmentStatus);
      
      // assigning of parameter values to the attributes of the Lecturer class 
      this.department=department;
      this.yearsOfExperience=yearsOfExperience;
      this.gradedScore=0;// default value 
      this.hasGraded=false;// default value
    }
    
    // getter method for department attribute
    public String getDepartment(){
        return this.department;
    }
    
    // getter method for yearsOfExperience attribute
    public int getYearsOfExperience(){
        return this.yearsOfExperience;
    }
    
    // getter method for gradedScore attribute
    public int getGradedScore(){
        return this.gradedScore;
    }
    
    // getter method for hasGraded attribute
    public boolean hasGraded(){
        return this.hasGraded;
    }
    
    // setter method for gradedScore attribute
    public void setGradedScore(int gradedScore){
        this.gradedScore=gradedScore;
    }
    
    // method to grade assignments
    public void gradeAssignment(int gradedScore, String department, int yearsOfExperience){
        /*
         * if condition to check if a student's assignment has been graded or not by the relevant Lecturer
         * if the given condition is satified, it goes into another loop
         * if condition not satisifed, a message is displayed
         */
        if(!this.hasGraded && this.yearsOfExperience >=5 &&
        this.department==department){
            //if conditions to grade assignments on the basis of gradedScore 
            if(gradedScore >=70){
                this.grade ="A";
            }else if(gradedScore >=60){
                this.grade ="B";
            }else if(gradedScore >=50){
                this.grade ="C";
            }else if(gradedScore >=40) {
                this.grade ="D";
            }else{
                this.grade ="E";// default value for score of less than 40
            }
            
            this.hasGraded=true;
        }else{
            System.out.println("Assignment has not been graded yet");
        } 
    }
   
    // display method for the Lecturer class 
    @Override
    public void displayDetails(){
        super.displayDetails(); // calling parent class display method
        System.out.println("Department:"+ this.department);
        System.out.println("Years of Experience:"+ this.yearsOfExperience);
        
        /*
         * if condition to display graded score 
         * if not graded, a message is displayed
         */
        if(hasGraded){
        System.out.println("Graded Score:"+ this.grade);
    }else{
        System.out.println("Assignment has not been graded yet");
    }
   }
}

