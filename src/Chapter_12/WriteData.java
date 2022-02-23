package Chapter_12;

import java.io.IOException;

public class WriteData {
    public static void main(String[] args) throws IOException {
        java.io.File file = new java.io.File ("scores.txt");

        if (file.exists()) {
            System.out.println("File already exist");
            System.exit (1);
        }

        try (
        java.io.PrintWriter output = new java.io.PrintWriter (file);
        )

        {
        output.print("John T Smith ");
        output.print(90);
        output.print(" Eric K Jones ");
        output.println(85);
        }
       // output.close();
    }
}
