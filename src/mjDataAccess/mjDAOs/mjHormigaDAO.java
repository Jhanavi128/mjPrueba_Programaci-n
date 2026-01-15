package mjDataAccess.mjDAOs;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import mjDataAccess.mjDTOs.mjHormigaDTO;
import mjDataAccess.mjDTOs.mjVWHormigaDTO;
import mjDataAccess.mjHelpers.DataHelperSQLiteDAO;
import mjInfrastructure.AppException;

public class mjHormigaDAO extends DataHelperSQLiteDAO<mjHormigaDTO>{
    public mjHormigaDAO() throws AppException {
        super(mjHormigaDTO.class, "mjHormiga", "IdmjHormiga");
    }

    public List<mjVWHormigaDTO> readAllvwHormiga() throws AppException {
        mjVWHormigaDTO dto;
        List<mjVWHormigaDTO> lst = new ArrayList<>();
        String query = " SELECT IdmjHormiga"
                      +"  ,mjTipo         "   
                      +"  ,mjSexo         "
                      +"  ,mjEstadoHormiga"   
                      +"  ,mjNombre       "
                      +"  ,mjDescripcion  "
                      +"  ,mjEstado       "
                      +"  ,mjFechaCreacion"   
                      +"  ,mjFechaModifica" 
                      +"  FROM mjvwHormiga";
        try {
            Connection conn = openConnection();         // conectar a DB     
            Statement  stmt = conn.createStatement();   // CRUD : select * ...    
            ResultSet rs   = stmt.executeQuery(query);  // ejecutar la
            while (rs.next()) {
                dto = new mjVWHormigaDTO(rs.getString(1)          // IdHormiga
                                        ,rs.getString(2)        // Tipo            
                                        ,rs.getString(3)        // Sexo        
                                        ,rs.getString(4)        // EstadoHormiga 
                                        ,rs.getString(5)        // Nombre 
                                        ,rs.getString(6)        // Descripcion
                                        ,rs.getString(7)        // Estado
                                        ,rs.getString(8)        // FechaCreacion
                                        ,rs.getString(9)        // FechaModifica
                                      ); 
                lst.add(dto);
            }
        } 
        catch (SQLException e) {
            throw new AppException("Ups... problemas con la vista", e, getClass(), "getmjVWHormiga()");
        }
        return lst;
    }
}