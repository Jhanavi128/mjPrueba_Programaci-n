package mjBussinessLogic.mjEntities;

import mjBussinessLogic.mjInterfaces.ImjHormiga;
import mjDataAccess.mjDTOs.mjHormigaDTO;

public abstract class mjHormiga implements ImjHormiga{
    protected mjHormigaDTO data;
    protected String superHabilidad;
    protected String sexo;

    public mjHormiga() {
        data = new mjHormigaDTO();
    }

    public String getSuperHabilidad() {
        return superHabilidad;
    }

    public String getSexo() {
        return sexo;
    }

    @Override
    public abstract boolean vive(String alimento, String genoma);
}
