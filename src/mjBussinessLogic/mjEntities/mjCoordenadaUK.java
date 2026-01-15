package mjBussinessLogic.mjEntities;

public class mjCoordenadaUK {
    private String mjGeoposicion;
    private String mjTipoArsenal;
    private Boolean mjAccion;

    public mjCoordenadaUK(String mjGeoposicion, String mjTipoArsenal, Boolean mjAccion) {
        this.mjGeoposicion = mjGeoposicion;
        this.mjTipoArsenal = mjTipoArsenal;
        this.mjAccion = mjAccion;
    }

    @Override
    public String toString(){
        return getClass().getName()
        + "\n mjGeoposicion      : " + getmjGeoposicion()
        + "\n mjTipoArsenal      : " + getmjTipoArsenal()
        + "\n mjAccion           : " + getmjAccion();
    }

    public String getmjGeoposicion() {
        return mjGeoposicion;
    }


    public void setmjGeoposicion(String mjGeoposicion) {
        this.mjGeoposicion = mjGeoposicion;
    }


    public String getmjTipoArsenal() {
        return mjTipoArsenal;
    }


    public void setmjTipoArsenal(String mjTipoArsenal) {
        this.mjTipoArsenal = mjTipoArsenal;
    }


    public Boolean getmjAccion() {
        return mjAccion;
    }


    public void setmjAccion(Boolean mjAccion) {
        this.mjAccion = mjAccion;
    }
}
