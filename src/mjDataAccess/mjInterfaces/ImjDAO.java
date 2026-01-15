package mjDataAccess.mjInterfaces;

import java.util.List;
import mjInfrastructure.AppException;

public interface ImjDAO<T>{
     List<T> readAll()            throws AppException;
    T       readBy (Integer id)  throws AppException;
    boolean create (T entity)    throws AppException, mjInfrastructure.AppException;
    boolean update (T entity)    throws AppException;
    boolean delete (Integer id)  throws AppException;
    Integer getMaxReg()          throws AppException;
}
