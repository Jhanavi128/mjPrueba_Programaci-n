package mjDataAccess.mjDAOs;

import mjDataAccess.mjDTOs.mjAlimentoTipoDTO;
import mjDataAccess.mjHelpers.DataHelperSQLiteDAO;
import mjInfrastructure.AppException;

public class mjAlimentoTipoDAO extends DataHelperSQLiteDAO <mjAlimentoTipoDTO>{
    public mjAlimentoTipoDAO() throws AppException{
        super(mjAlimentoTipoDTO.class, "mjAlimentoTipo", "IdmjAlimentoTipo");
    }
}
