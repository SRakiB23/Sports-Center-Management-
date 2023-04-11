package rcsas;

import java.io.*;

public class AddCoach {   
    public static void addCoach(String name, String dateJoined, String dateTerminated, String phone, String address, String sportsCenterCode, String sportCode, String chosenSport, String hourlyPayRate) {
        int coachID = generateCoachID();
        saveCoachDetails (coachID, name, dateJoined, dateTerminated, phone, address, sportsCenterCode, sportCode, chosenSport, hourlyPayRate);
        
    }
    

    private static int generateCoachID() {
        try {
            File f = new File("coach_id.txt");
            BufferedReader br = new BufferedReader(new FileReader(f));
            FileWriter fw = new FileWriter(f, true);
            String currentLine;
            String lastLine = "";
            
            while ((currentLine = br.readLine()) != null) {
                lastLine = currentLine;
            }
            
            int coachID = Integer.parseInt(lastLine);
            int nextID = coachID + 1;
                    
            fw.append("\n" + nextID);
            fw.close();
            return coachID;
        } catch(Exception e) {
            System.out.println("File does not exist.");
        }
        return 0;
    }
    
    
    private static void saveCoachDetails(int coachID, String name, String dateJoined, String dateTerminated, String contactNumber, String address, String sportsCenterCode, String sportCode, String chosenSport, String hourlyPayRate) {
        try {
            File f = new File("coach_details.txt");
            FileWriter fw = new FileWriter(f, true);
            
            fw.append("COACH ID: C" + coachID + "\n");
            fw.append("NAME: " + name + "\n");
            fw.append("DATE JOINED: " + dateJoined + "\n");
            fw.append("DATE TERMINATED: " + dateTerminated + "\n");
            fw.append("CONTACT NUMBER: " + contactNumber + "\n");
            fw.append("ADDRESS: " + address + "\n");
            fw.append("CENTER CODE: " + sportsCenterCode + "\n");
            fw.append("SPORT CODE: " + sportCode + "\n");
            fw.append("SPORT: " + chosenSport + "\n");
            fw.append("PAY RATE: " + hourlyPayRate + "\n");
            fw.append("RATING: 0\n");
            
            fw.append("\n");
            
            fw.close();
        } catch(Exception e) {
            System.out.println("File does not exist.");
        }
    }
}