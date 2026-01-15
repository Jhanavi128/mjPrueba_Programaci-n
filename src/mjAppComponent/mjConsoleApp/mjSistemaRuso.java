package mjAppComponent.mjConsoleApp;

//import java.nio.file.Files;
//import java.nio.file.Paths;
//import java.util.List;
import java.util.Scanner;
//import java.io.IOException;

//import mjBussinessLogic.mjEntities.mjCoordenadaUK;
import mjBussinessLogic.mjEntities.mjEntomologo;
import mjBussinessLogic.mjEntities.mjHLarva;
import mjBussinessLogic.mjEntities.mjHormiga;

public class mjSistemaRuso { //REFACTORIZACION

    public void ejecutar(){
        Scanner sc = new Scanner(System.in);
        int mjIntentos = 0;
        boolean mjAcceso = false;

        while(mjIntentos < 3){
            System.out.println("Usuario: ");
            String u = sc.nextLine();
            System.out.println("Contraseña: ");
            String c = sc.nextLine();

            if(u.equals("patmic") && c.equals("123")){
                mjAcceso = true;
                break;
            }
            mjIntentos++;
            System.out.println("Crendeciales incorrectas");
        }

        if(!mjAcceso){
            System.out.println("Ups, demasiados intentos :(");
            return;
        }

        System.out.println("CEDULA: 1755161948");
        System.out.println("NOMBRE: Molina Gómez Jhanavi Abigail");
        System.out.println();

        System.out.println("[+] Alimentos");
        System.out.println("\u001B[31m.o. Carnívoro\u001B[0m");
        System.out.println("\u001B[31m.o. Herbívoro\u001B[0m");
        System.out.println("\u001B[34m.o. Nectarívoro\u001B[0m"); // Alimento que me toco
        System.out.println();

        System.out.println("[+] Tipo Hormiga");
        System.out.println("\u001B[31m.o. Larva\u001B[0m");
        System.out.println("\u001B[34m.o. Reina\u001B[0m"); // Hormiga que me toca
        System.out.println("\u001B[31m.o. Soldado\u001B[0m");
        System.out.println();

        mjHormiga hormiga = new mjHLarva();
        boolean vive = hormiga.vive("Nectar", "X");
        if (vive) {
            System.out.println("La hormiga vive");
            System.out.println("Superhabilidad: " + hormiga.getSuperHabilidad());
        }else {
            System.out.println("La hormiga muere");
        }

        mjEntomologo ent = new mjEntomologo();

        System.out.println("(Preparado)-(Nectar)-");
        System.out.println("(Preparado)-(Nectar + X)-");
    }
    /*public List<mjCoordenadaUK> readCoord(String fileNamePath) throws IOException{
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
    */





}
