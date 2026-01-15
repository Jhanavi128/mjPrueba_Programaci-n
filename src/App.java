//import java.util.Scanner;

import mjAppComponent.mjConsoleApp.mjSistemaRuso;
//import mjBussinessLogic.mjEntities.mjAutomata;
//import mjDataAccess.mjDAOs.mjAlimentoTipoDAO;
//import mjDataAccess.mjDAOs.mjAntCiberDronDAO;
//import mjDataAccess.mjDAOs.mjHormigaDAO;
//import mjDataAccess.mjDTOs.mjAlimentoTipoDTO;
//import mjDataAccess.mjDTOs.mjVWHormigaDTO;
//import mjInfrastructure.AppException;

public class App {
    public static void main(String[] args) {

        mjSistemaRuso sistema = new mjSistemaRuso();
        sistema.ejecutar();
        /*try{
            mjAntCiberDronDAO dao = new mjAntCiberDronDAO();
            for(var dto : dao.readAll()){
                System.out.println(dto.toString());
            }
        }catch(Exception e){
            
        }
        */

        /*try{
            mjHormigaDAO dao = new mjHormigaDAO();
            for(mjVWHormigaDTO h : dao.readAllvwHormiga()){
                System.out.println(h.toString());
            }
        }catch(Exception e){
        }
        */

        /*mjAlimentoTipoDAO dao;
        try{
            dao = new mjAlimentoTipoDAO();
            mjAlimentoTipoDTO oDTO = dao.readBy(1);
            oDTO.setmjDescripcion("Salado"); // cambiar el dato de la tabla 
            dao.update(oDTO); // actualizar el registro 
            for(mjAlimentoTipoDTO dto : dao.readAll())
                System.out.println(dto.toString());
        }catch(AppException e){

        }
        */
        
        /*mjAutomata automata = new mjAutomata();
        Scanner TipoArsenal = new Scanner("a, ab, abc,abcd").useDelimiter(",");

        while(TipoArsenal.hasNext()){
            System.out.println(automata.checkTipoArsenal(TipoArsenal.next()) ? "OK" : "ERROR"  );
        }
        boolean boom = automata.checkTipoArsenal("abcdtttt");
        System.out.println(boom ? "BOOOM" : "NO BOOM");
        */

        /*mjSistemaRuso mjsistemaRuso = new mjSistemaRuso();
        try{
            mjsistemaRuso.readCoord("DataFile\\Molina_Jhanavi.csv");

        }catch(Exception e){
            e.printStackTrace();
        }
        */
    }
}
