package rcsas;

import java.io.*;

public class StudentRegister {
    public static boolean registerStudent(String name, String username, String password, String confirmPassword, String address, String contactNumber, String email, String chosenSport) {
        boolean passwordValidity = checkPassword(password, confirmPassword);
        
        if (passwordValidity) {
            int studentID = generateStudentID();
            
            saveStudentAccount(username, password);
            saveStudentDetails(studentID, name, address, contactNumber, email, chosenSport);
            
            return true;
        } else {
            return false;
        }
    }
    
    private static boolean checkPassword(String password, String confirmPassword) {
        return password.equals(confirmPassword);
    }
    
    private static int generateStudentID() {
        try {
            File f = new File("student_id.txt");
            BufferedReader br = new BufferedReader(new FileReader(f));
            FileWriter fw = new FileWriter(f, true);
            String currentLine;
            String lastLine = "";
            
            while ((currentLine = br.readLine()) != null) {
                lastLine = currentLine;
            }
            
            int studentID = Integer.parseInt(lastLine);
            int nextID = studentID + 1;
                    
            fw.append("\n" + nextID);
            fw.close();
            return studentID;
        } catch(Exception e) {
            System.out.println("File does not exist.");
        }
        return 0;
    }
    
    private static void saveStudentAccount(String username, String password) {
        try {
            File f = new File("student_accounts.txt");
            FileWriter fw = new FileWriter(f, true);
            
            fw.append("USERNAME: " + username + "\n");
            fw.append("PASSWORD: " + password + "\n");
            fw.append("\n");
            
            fw.close();
        } catch(Exception e) {
            System.out.println("File does not exist.");
        }
    }
    
    private static void saveStudentDetails(int studentID, String name, String address, String contactNumber, String email, String chosenSport) {
        try {
            File f = new File("student_details.txt");
            FileWriter fw = new FileWriter(f, true);
            
            fw.append("STUDENT ID: S" + studentID + "\n");
            fw.append("NAME: " + name + "\n");
            fw.append("ADDRESS: " + address + "\n");
            fw.append("CONTACT NUMBER: " + contactNumber + "\n");
            fw.append("EMAIL: " + email + "\n");
            fw.append("SPORT: " + chosenSport + "\n");
            fw.append("\n");
            
            fw.close();
        } catch(Exception e) {
            System.out.println("File does not exist.");
        }
    }
}
