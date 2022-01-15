package Exception_less;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception4 {
    //public static void main(String[] args) throws IOException, FileNotFoundException, IllegalArgumentException {
    public static void main(String[] args) {
        try {
            run();
        } catch (IOException | IllegalArgumentException e) { //мультикэтч - но можно так catch (Exception e)
            e.printStackTrace();
        }
    }

    public static void run () throws IOException, FileNotFoundException, IllegalArgumentException {

    }
}
