package mjBussinessLogic.mjEntities;

import java.util.List;

import mjDataAccess.mjDTOs.mjHormigaDTO;
import mjInfrastructure.AppException;

public class mjHLarva extends mjHormiga {

    public mjHormigaDTO getLava(int id) throws AppException{
        data = factory.getBy(id);
        return data;
    }
    
    public List<mjHormigaDTO> getLarvas() throws AppException {
        return factory.getAll();
    }
    
    public mjHormiga comer(String comida) {
        if (comida.equals("carne")) {
            return new mjHSoldado();
        }
        return this;
    }

    @Override
    public String toString() {
        return "HLarva {}";
    }
}
