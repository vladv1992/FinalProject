package ro.Fasttrackit.FinalProject;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;

public class MenuStorage {
    private static Path STOR = Path.of("file","menu.txt");
    public MenuInsite read(){

        return null;
    }

    public void write(Product menuInsite){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(STOR.toFile()))){
            writer.write(menuInsite.getCapaciti);
            writer.newLine();
            for(Product i : menuInsite.getProduct()){
                writer.write(producToline(i));
            }

        }catch (IOException e){
            System.out.println("I dont write in this file");
        }
    }

    private String producToline(Product i) {
        return i.getName()+"|"+i.getWeight()+"|"+i.getPrice()+"|"+i.getDescription();
    }
}
//String.join((CharSequence) "|", (CharSequence) List.of
