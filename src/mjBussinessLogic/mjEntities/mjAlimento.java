package mjBussinessLogic.mjEntities;

public abstract class mjAlimento { //Refactorizacion
    protected String tipo;
    protected String genoma;

    public String getTipo() {
        return tipo;
    }

    public String getGenoma() {
        return genoma;
    }

    public void setGenoma(String genoma) {
        this.genoma = genoma;
    }
}
