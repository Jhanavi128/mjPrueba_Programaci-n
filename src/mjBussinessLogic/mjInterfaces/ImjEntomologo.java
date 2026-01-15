package mjBussinessLogic.mjInterfaces;

import java.util.List;

import mjBussinessLogic.mjEntities.mjAlimento;
import mjBussinessLogic.mjEntities.mjHormiga;

public interface ImjEntomologo {
    List<mjHormiga> etlAntNest();

    mjAlimento preparar(mjAlimento alimento);

    mjAlimento preparar(mjAlimento alimento, String genoma);
}
