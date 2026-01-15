package mjDataAccess.mjDTOs;

public class mjVWHormigaDTO {
    private String IdmjHormiga    ;
    private String mjTipo ;
    private String mjSexo ;
    private String mjEstadoHormiga    ;
    private String mjNombre   ;
    private String mjDescripcion  ;
    private String mjEstado   ;
    private String mjFechaCreacion    ;
    private String mjFechaModifica    ;
    
    public mjVWHormigaDTO(String idmjHormiga, String mjTipo, String mjSexo, String mjEstadoHormiga, String mjNombre,
            String mjDescripcion, String mjEstado, String mjFechaCreacion, String mjFechaModifica) {
        IdmjHormiga = idmjHormiga;
        this.mjTipo = mjTipo;
        this.mjSexo = mjSexo;
        this.mjEstadoHormiga = mjEstadoHormiga;
        this.mjNombre = mjNombre;
        this.mjDescripcion = mjDescripcion;
        this.mjEstado = mjEstado;
        this.mjFechaCreacion = mjFechaCreacion;
        this.mjFechaModifica = mjFechaModifica;
    }


    public String getIdmjHormiga() {
        return IdmjHormiga;
    }


    public void setIdmjHormiga(String idmjHormiga) {
        IdmjHormiga = idmjHormiga;
    }


    public String getmjTipo() {
        return mjTipo;
    }


    public void setmjTipo(String mjTipo) {
        this.mjTipo = mjTipo;
    }


    public String getmjSexo() {
        return mjSexo;
    }


    public void setmjSexo(String mjSexo) {
        this.mjSexo = mjSexo;
    }


    public String getmjEstadoHormiga() {
        return mjEstadoHormiga;
    }


    public void setmjEstadoHormiga(String mjEstadoHormiga) {
        this.mjEstadoHormiga = mjEstadoHormiga;
    }


    public String getmjNombre() {
        return mjNombre;
    }


    public void setmjNombre(String mjNombre) {
        this.mjNombre = mjNombre;
    }


    public String getmjDescripcion() {
        return mjDescripcion;
    }


    public void setmjDescripcion(String mjDescripcion) {
        this.mjDescripcion = mjDescripcion;
    }


    public String getmjEstado() {
        return mjEstado;
    }


    public void setmjEstado(String mjEstado) {
        this.mjEstado = mjEstado;
    }


    public String getmjFechaCreacion() {
        return mjFechaCreacion;
    }


    public void setmjFechaCreacion(String mjFechaCreacion) {
        this.mjFechaCreacion = mjFechaCreacion;
    }


    public String getmjFechaModifica() {
        return mjFechaModifica;
    }


    public void setmjFechaModifica(String mjFechaModifica) {
        this.mjFechaModifica = mjFechaModifica;
    }


    @Override
    public String toString() {
        return getClass().getName()
        + "\n  IdmjHormiga        : "+ getIdmjHormiga    ()
        + "\n  mjTipo            : "+ getmjTipo          ()
        + "\n  mjSexo            : "+ getmjSexo          ()
        + "\n  mjEstadoHormiga   : "+ getmjEstadoHormiga ()
        + "\n  mjNombre          : "+ getmjNombre        ()
        + "\n  mjDescripcion     : "+ getmjDescripcion   ()
        + "\n  mjEstado          : "+ getmjEstado        ()
        + "\n  mjFechaCreacion   : "+ getmjFechaCreacion ()
        + "\n  mjFechaModifica   : "+ getmjFechaModifica ()
        + "\n-----------------------------------";
    }
}
