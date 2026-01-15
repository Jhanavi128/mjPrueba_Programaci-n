package mjDataAccess.mjDAOs;

import mjDataAccess.mjDTOs.mjAntCiberDronDTO;
import mjDataAccess.mjHelpers.DataHelperSQLiteDAO;
import mjInfrastructure.AppException;

public class mjAntCiberDronDAO extends DataHelperSQLiteDAO<mjAntCiberDronDTO> {
     public mjAntCiberDronDAO() throws AppException{
        super(mjAntCiberDronDTO.class, "mjAntCiberDron", "IdmjAntCiberDron");
    }
}
