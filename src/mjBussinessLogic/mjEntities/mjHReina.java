package mjBussinessLogic.mjEntities;

public class mjHReina extends mjHormiga{
     public mjHReina() {
        this.superHabilidad = "SuperReproductora";
        this.sexo = "X";
    }

    @Override
    public boolean vive(String alimento, String genoma) {
        return alimento.equalsIgnoreCase("Nectar");
    }
}
