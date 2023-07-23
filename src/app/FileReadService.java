package app;

import app.util.Constants;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReadService {
    

   public String readFromFile(String fileName) {
        try {
                    Path path = Paths.get(Constants.BASE_PATH_IN + fileName + ".txt");
                    return Files.readString(path);

            } catch (IOException e) {
                return  " Error " +  e.getMessage();
            }
}
}