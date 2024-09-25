import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
                
public class TeacherGUI
{
        
    private ArrayList<Teacher> teachers = new ArrayList<>();
    String grade = "";
                        
    //mainframe 
    private JFrame mainFrame;
    private JPanel sidePanel, textPanel1, textPanel2;
    private JLabel mainLabel, questionLabel, textLabel;
    private JButton addlec, addtut;
                    
    //Lecturer frame
    private JFrame lecturerFrame;
    private JPanel lecturerPanel, sideLPanel;
    private JLabel lecTID, lecTName, lecAddress, lecWorkType, lecEmpStatus, lecWorkHours, lecDepartment, lecYoe, gradeTID, gradedScore, gradeDepartment,
            gradeYoe, lecLabel1, lecLabel2, lecLabel3;
    private JTextField lecTIDField, lecTNameField, lecAddressField, lecWorkTypeField, lecEmpStatusField, lecWorkHoursField, lecDepartmentField, 
            lecYoeField, gradeTIDField, gradedScoreField, gradeDepartmentField, gradeYoeField; 
    private JButton addLecturer, backToMainL, gradeButton, clearLecturerButton, displayLButton;
                        
    //Tutor frame
    private JFrame tutorFrame;
    private JPanel tutorPanel, sideTPanel;
    private JLabel tutTID, tutTName, tutAddress, tutWorkType, tutEmpStatus, tutWorkHours, tutSalary, tutSpecialization, 
            tutAcademicQualifications, tutPerformanceIndex, setTID, removeTID, setPIndex, setSalary, tutLabel1, tutLabel2, tutLabel3, tutLabel4;
    private JTextField tutTIDField, tutTNameField, tutAddressField, tutWorkTypeField, tutEmpStatusField, tutWorkHoursField, 
            tutSalaryField, tutSpecializationField, tutAcademicQualificationsField, tutPerformanceField, setTIDField, removeTIDField, setPIndexField, setSalaryField ;
    private JButton addTutor, backToMainT, clearTutorButton, displayTButton, setSalaryButton, removeTutorButton;
                        
    public TeacherGUI() 
    
