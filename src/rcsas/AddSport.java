package rcsas;

import java.io.*;

public class AddSport {
    public static void addSport(String sportName, String sportCenterLocation, String sportCenterCode) {
        int sportID = generateSportID();
        saveSportDetails (sportID, sportName, sportCenterLocation, sportCenterCode);
    }

    private static int generateSportID() {
        try {
            File f = new File("sport_id.txt");
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

    private static void saveSportDetails(int sportID, String sportName, String sportCenterLocation, String sportCenterCode) {
        try {
            File f = new File("sport_details.txt");
            FileWriter fw = new FileWriter(f, true);

            fw.append("SPORT ID: SP" + sportID + "\n");
            fw.append("SPORT NAME: " + sportName + "\n");
            fw.append("SPORT CENTER LOCATION: " + sportCenterLocation + "\n");
            fw.append("SPORT CENTER CODE: " + sportCenterCode + "\n");

            fw.append("\n");

            fw.close();
        } catch(Exception e) {
            System.out.println("File does not exist.");
        }
    }
}