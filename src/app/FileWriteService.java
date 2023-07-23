package app;
import app.util.Constants;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileWriteService {

    public String writeToFile(String fileName, String content) {
        try {
            Path filePath = Paths.get(Constants.BASE_PATH_IN + fileName + ".txt");
            Files.write(filePath, content.getBytes());
            return"Success.";
        } catch (IOException e) {
            return"Error " + e.getMessage();
        }
    }
    
}