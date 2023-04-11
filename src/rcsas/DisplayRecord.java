package rcsas;

public class DisplayRecord {
    public static void openFile(String program, String fileName) {
        try {
            ProcessBuilder pb = new ProcessBuilder(program, fileName);
            pb.start();
        } catch (Exception e) {
            System.out.println("Failed to open file.");
            
        }
    }
}