    {
            mainFrame = new JFrame("College Administration");
            mainFrame.setLayout(null);
            mainFrame.setSize(3024, 1964);
            mainFrame.setVisible(true);
            
            // textPanel1 and textPanel2
            textPanel1 = new JPanel();
            textPanel1.setLayout(null);
            textPanel1.setBounds(622, 265, 812, 379);
            textPanel1.setBackground(Color.decode("#DDE6ED"));
            mainFrame.add(textPanel1);
            
            textPanel2 = new JPanel();
            textPanel2.setLayout(null);
            textPanel2.setBounds(641, 280, 817, 387);
            textPanel2.setBackground(Color.decode("#526D82"));
            mainFrame.add(textPanel2);
            
            // sidePanel
            sidePanel = new JPanel();
            sidePanel.setLayout(null);
            sidePanel.setBounds(0, 0, 526, 982);
            sidePanel.setBackground(Color.decode("#9DB2BF"));
            mainFrame.add(sidePanel);
            
            // main Label
            mainLabel = new JLabel("<html>Welcome To <br>Our Faculty Administration</html>");
            mainLabel.setFont(new Font("Helvetica", Font.BOLD, 36));
            mainLabel.setBounds(559, 46, 875, 186);
            mainFrame.add(mainLabel);
            
            // Question Label
            questionLabel = new JLabel("<html>WHAT OPERATION WOULD YOU<br>LIKE TO CARRY OUT TODAY?</html>");
            questionLabel.setFont(new Font("Helvetica", Font.PLAIN, 24));
            questionLabel.setBounds(76, 463, 430, 123);
            sidePanel.add(questionLabel);
            
            // text label
            textLabel = new JLabel("<html>Our Faculty Administration Website is designed to streamline administrative <br> tasks, empower faculty members, and ultimately contribute to<br>the success of our academic community. Explore the website and discover<br> how we're shaping the future of education together.</html>");
            textLabel.setBounds(50, 70, 714, 156);
            textLabel.setFont(new Font("Helvetica", Font.PLAIN, 18));
            textPanel1.add(textLabel);
            
            // main buttons
            addlec = new JButton("For Lecturer");
            addlec.setBounds(131, 599, 265, 67);
            addlec.setFont(new Font("Helvetica", Font.BOLD, 14));
            addlec.setForeground(Color.WHITE);
            addlec.setBackground(Color.decode("#27374D"));
            addlec.setOpaque(true);
            addlec.setBorderPainted(false);
            
            addtut = new JButton("For Tutor");
            addtut.setBounds(131, 711, 265, 67);
            addtut.setFont(new Font("Helvetica", Font.BOLD, 14));
            addtut.setForeground(Color.WHITE);
            addtut.setBackground(Color.decode("#27374D"));
            addtut.setOpaque(true);
            addtut.setBorderPainted(false);
            
            sidePanel.add(addlec);
            sidePanel.add(addtut);
            
                                 
            addlec.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    mainFrame.setVisible(false);
                    lecturerFrame.setVisible(true);
                }
            });
            
            addtut.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    mainFrame.setVisible(false);
                    tutorFrame.setVisible(true);
                }
            });
                
            
            // lecturer frame
            lecturerFrame = new JFrame("Lecturer Window");
            lecturerFrame.setLayout(null);
            lecturerFrame.setSize(3024, 1964);
            lecturerFrame.setVisible(false);
            
            // lecturer panel
            lecturerPanel = new JPanel();
            lecturerPanel.setLayout(null);
            lecturerPanel.setBounds(712, 160, 620, 509);
            lecturerPanel.setBackground(Color.decode("#DDE6ED"));
            lecturerFrame.add(lecturerPanel);
            
            // side panel
            sideLPanel = new JPanel();
            sideLPanel.setLayout(null);
            sideLPanel.setBounds(0, 0, 526, 982);
            sideLPanel.setBackground(Color.decode("#9DB2BF"));
            lecturerFrame.add(sideLPanel);
            
            // text labels for lecturer
            lecLabel1 = new JLabel("LECTURERS AND THEIR DETAILS");
            lecLabel1.setBounds(900, 120, 350, 30);
            lecLabel1.setFont(new Font("Helvetica", Font.BOLD, 18));
            lecturerFrame.add(lecLabel1);
            
            lecLabel2 = new JLabel("GRADE ASSIGNMENTS BELOW");
            lecLabel2.setBounds(50, 100, 300, 70);
            lecLabel2.setFont(new Font("Helvetica", Font.BOLD, 14));
            sideLPanel.add(lecLabel2);
            
            lecLabel3 = new JLabel("ADD THE LECTURER BELOW");
            lecLabel3.setBounds(50, 550, 300, 70);
            lecLabel3.setFont(new Font("Helvetica", Font.BOLD, 14));
            sideLPanel.add(lecLabel3);
            
            // labels of lecturer frame
            lecTID = new JLabel("Teacher ID:");
            lecTName = new JLabel("Teacher Name:");
            lecAddress = new JLabel("Address:");
            lecWorkType = new JLabel("Working Type:");
            lecEmpStatus = new JLabel("Employment Status:");
            lecWorkHours = new JLabel("Working Hours:");
            lecDepartment = new JLabel("Department:");
            lecYoe = new JLabel("Years of Experience:");
            
            // setting bounds to labels
            lecTID.setBounds(40, 30, 150, 30);
            lecTName.setBounds(40, 90, 150, 30);
            lecAddress.setBounds(40, 150, 150, 30);
            lecWorkType.setBounds(40, 210, 150, 30);
            lecEmpStatus.setBounds(40, 270, 150, 30);
            lecWorkHours.setBounds(40, 330, 150, 30);
            lecDepartment.setBounds(40, 390, 150, 30);
            lecYoe.setBounds(40, 450, 150, 30);
            
            // lecturer textfield objects
            lecTIDField = new JTextField();
            lecTNameField = new JTextField();
            lecAddressField= new JTextField();
            lecWorkTypeField = new JTextField();
            lecEmpStatusField = new JTextField();
            lecWorkHoursField = new JTextField();
            lecDepartmentField = new JTextField();
            lecYoeField = new JTextField();
            
            // setting bounds to text fields
            lecTIDField.setBounds(270, 30, 250, 30);
            lecTNameField.setBounds(270, 90, 250, 30);
            lecAddressField.setBounds(270, 150, 250, 30);
            lecWorkTypeField.setBounds(270, 210, 250, 30);
            lecEmpStatusField.setBounds(270, 270, 250, 30);
            lecWorkHoursField.setBounds(270, 330, 250, 30);
            lecDepartmentField.setBounds(270, 390, 250, 30);
            lecYoeField.setBounds(270, 450, 250, 30);
            
            // adding labels and text fields to the lecturer panel
            lecturerPanel.add(lecTID);
            lecturerPanel.add(lecTName);
            lecturerPanel.add(lecAddress);
            lecturerPanel.add(lecWorkType);
            lecturerPanel.add(lecEmpStatus);
            lecturerPanel.add(lecWorkHours);
            lecturerPanel.add(lecDepartment);
            lecturerPanel.add(lecYoe);
            
            lecturerPanel.add(lecTIDField);
            lecturerPanel.add(lecTNameField);
            lecturerPanel.add(lecAddressField);
            lecturerPanel.add(lecWorkTypeField);
            lecturerPanel.add(lecEmpStatusField);
            lecturerPanel.add(lecWorkHoursField);
            lecturerPanel.add(lecDepartmentField);
            lecturerPanel.add(lecYoeField);
            
            // buttons
            // lecturer button objects
            addLecturer = new JButton("Add Lecturer");
            gradeButton = new JButton("Grade");
            displayLButton = new JButton("Display");
            backToMainL = new JButton("Back");
            clearLecturerButton = new JButton("Clear");
            
            // setting bounds to the lecturer buttons
            gradeButton.setBounds(112, 450, 150, 50);
            gradeButton.setForeground(Color.WHITE);
            gradeButton.setBackground(Color.decode("#27374D"));
            gradeButton.setOpaque(true);
            gradeButton.setBorderPainted(false);
            
            addLecturer.setBounds(112, 650, 150, 50); 
            addLecturer.setForeground(Color.WHITE);
            addLecturer.setBackground(Color.decode("#27374D"));
            addLecturer.setOpaque(true);
            addLecturer.setBorderPainted(false);
            
            displayLButton.setBounds(712, 700,150, 50);
            displayLButton.setForeground(Color.WHITE);
            displayLButton.setBackground(Color.decode("#27374D"));
            displayLButton.setOpaque(true);
            displayLButton.setBorderPainted(false);
            
            backToMainL.setBounds(950, 700, 150, 50);
            backToMainL.setForeground(Color.WHITE);
            backToMainL.setBackground(Color.decode("#27374D"));
            backToMainL.setOpaque(true);
            backToMainL.setBorderPainted(false);
            
            clearLecturerButton.setBounds(1185, 700, 150, 50); 
            clearLecturerButton.setForeground(Color.WHITE);
            clearLecturerButton.setBackground(Color.decode("#27374D"));
            clearLecturerButton.setOpaque(true);
            clearLecturerButton.setBorderPainted(false);
            
            // adding buttons to the lecturer panel 
            sideLPanel.add(addLecturer);
            sideLPanel.add(gradeButton);
            lecturerFrame.add(displayLButton);
            lecturerFrame.add(backToMainL);
            lecturerFrame.add(clearLecturerButton);
            
            gradeTID = new JLabel("Teacher ID:");
            gradedScore = new JLabel("Graded Score:");
            gradeDepartment = new JLabel("Department:");
            gradeYoe = new JLabel("Years of Experience:");
            
            gradeTID.setBounds(30, 180, 150, 30);
            gradedScore.setBounds(30, 240, 150, 30);
            gradeDepartment.setBounds(30, 300, 150, 30);
            gradeYoe.setBounds(30, 360, 150, 30);
            
            gradeTIDField = new JTextField();
            gradedScoreField = new JTextField();
            gradeDepartmentField = new JTextField();
            gradeYoeField = new JTextField();
            
            gradeTIDField.setBounds(200, 180, 200, 30);
            gradedScoreField.setBounds(200, 240, 200, 30);
            gradeDepartmentField.setBounds(200, 300, 200, 30);
            gradeYoeField.setBounds(200, 360, 200, 30);
            
            sideLPanel.add(gradeTID);
            sideLPanel.add(gradeTIDField);
            sideLPanel.add(gradedScore);
            sideLPanel.add(gradedScoreField);
            sideLPanel.add(gradeDepartment);
            sideLPanel.add(gradeDepartmentField);
            sideLPanel.add(gradeYoe);
            sideLPanel.add(gradeYoeField);
                            
            // Action listener for lecturer buttons
            addLecturer.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if (lecTIDField.getText().isEmpty() || lecTNameField.getText().isEmpty() || lecAddressField.getText().isEmpty() ||
                        lecWorkTypeField.getText().isEmpty() || lecEmpStatusField.getText().isEmpty() || lecWorkHoursField.getText().isEmpty() ||
                        lecDepartmentField.getText().isEmpty() || lecYoeField.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(lecturerFrame, "Please fill in all the fields!", "Empty Fields", JOptionPane.WARNING_MESSAGE);
                    } else {
                        try {
                            String idText = lecTIDField.getText();
                            String wHoursText = lecWorkHoursField.getText();
                            String yoeText = lecYoeField.getText();
                            
                            if (idText.length() > 3 || wHoursText.length() > 3 || yoeText.length() >2){
                                JOptionPane.showMessageDialog(lecturerFrame, "Input length exceeds the max length for Teacher ID, Working Hours or Years of Expereince.", "Error", JOptionPane.ERROR_MESSAGE);
                                return;
                            }
                            
                            int lecTID = Integer.parseInt(lecTIDField.getText());
                            String lecTName = lecTNameField.getText();
                            String lecAddress = lecAddressField.getText();
                            String lecWorkType = lecWorkTypeField.getText();
                            String lecEmpStatus = lecEmpStatusField.getText();
                            int lecWorkHours = Integer.parseInt(lecWorkHoursField.getText());
                            String lecDepartment = lecDepartmentField.getText();
                            int lecYoe = Integer.parseInt(lecYoeField.getText());
                            
                            if(lecTID < 1 || lecTID > 999 ){
                                JOptionPane.showMessageDialog(lecturerFrame, "Teacher ID must be a 3-digit number.", "Error", JOptionPane.ERROR_MESSAGE);
                                return;
                            }
                            
                            if(lecWorkHours < 0 || lecWorkHours > 168 ){
                                JOptionPane.showMessageDialog(lecturerFrame, "Working Hours is either negative or exceeds the limit per week.", "Error", JOptionPane.ERROR_MESSAGE);
                                return;
                            }
                            
                            if(lecYoe < 0 || lecYoe > 65 ){
                                JOptionPane.showMessageDialog(lecturerFrame, "Years of Experience is either negative or above the limit of 65.", "Error", JOptionPane.ERROR_MESSAGE);
                                return;
                            }
                            
                                if (teachers.isEmpty())
                                {
                                Lecturer lecturer = new Lecturer(lecTID, lecTName, lecAddress, lecWorkType, lecWorkHours, lecEmpStatus, lecDepartment, lecYoe); 
                                lecturer.setWorkingHours(lecWorkHours);
                                teachers.add(lecturer);
                                JOptionPane.showMessageDialog(lecturerFrame, "The Lecturer has been added successfully!", "Welcome", JOptionPane.INFORMATION_MESSAGE);
    
                                }
                                else{
                                boolean existingID = false;
                                for (Teacher teacher : teachers) {
                                    if (teacher instanceof Lecturer)
                                    {
                                        if (teacher.getTeacherId() == lecTID) {
                                            existingID = true;
                                            break;
                                        }    
                                    }
                                }
                    
                                if (existingID) {
                                    JOptionPane.showMessageDialog(lecturerFrame, "This lecturer has already been added", "Alert", JOptionPane.WARNING_MESSAGE);
                                } else {
                                    Lecturer lecturer = new Lecturer(lecTID, lecTName, lecAddress, lecWorkType, lecWorkHours, lecEmpStatus, lecDepartment, lecYoe); 
                                    lecturer.setWorkingHours(lecWorkHours);
                                    teachers.add(lecturer);
                                    JOptionPane.showMessageDialog(lecturerFrame, "The Lecturer has been added successfully!", "Welcome", JOptionPane.INFORMATION_MESSAGE);
                                    
                                }
                            }
                        }
                        catch (NumberFormatException a) {
                            JOptionPane.showMessageDialog(lecturerFrame, "Please provide valid inputs", "Alert", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            });
            
                
                        gradeButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if (gradeTIDField.getText().isEmpty() || gradedScoreField.getText().isEmpty() || gradeDepartmentField.getText().isEmpty() ||
                        gradeYoeField.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(lecturerFrame, "Please fill in all the fields!", "Alert", JOptionPane.WARNING_MESSAGE);
                    } else {
                        try {
                            String gidText = gradeTIDField.getText();
                            String gscoreText = gradedScoreField.getText();
                            String gyoeText = gradeYoeField.getText();
                            
                            if (gidText.length() > 3 || gscoreText.length() > 3 || gyoeText.length() >2){
                                JOptionPane.showMessageDialog(lecturerFrame, "Input length exceeds the max length for Teacher ID, graded score or Years of Expereince.", "Error", JOptionPane.ERROR_MESSAGE);
                                return;
                            }
                            
                            int gradeTID = Integer.parseInt(gradeTIDField.getText());
                            int gradedScore = Integer.parseInt(gradedScoreField.getText());
                            String gradeDepartment = gradeDepartmentField.getText();
                            int gradeYoe = Integer.parseInt(gradeYoeField.getText());
                            
                            if(gradeTID < 1 || gradeTID > 999 ){
                                JOptionPane.showMessageDialog(lecturerFrame, "Teacher ID must be a 3-digit number.", "Error", JOptionPane.ERROR_MESSAGE);
                                return;
                            }
                            
                            if(gradedScore < 0 || gradedScore > 100 ){
                                JOptionPane.showMessageDialog(lecturerFrame, "Graded score is either negative or above 100.", "Error", JOptionPane.ERROR_MESSAGE);
                                return;
                            }
                                    
                            if(gradeYoe < 0 || gradeYoe > 65 ){
                                JOptionPane.showMessageDialog(lecturerFrame, "Years of Experience is either negative or above the limit of 65.", "Error", JOptionPane.ERROR_MESSAGE);
                                return;
                            }
                            
                            boolean checkID = false;
                            for (Teacher teacher : teachers) {
                                if (teacher.getTeacherId() == gradeTID && teacher instanceof Lecturer) {
                                    checkID = true;
                                    break;
                                }
                            }
            
                            if (checkID) {
                                for (Teacher teacher : teachers) {
                                    if (teacher instanceof Lecturer){
                                        if (teacher.getTeacherId() == gradeTID) {
                                            Lecturer lecturer = (Lecturer) teacher;                                          
                                            lecturer.gradeAssignment(gradedScore, gradeDepartment, gradeYoe);
                                            
                                            if(gradedScore >=70){
                                                grade ="A";
                                            }else if(gradedScore >=60){
                                                grade ="B";
                                            }else if(gradedScore >=50){
                                                grade ="C";
                                            }else if(gradedScore >=40) {
                                                grade ="D";
                                            }else{
                                                grade ="E";// default value for score of less than 40
                                            }
                
                                            String assign = "Teacher ID: " + gradeTID + "\n" +
                                                            "Graded Score: " + gradedScore + "\n" +
                                                            "Department: " + gradeDepartment + "\n" +
                                                            "Years of Experience: " + gradeYoe + "\n" +
                                                            "Assigned grade: " + grade;
                
                                            JOptionPane.showMessageDialog(lecturerFrame, assign, "Assignment Graded", JOptionPane.INFORMATION_MESSAGE);
                                            break;
                                        }    
                                    }
                                }
                            } else {
                                JOptionPane.showMessageDialog(lecturerFrame, "Teacher is not a Lecturer!", "Alert", JOptionPane.WARNING_MESSAGE);
                            }
                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(lecturerFrame, "Please provide valid inputs", "Alert", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            });
            
                                
                               
                            
            displayLButton.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    if (lecTIDField.getText().isEmpty()){
                        JOptionPane.showMessageDialog(lecturerFrame, "Please enter a Lecturer ID!", "Alert", JOptionPane.WARNING_MESSAGE);
                    }else{
                        try{
                            int lecTID = Integer.parseInt(lecTIDField.getText());
                            
                            boolean isLecturer = false;
                            for(Teacher teacher : teachers){
                                if (teacher.getTeacherId() == lecTID && teacher instanceof Lecturer){
                                    isLecturer = true;
                                    Lecturer lecturer = (Lecturer) teacher;
                                    
                                    String lDetails = "Teacher ID: " + lecTID + "\n" +
                                                     "Teacher Name: " + lecturer.getTeacherName() + "\n" +
                                                     "Address: " + lecturer.getAddress() + "\n" +
                                                     "Working Type: " + lecturer.getWorkingType() + "\n" +
                                                     "Employment Status: " + lecturer.getEmploymentStatus() + "\n" +
                                                     "Working Hours: " + lecturer.getWorkingHours() + "\n" +
                                                     "Department: " + lecturer.getDepartment() + "\n" +
                                                     "Years of Experience: " + lecturer.getYearsOfExperience() + "\n"+
                                                     "Graded Score: " + grade;
                                    
                                    
                                    JOptionPane.showMessageDialog(lecturerFrame, lDetails, "Lecturer Details", JOptionPane.INFORMATION_MESSAGE);
                                    break;
                                }
                            }
                            
                            if (!isLecturer){
                                JOptionPane.showMessageDialog(lecturerFrame, "Lecturer not found!", "Alert", JOptionPane.WARNING_MESSAGE);
                            }
                        }catch(NumberFormatException ex){
                            JOptionPane.showMessageDialog(lecturerFrame, "Please enter a valid lecturer ID!", "Alert", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            });
                
            backToMainL.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    mainFrame.setVisible(true);
                    lecturerFrame.setVisible(false);
                }
            });
                
            clearLecturerButton.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    lecTIDField.setText(""); 
                    lecTNameField.setText("");
                    lecAddressField.setText("");
                    lecWorkTypeField.setText("");
                    lecWorkHoursField.setText("");
                    lecEmpStatusField.setText("");
                    lecDepartmentField.setText(""); 
                    lecYoeField.setText(""); 
                    gradeTIDField.setText("");
                    gradedScoreField.setText("");
                    gradeDepartmentField.setText("");
                    gradeYoeField.setText("");
                }
            });
                                
             // tutor frame
            tutorFrame = new JFrame("Tutor Window");
            tutorFrame.setLayout(null);
            tutorFrame.setSize(3024, 1964);
            tutorFrame.setVisible(false);
            
            // tutor panel
            tutorPanel = new JPanel();
            tutorPanel.setLayout(null);
            tutorPanel.setBounds(712, 100, 620, 550);
            tutorPanel.setBackground(Color.decode("#DDE6ED"));
            tutorFrame.add(tutorPanel);
            
            // side panel
            sideTPanel = new JPanel();
            sideTPanel.setLayout(null);
            sideTPanel.setBounds(0, 0, 526, 982);
            sideTPanel.setBackground(Color.decode("#9DB2BF"));
            tutorFrame.add(sideTPanel);
            
            // text labels for tutor
            tutLabel1 = new JLabel("TUTOR AND THEIR DETAILS");
            tutLabel1.setBounds(900, 70, 250, 30);
            tutLabel1.setFont(new Font("Helvetica", Font.BOLD, 18));
            tutorFrame.add(tutLabel1);
            
            tutLabel2 = new JLabel("SET SALARY BELOW");
            tutLabel2.setBounds(50, 100, 250, 30);
            tutLabel2.setFont(new Font("Helvetica", Font.BOLD, 14));
            sideTPanel.add(tutLabel2);
            
            tutLabel3 = new JLabel("REMOVE TUTOR BELOW");
            tutLabel3.setBounds(50, 420, 250, 30);
            tutLabel3.setFont(new Font("Helvetica", Font.BOLD, 14));
            sideTPanel.add(tutLabel3);
            
            tutLabel4 = new JLabel("ADD THE TUTOR BELOW");
            tutLabel4.setBounds(50, 650, 250, 30);
            tutLabel4.setFont(new Font("Helvetica", Font.BOLD, 14));
            sideTPanel.add(tutLabel4);
            
            // tutor labels objects 
            tutTID = new JLabel("Teacher ID:");
            tutTName = new JLabel("Teacher Name:");
            tutAddress = new JLabel("Address:");
            tutWorkType = new JLabel("Working Type:");
            tutEmpStatus = new JLabel("Employment Status:");
            tutWorkHours = new JLabel("Working Hours:");
            tutSalary = new JLabel("Salary:");
            tutSpecialization = new JLabel("Specialization:");
            tutAcademicQualifications = new JLabel("Academic Qualifications:");
            tutPerformanceIndex = new JLabel("Performance Index:");
            setTID = new JLabel("Teacher ID:");
            setPIndex = new JLabel("New Performance Index:");
            setSalary = new JLabel("Salary:");
            removeTID = new JLabel("Teacher ID");
            
            // setting bounds to labels
            tutTID.setBounds(40, 20, 160, 30);
            tutTName.setBounds(40, 70, 160, 30);
            tutAddress.setBounds(40, 120, 160, 30);
            tutWorkType.setBounds(40, 170, 160, 30);
            tutEmpStatus.setBounds(40, 220, 160, 30);
            tutWorkHours.setBounds(40, 270, 160, 30);
            tutSalary.setBounds(40, 320, 160, 30);
            tutSpecialization.setBounds(40, 370, 160, 30);
            tutAcademicQualifications.setBounds(40, 420, 160, 30);
            tutPerformanceIndex.setBounds(40, 470, 160, 30);
            setTID.setBounds(30, 150, 150, 30);
            setPIndex.setBounds(30, 210, 160, 30);
            setSalary.setBounds(30, 270, 160, 30);
            removeTID.setBounds(30, 500, 160, 30);
            
            // tutor textfield objects 
            tutTIDField = new JTextField();
            tutTNameField = new JTextField();
            tutAddressField= new JTextField();
            tutWorkTypeField = new JTextField();
            tutEmpStatusField = new JTextField();
            tutWorkHoursField = new JTextField();
            tutSalaryField = new JTextField();
            tutSpecializationField = new JTextField();
            tutAcademicQualificationsField = new JTextField();
            tutPerformanceField = new JTextField();
            setTIDField = new JTextField("");
            setPIndexField = new JTextField("");
            setSalaryField= new JTextField("");
            removeTIDField = new JTextField("");
            
            // setting bounds to labels
            tutTIDField.setBounds(275, 20, 250, 30);
            tutTNameField.setBounds(275, 70, 250, 30);
            tutAddressField.setBounds(275, 120, 250, 30);
            tutWorkTypeField.setBounds(275, 170, 250, 30);
            tutEmpStatusField.setBounds(275, 220, 250, 30);
            tutWorkHoursField.setBounds(275, 270, 250, 30);
            tutSalaryField.setBounds(275, 320, 250, 30);
            tutSpecializationField.setBounds(275, 370, 250, 30);
            tutAcademicQualificationsField.setBounds(275, 420, 250, 30);
            tutPerformanceField.setBounds(275, 470, 250, 30);
            setTIDField.setBounds(200, 150, 160, 30);
            setPIndexField.setBounds(200, 210, 160, 30);
            setSalaryField.setBounds(200, 270, 160, 30);
            removeTIDField.setBounds(200, 500, 160, 30);
            
            // adding labels and text fields to the tutor panel
            tutorPanel.add(tutTID);
            tutorPanel.add(tutTIDField);
            tutorPanel.add(tutTName);
            tutorPanel.add(tutTNameField);
            tutorPanel.add(tutAddress);
            tutorPanel.add(tutAddressField);
            tutorPanel.add(tutWorkType);
            tutorPanel.add(tutWorkTypeField);
            tutorPanel.add(tutEmpStatus);
            tutorPanel.add(tutEmpStatusField);
            tutorPanel.add(tutWorkHours);
            tutorPanel.add(tutWorkHoursField);
            tutorPanel.add(tutSalary);
            tutorPanel.add(tutSalaryField);
            tutorPanel.add(tutSpecialization);
            tutorPanel.add(tutSpecializationField);
            tutorPanel.add(tutAcademicQualifications);
            tutorPanel.add(tutAcademicQualificationsField);
            tutorPanel.add(tutPerformanceIndex);
            tutorPanel.add(tutPerformanceField);
            sideTPanel.add(setTID);
            sideTPanel.add(setPIndex);
            sideTPanel.add(setSalary);
            sideTPanel.add(removeTID);
            sideTPanel.add(setTIDField);
            sideTPanel.add(setPIndexField);
            sideTPanel.add(setSalaryField);
            sideTPanel.add(removeTIDField);
            
            // tutor button objects
            addTutor = new JButton("Add Tutor");
            setSalaryButton = new JButton("Set");
            removeTutorButton = new JButton("Remove");
            displayTButton = new JButton("Display");
            backToMainT = new JButton("Back");
            clearTutorButton = new JButton("Clear");
            
            // setting bounds to the tutor buttons
            addTutor.setBounds(112, 700, 150, 50);
            addTutor.setForeground(Color.WHITE);
            addTutor.setBackground(Color.decode("#27374D"));
            addTutor.setOpaque(true);
            addTutor.setBorderPainted(false);
            
            setSalaryButton.setBounds(112, 320, 150, 50);
            setSalaryButton.setForeground(Color.WHITE);
            setSalaryButton.setBackground(Color.decode("#27374D"));
            setSalaryButton.setOpaque(true);
            setSalaryButton.setBorderPainted(false);
            
            removeTutorButton.setBounds(112, 550, 150, 50);
            removeTutorButton.setForeground(Color.WHITE);
            removeTutorButton.setBackground(Color.decode("#27374D"));
            removeTutorButton.setOpaque(true);
            removeTutorButton.setBorderPainted(false);
            
            displayTButton.setBounds(712, 700, 150, 50);
            displayTButton.setForeground(Color.WHITE);
            displayTButton.setBackground(Color.decode("#27374D"));
            displayTButton.setOpaque(true);
            displayTButton.setBorderPainted(false);
            
            backToMainT.setBounds(950, 700, 150, 50);
            backToMainT.setForeground(Color.WHITE);
            backToMainT.setBackground(Color.decode("#27374D"));
            backToMainT.setOpaque(true);
            backToMainT.setBorderPainted(false);
            
            clearTutorButton.setBounds(1185, 700, 150, 50);
            clearTutorButton.setForeground(Color.WHITE);
            clearTutorButton.setBackground(Color.decode("#27374D"));
            clearTutorButton.setOpaque(true);
            clearTutorButton.setBorderPainted(false);
            
            // adding buttons to the tutor panel 
            sideTPanel.add(addTutor);
            sideTPanel.add(setSalaryButton);
            sideTPanel.add(removeTutorButton);
            tutorFrame.add(displayTButton);
            tutorFrame.add(backToMainT);
            tutorFrame.add(clearTutorButton);
                                
            //action listener for tutor buttons
            addTutor.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if (tutTIDField.getText().isEmpty() || tutTNameField.getText().isEmpty() || tutAddressField.getText().isEmpty() ||
                            tutWorkTypeField.getText().isEmpty() || tutEmpStatusField.getText().isEmpty() || tutWorkHoursField.getText().isEmpty() ||
                            tutSalaryField.getText().isEmpty() || tutSpecializationField.getText().isEmpty() || tutAcademicQualificationsField.getText().isEmpty() ||
                            tutPerformanceField.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(tutorFrame, "Please fill in all the fields!", "Alert", JOptionPane.ERROR_MESSAGE);
                    } else {
                        try {
                            String iDText = tutTIDField.getText();
                            String wHText = tutWorkHoursField.getText();
                            String pText = tutPerformanceField.getText();
                            
                            if (iDText.length() > 3 || wHText.length() > 3 || pText.length() >2){
                                JOptionPane.showMessageDialog(tutorFrame, "Input length exceeds the max length for Teacher ID, Working Hours or Performance Index.", "Error", JOptionPane.ERROR_MESSAGE);
                                return;
                            }
                            
                            int tutTID = Integer.parseInt(tutTIDField.getText());
                            String tutTName = tutTNameField.getText();
                            String tutAddress = tutAddressField.getText();
                            String tutWorkType = tutWorkTypeField.getText();
                            String tutEmpStatus = tutEmpStatusField.getText();
                            int tutWorkHours = Integer.parseInt(tutWorkHoursField.getText());
                            double tutSalary = Double.parseDouble(tutSalaryField.getText());
                            String tutSpecialization = tutSpecializationField.getText();
                            String tutAcademicQualifications = tutAcademicQualificationsField.getText();
                            int tutPerformance = Integer.parseInt(tutPerformanceField.getText());
                            
                            if (tutTID < 1 || tutTID > 999 ){
                                JOptionPane.showMessageDialog(tutorFrame, "Teacher ID must be a 3-digit number.", "Error", JOptionPane.ERROR_MESSAGE);
                                return;
                            }
                            
                            if(tutWorkHours < 0 || tutWorkHours > 168 ){
                                JOptionPane.showMessageDialog(tutorFrame, "Working Hours is either negative or exceeds the limit per week.", "Error", JOptionPane.ERROR_MESSAGE);
                                return;
                            }
                            
                            if(tutPerformance < 0 || tutPerformance > 10 ){
                                JOptionPane.showMessageDialog(tutorFrame, "Performace Index cannot exceed the value of 10.", "Error", JOptionPane.ERROR_MESSAGE);
                                return;
                            }

                            
                            if (teachers.isEmpty())
                            {
                                Tutor tutor = new Tutor(tutTID, tutTName, tutAddress, tutWorkType, tutEmpStatus, tutWorkHours, tutSalary, tutSpecialization,
                                            tutAcademicQualifications, tutPerformance); 
                                    teachers.add(tutor);
                                    JOptionPane.showMessageDialog(tutorFrame, "The Tutor has been added successfully!", "Welcome", JOptionPane.INFORMATION_MESSAGE);
                            }
                            else
                            {
                                
                                boolean existingID = false;
                                for (Teacher teacher : teachers) {
                                    if (teacher instanceof Tutor)
                                    {
                                        if (teacher.getTeacherId() == tutTID) {
                                            existingID = true;
                                            break;
                                        }    
                                    }
                                }
                
                                if (existingID) {
                                    JOptionPane.showMessageDialog(tutorFrame, "This Tutor has already been added", "Alert", JOptionPane.WARNING_MESSAGE);
                                } else {
                                    Tutor tutor = new Tutor(tutTID, tutTName, tutAddress, tutWorkType, tutEmpStatus, tutWorkHours, tutSalary, tutSpecialization,
                                            tutAcademicQualifications, tutPerformance); 
                                    teachers.add(tutor);
                                    JOptionPane.showMessageDialog(tutorFrame, "The Tutor has been added successfully!", "Welcome", JOptionPane.INFORMATION_MESSAGE);
                                }
                            }
                        } catch (NumberFormatException a) {
                            JOptionPane.showMessageDialog(tutorFrame, "Please provide valid inputs", "Alert", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            });
                                
                
                
            setSalaryButton.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    if (setTIDField.getText().isEmpty()||setPIndexField.getText().isEmpty()||setSalaryField.getText().isEmpty()){
                        JOptionPane.showMessageDialog(tutorFrame, "Please fill in all the fields!", "Alert", JOptionPane.ERROR_MESSAGE);
                    }
                    else{
                    try{
                        String sIDText = setTIDField.getText();
                        String pIText = setPIndexField.getText();
                            
                        if (sIDText.length() > 3 || pIText.length() > 2){
                            JOptionPane.showMessageDialog(tutorFrame, "Input length exceeds the max length for Teacher ID or Performance Index.", "Error", JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                        
                        int setTID = Integer.parseInt(setTIDField.getText());
                        double setSalary = Double.parseDouble(setSalaryField.getText());
                        int setPIndex = Integer.parseInt(setPIndexField.getText());
                        
                        if (setTID < 1 || setTID > 999 ){
                                JOptionPane.showMessageDialog(tutorFrame, "Teacher ID must be a 3-digit number.", "Error", JOptionPane.ERROR_MESSAGE);
                                return;
                        }
                        
                        if(setPIndex < 0 || setPIndex > 10 ){
                                JOptionPane.showMessageDialog(tutorFrame, "Performace Index cannot exceed the value of 10.", "Error", JOptionPane.ERROR_MESSAGE);
                                return;
                        }

                        
                        boolean tutExist = false;
                        for (Teacher teacher: teachers){
                            if (teacher.getTeacherId()==setTID && teacher instanceof Tutor){
                                tutExist = true;
                                Tutor tutor = (Tutor) teacher;
                                
                                tutor.setSalary(setSalary, setPIndex);
                                
                                String salarymsg = "Teacher Id:" + setTID + "\n" +
                                                   "New Salary:" + tutor.getSalary() + "\n" +
                                                   "New Performance Index:" + setPIndex + "\n";
                                                   
                                JOptionPane.showMessageDialog(tutorFrame, salarymsg, "Salary set", JOptionPane.INFORMATION_MESSAGE);
                                break;
                            }
                        }
                        
                        if (!tutExist){
                            JOptionPane.showMessageDialog(tutorFrame, "Teacher is not a Tutor!", "Alert", JOptionPane.WARNING_MESSAGE);
                        }
                    }catch(NumberFormatException a){
                        JOptionPane.showMessageDialog(tutorFrame, "Please provide valid inputs", "Alert", JOptionPane.ERROR_MESSAGE);
                    }
                }
                }
            });
                
            removeTutorButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (removeTIDField.getText().isEmpty()){
                    JOptionPane.showMessageDialog(tutorFrame, "Please enter a Teacher ID to remove the tutor!", "Alert", JOptionPane.WARNING_MESSAGE);
                }else{
                    try{
                        int removeTID = Integer.parseInt(removeTIDField.getText());
                        
                        if (removeTID < 1 || removeTID > 999 ){
                            JOptionPane.showMessageDialog(tutorFrame, "Teacher ID must be a 3-digit number.", "Error", JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                        
                        boolean isRemoved = false;
                        for(Teacher teacher: teachers){
                            if(teacher.getTeacherId()==removeTID && teacher instanceof Tutor){
                                Tutor tutor = (Tutor) teacher;
                                
                                tutor.removeTutor();
                                isRemoved = true;
                                
                                if (!tutor.getIsCertified()){
                                JOptionPane.showMessageDialog(tutorFrame, "Tutor removed successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                                }
                                else{
                                JOptionPane.showMessageDialog(tutorFrame, "Tutor cannot be removed!", "Failed", JOptionPane.INFORMATION_MESSAGE);
                                }
                            }
                        }
                        
                        if (!isRemoved){
                            JOptionPane.showMessageDialog(tutorFrame, "Tutor not found!", "Alert", JOptionPane.WARNING_MESSAGE);
                            }
                        }catch(NumberFormatException a){
                            JOptionPane.showMessageDialog(tutorFrame, "Please enter a valid Teacher ID to remove the tutor!", "Alert", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            });
                
                
            displayTButton.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    if (tutTIDField.getText().isEmpty()){
                        JOptionPane.showMessageDialog(tutorFrame, "Please enter a Tutor ID!", "Alert", JOptionPane.WARNING_MESSAGE);
                    }else{
                        try{
                            int tutTID = Integer.parseInt(tutTIDField.getText());
                            
                            boolean isTutor = false;
                            for(Teacher teacher : teachers){
                                if (teacher.getTeacherId() == tutTID && teacher instanceof Tutor){
                                    isTutor = true;
                                    Tutor tutor = (Tutor) teacher;
                                    
                                    String details = "Teacher ID: " + tutTID + "\n" +
                                                     "Teacher Name: " + tutor.getTeacherName() + "\n" +
                                                     "Address: " + tutor.getAddress() + "\n" +
                                                     "Working Type: " + tutor.getWorkingType() + "\n" +
                                                     "Employment Status: " + tutor.getEmploymentStatus() + "\n" +
                                                     "Working Hours: " + tutor.getWorkingHours() + "\n" +
                                                     "Salary: " + tutor.getSalary() + "\n" +
                                                     "Specialization: " + tutor.getSpecialization() + "\n" +
                                                     "Academic Qualifications: " + tutor.getAcademicQualifications() + "\n" +
                                                     "Performance Index: " + tutor.getPerformanceIndex() + "\n" +
                                                     "Certified: " + tutor.getIsCertified();
                                    
                                    
                                    JOptionPane.showMessageDialog(tutorFrame, details, "Tutor Details", JOptionPane.INFORMATION_MESSAGE);
                                    break;
                                }
                            }
                            
                            if (!isTutor){
                                JOptionPane.showMessageDialog(tutorFrame, "Tutor not found!", "Alert", JOptionPane.WARNING_MESSAGE);
                            }
                        }catch(NumberFormatException ex){
                            JOptionPane.showMessageDialog(tutorFrame, "Please enter a valid Tutor ID!", "Alert", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            });
                
            backToMainT.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    mainFrame.setVisible(true);
                    tutorFrame.setVisible(false);
                }
            });
                
            clearTutorButton.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    tutTIDField.setText(""); 
                    tutTNameField.setText(""); 
                    tutAddressField.setText(""); 
                    tutWorkTypeField.setText(""); 
                    tutEmpStatusField.setText("");
                    tutWorkHoursField.setText(""); 
                    tutSalaryField.setText(""); 
                    tutSpecializationField.setText(""); 
                    tutAcademicQualificationsField.setText(""); 
                    tutPerformanceField.setText("");  
                    setTIDField.setText("");
                    setSalaryField.setText("");
                    setPIndexField.setText("");
                    removeTIDField.setText("");
                }
            });
                                }
                             
                            
    public static void main(String[] args){
                new TeacherGUI();
    }
    }