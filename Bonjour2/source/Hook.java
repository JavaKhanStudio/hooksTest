import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Hook {
    public static void main(String[] args) {
        String myArgs = "" ; 
        String fileName = args[0] ; 
        for(String me : args)
        {
            myArgs += "\n" +  me ; 
        }
        System.out.println("My args " + myArgs);

        try {
			String data = new String(Files.readAllBytes(Paths.get(fileName)));
		} catch (IOException e) {
			System.out.println("I don't know where '" + fileName + "' is");
		}

        System.exit(1);
    }
} 