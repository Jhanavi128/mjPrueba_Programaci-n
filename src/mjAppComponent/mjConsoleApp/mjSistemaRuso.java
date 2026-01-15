package mjAppComponent.mjConsoleApp;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.io.IOException;

import mjBussinessLogic.mjEntities.mjCoordenadaUK;

public class mjSistemaRuso {

    public List<mjCoordenadaUK> readCoord(String fileNamePath) throws IOException{
        List<mjCoordenadaUK> lstCoord = new java.util.ArrayList<>();
        List<String> allLines = Files.readAllLines(Paths.get(fileNamePath));
        for(String line : allLines){
            System.out.println(line);
            String [] coord = line.split(",");
            mjCoordenadaUK mjCoordenada = new mjCoordenadaUK(coord[0], coord[6], false);
            lstCoord.add(mjCoordenada);
            //System.out.println(mjCoordenada.toString());
        }
        return lstCoord;
    }
}
