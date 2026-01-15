package mjBussinessLogic.mjEntities;

import java.util.ArrayList;
import java.util.List;

import mjBussinessLogic.mjInterfaces.ImjEntomologo;

public class mjEntomologo implements ImjEntomologo{
    @Override
    public List<mjHormiga> etlAntNest() {
        return new ArrayList<>();
    }

    @Override
    public mjAlimento preparar(mjAlimento alimento) {
        System.out.println("(Preparado) - (" + alimento.getTipo() + ")");
        return alimento;
    }

    @Override
    public mjAlimento preparar(mjAlimento alimento, String genoma) {
        System.out.println("(Preparado) - (" + alimento.getTipo() + " + " + genoma + ")");
        alimento.setGenoma(genoma);
        return alimento;
    }
}
