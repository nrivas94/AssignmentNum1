import java.io.*;
public class MyFile {
private String fileName;
    
    public MyFile(String fileName) throws IOException {
        this.fileName = fileName;
        
        File file = new File(fileName);
        
        if (!file.exists() || !file.isFile() || !file.canRead()) {
            throw new IOException("File not found or not readable");
        }
    }
    
    public String toString() {
        StringBuilder info = new StringBuilder();
        
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                info.append(line).append("\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return info.toString();
    }


}
