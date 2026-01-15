package mjDataAccess.mjDTOs;

public class mjHormigaDTO {

    private Integer IdmjHormiga     ; 
    private Integer IdmjHormigaTipo ; 
    private Integer IdmjSexo        ; 
    private Integer IdmjEstado      ; 
    private String  mjNombre        ; 
    private String  mjDescripcion   ; 
    private String  mjEstado        ; 
    private String  mjFechaCreacion ; 
    private String  mjFechaModifica ;

    public mjHormigaDTO(){}
    
    public mjHormigaDTO(Integer idmjHormiga, Integer idmjHormigaTipo, Integer idmjSexo, Integer idmjEstado,
            String mjNombre, String mjDescripcion) {
        IdmjHormiga = idmjHormiga;
        IdmjHormigaTipo = idmjHormigaTipo;
        IdmjSexo = idmjSexo;
        IdmjEstado = idmjEstado;
        this.mjNombre = mjNombre;
        this.mjDescripcion = mjDescripcion;
    }


    public mjHormigaDTO(Integer idmjHormiga, Integer idmjHormigaTipo, Integer idmjSexo, Integer idmjEstado,
            String mjNombre, String mjDescripcion, String mjEstado, String mjFechaCreacion, String mjFechaModifica) {
        IdmjHormiga = idmjHormiga;
        IdmjHormigaTipo = idmjHormigaTipo;
        IdmjSexo = idmjSexo;
        IdmjEstado = idmjEstado;
        this.mjNombre = mjNombre;
        this.mjDescripcion = mjDescripcion;
        this.mjEstado = mjEstado;
        this.mjFechaCreacion = mjFechaCreacion;
        this.mjFechaModifica = mjFechaModifica;
    }


    public Integer getIdmjHormiga() {
        return IdmjHormiga;
    }


    public void setIdmjHormiga(Integer idmjHormiga) {
        IdmjHormiga = idmjHormiga;
    }


    public Integer getIdmjHormigaTipo() {
        return IdmjHormigaTipo;
    }


    public void setIdmjHormigaTipo(Integer idmjHormigaTipo) {
        IdmjHormigaTipo = idmjHormigaTipo;
    }


    public Integer getIdmjSexo() {
        return IdmjSexo;
    }


    public void setIdmjSexo(Integer idmjSexo) {
        IdmjSexo = idmjSexo;
    }


    public Integer getIdmjEstado() {
        return IdmjEstado;
    }


    public void setIdmjEstado(Integer idmjEstado) {
        IdmjEstado = idmjEstado;
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
        + "\n IdmjHormiga     : "+ getIdmjHormiga       ()
        + "\n IdmjHormigaTipo : "+ getIdmjHormigaTipo   ()
        + "\n IdmjSexo        : "+ getIdmjSexo          ()
        + "\n IdmjEstado      : "+ getIdmjEstado        ()  
        + "\n mjNombre        : "+ getmjNombre          ()
        + "\n mjDescripcion   : "+ getmjDescripcion     ()
        + "\n mjEstado        : "+ getmjEstado          ()
        + "\n mjFechaCreacion : "+ getmjFechaCreacion   ()
        + "\n mjFechaModifica : "+ getmjFechaModifica   ();
    }
}
