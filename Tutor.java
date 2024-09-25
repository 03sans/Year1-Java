/**
 * creating a Tutor class that extends the Teacher class
 * 
 * @author (Sanskriti Agrahari)
 * @version (20th Jan, 2024)
 */
public class Tutor extends Teacher {
    //attributes for the Tutor class
    private double salary;
    private String specialization;
    private String academicQualifications;
    private int performanceIndex;
    private boolean isCertified;
    private int workingHours;// attribute added as it is essential for the condition to set new salary later on in the code

    // constructor for the Tutor class
    public Tutor(int teacherId, String teacherName, String address, String workingType,
                 String employmentStatus, int workingHours, double salary, String specialization,
                 String academicQualifications, int performanceIndex) {            
        // calling the superclass Teacher constructor with five parameters
        super(teacherId, teacherName, address, workingType, employmentStatus);
        // assigning of parameter values to the attributes of the Tutor class
        this.salary = salary;
        this.specialization = specialization;
        this.academicQualifications = academicQualifications;
        this.performanceIndex = performanceIndex;
        this.workingHours = workingHours;
        this.isCertified = false;//default value
    }

    // getter method for salary attribute
    public double getSalary() {
        return this.salary;
    }
    
    // getter method for specialization attribute
    public String getSpecialization() {
        return this.specialization;
    }
    
    // getter method for academicQualifications attribute
    public String getAcademicQualifications() {
        return this.academicQualifications;
    }
    
    // getter method for performanceIndex attribute
    public int getPerformanceIndex() {
        return this.performanceIndex;
    }
    
    // getter method for isCertified attribute
    public boolean getIsCertified() {
        return this.isCertified;
    }
    
    //getter method for workingHours attribute
    public int getWorkingHours() {
        return this.workingHours;
    }

    // setter method for salary attribute
    public void setSalary(double salary, int newPerformanceIndex) {
        /*
         * if condition to update salary of Tutor based on the satisfaction of the given condition
         * if the given condition is satisfied, it goes to another if loop
         * if condition is not satisfied, a message is displayed
         */
        if (newPerformanceIndex > 5 && getWorkingHours() > 20) {
            double appraisal = 0.00; //beginning default value for appraisal 
            //if condition to set appraisal inorder to update the salary using the formula given
            if (newPerformanceIndex >= 5 && newPerformanceIndex <= 7) {
                appraisal = 0.05;
            } else if (newPerformanceIndex >= 8 && newPerformanceIndex <= 9) {
                appraisal = 0.10;
            } else if (newPerformanceIndex == 10) {
                appraisal = 0.20;
            }

            salary = this.salary + (appraisal * this.salary);
            this.salary = salary;
            this.isCertified = true;// default value after salary has been updated
        } else {
            System.out.println("Salary update is unavailable as the tutor is not certified yet.");
        }
    }

    // Method to remove tutor
    public void removeTutor() {
        // if condition to remove a tutor if not certified
        if (!this.isCertified) {
            this.salary = 0.0;
            this.specialization = "";
            this.academicQualifications = "";
            this.performanceIndex = 0;
            this.isCertified = false;
        } else {
            System.out.println("Tutor can not be removed.");//message displayed if the tutor is already certified
        }
    }

    // Display method
    @Override
    public void displayDetails() {
        /*
         * if condition to display details for this class on the basis of certification status
         * if the tutor is not certified, parent class's display method is called
         * if the tutor is certified, parent class's display method is still called and other attribute values are displayed alongside
         */
        if (!this.isCertified) {
            super.displayDetails(); // calling parent class display method
        }else if (this.isCertified) {
            super.displayDetails(); // calling parent class display method
            System.out.println("Salary: " + this.salary);
            System.out.println("Specialization: " + this.specialization);
            System.out.println("Academic Qualifications: " + this.academicQualifications);
            System.out.println("Performance Index: " + this.performanceIndex);
        } 
    }
}