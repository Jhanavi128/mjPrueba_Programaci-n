package mjDataAccess.mjDAOs;

import mjDataAccess.mjDTOs.mjSexoDTO;
import mjDataAccess.mjHelpers.DataHelperSQLiteDAO;
import mjInfrastructure.AppException;

public class SexoDAO extends DataHelperSQLiteDAO<mjSexoDTO>{
    public SexoDAO() throws AppException {
        super(mjSexoDTO.class, "mjSexo", "IdmjSexo");
    }
}
