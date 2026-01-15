package mjDataAccess.mjDTOs;

public class mjAlimentoTipoDTO {
   private Integer IdmjAlimentoTipo; 
   private String mjNombre;         
   private String mjDescripcion;    
   private String mjEstado;         
   private String mjFechaCreacion;
   private String mjFechaModifica;

   public mjAlimentoTipoDTO(){}

    public mjAlimentoTipoDTO(Integer idmjAlimentoTipo, String mjNombre, String mjDescripcion) {
        IdmjAlimentoTipo = 0;
        this.mjNombre = mjNombre;
        this.mjDescripcion = mjDescripcion;
    }

   public mjAlimentoTipoDTO(Integer idmjAlimentoTipo, String mjNombre, String mjDescripcion, String mjEstado,
        String mjFechaCreacion, String mjFechaModifica) {
        IdmjAlimentoTipo = idmjAlimentoTipo;
        this.mjNombre = mjNombre;
        this.mjDescripcion = mjDescripcion;
        this.mjEstado = mjEstado;
        this.mjFechaCreacion = mjFechaCreacion;
        this.mjFechaModifica = mjFechaModifica;
    }

   public Integer getIdmjAlimentoTipo() {
    return IdmjAlimentoTipo;
   }
   public void setIdmjAlimentoTipo(Integer idmjAlimentoTipo) {
    IdmjAlimentoTipo = idmjAlimentoTipo;
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
        + "\n IdmjAlimentoTipo: "+ getIdmjAlimentoTipo  ()
        + "\n mjNombre        : "+ getmjNombre          ()
        + "\n mjDescripcion   : "+ getmjDescripcion     ()
        + "\n mjEstado        : "+ getmjEstado          ()
        + "\n mjFechaCreacion : "+ getmjFechaCreacion   ()
        + "\n mjFechaModifica : "+ getmjFechaModifica   ()
        + "\n --------------------------- " ;
    }
}
