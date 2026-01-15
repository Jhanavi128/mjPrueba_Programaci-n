package mjDataAccess.mjDTOs;

public class mjSexoDTO {
    private Integer IdmjSexo       ;
    private String  mjNombre       ;
    private String  mjDescripcion  ;
    private String  mjEstado       ;
    private String  mjFechaCreacion;
    private String  mjFechaModifica;

    public mjSexoDTO(Integer idmjSexo, String mjNombre, String mjDescripcion) {
        IdmjSexo = idmjSexo;
        this.mjNombre = mjNombre;
        this.mjDescripcion = mjDescripcion;
    }
    
    public mjSexoDTO(Integer idmjSexo, String mjNombre, String mjDescripcion, String mjEstado, String mjFechaCreacion,
            String mjFechaModifica) {
        IdmjSexo = idmjSexo;
        this.mjNombre = mjNombre;
        this.mjDescripcion = mjDescripcion;
        this.mjEstado = mjEstado;
        this.mjFechaCreacion = mjFechaCreacion;
        this.mjFechaModifica = mjFechaModifica;
    }


    public mjSexoDTO() {
    }
    
    

    public Integer getIdmjSexo() {
        return IdmjSexo;
    }

    public void setIdmjSexo(Integer idmjSexo) {
        IdmjSexo = idmjSexo;
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
    public String toString(){
        return getClass().getName()
        + "\n IdmjSexo        : "+ getIdmjSexo      ()
        + "\n mjNombre        : "+ getmjNombre      ()
        + "\n mjDescripcion   : "+ getmjDescripcion ()
        + "\n mjEstado        : "+ getmjEstado      ()
        + "\n mjFechaCreacion : "+ getmjFechaCreacion ()
        + "\n mjFechaModifica : "+ getmjFechaModifica ();
    }
}
