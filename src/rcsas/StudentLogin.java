package rcsas;

import java.io.File;
import java.util.Scanner;


public class StudentLogin {  
    public static boolean loginStudent(String username, String password) {

        boolean isLogin = login(username, password);
        if (isLogin) {
            return true;
        } else {
            return false;
        } 
    }

    private static boolean login(String username, String password) {
        String path = "student_accounts.txt";
        boolean isAuth = false;
        File file = new File(path);

        try {
            Scanner buffer = new Scanner(file);

            while (buffer.hasNext()) {
                String line = buffer.nextLine();
                
                if (line.isEmpty()) {
                    line = buffer.nextLine();
                }

                if (line.substring(10).equals(username)) {
                    if (buffer.nextLine().substring(10).equals(password)) {
                        isAuth = true;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("File does not exist.");
        }
        return isAuth;
    }
}
