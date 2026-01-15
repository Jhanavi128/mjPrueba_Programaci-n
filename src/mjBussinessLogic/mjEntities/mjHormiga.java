package mjBussinessLogic.mjEntities;

import mjBussinessLogic.mjFactoryBL;
import mjBussinessLogic.mjInterfaces.ImjHormiga;
import mjDataAccess.mjDAOs.mjHormigaDAO;
import mjDataAccess.mjDTOs.mjHormigaDTO;

public abstract class mjHormiga implements ImjHormiga {
    protected mjFactoryBL<mjHormigaDTO> factory = new mjFactoryBL<>(mjHormigaDAO.class);
    public mjHormigaDTO data = new mjHormigaDTO();

    // protected HormigaDAO hormigaDAO;
    // protected Hormiga() throws AppException  {
    //     this.hormigaDAO = new HormigaDAO();
    // }

    // public FactoryBL<HormigaDTO> factory = new FactoryBL<>(() -> {
    //     try {
    //         return new HormigaDAO();
    //     } catch (Exception e) {
    //         new RuntimeException();
    //     }
    // });
}
