package ro.Fasttrackit.FinalProject;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public class MenuStorage {
    private static Path STOR = Path.of("file","menu.txt");
    private FileWriter myWriter = null;
    public MenuStorage() {
        try {
            myWriter = new FileWriter("menu.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public MenuInsite read(){

        return null;
    }

    public void write(List<Product> products) throws IOException {
        for (Product product : products) {
            myWriter.write(product.displayInFile());
            myWriter.write("\n");
        }
    }

    public void closeFile() throws IOException {
        myWriter.close();
    }
}
//String.join((CharSequence) "|", (CharSequence) List.of
