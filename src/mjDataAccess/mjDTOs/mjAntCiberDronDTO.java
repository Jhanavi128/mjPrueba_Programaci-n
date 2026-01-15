package mjDataAccess.mjDTOs;

public class mjAntCiberDronDTO {
    private Integer IdmjAntCiberDron;
    private String  mjEstado;
    private String  mjFechaCreacion;
    private String  mjFechaModifica;

    public mjAntCiberDronDTO(){}

    private String  mjSerie;
    public mjAntCiberDronDTO(String mjSerie) {
        IdmjAntCiberDron = 0;
        this.mjSerie = mjSerie;
    }

    public mjAntCiberDronDTO(Integer idmjAntCiberDron, String mjSerie, String mjEstado, String mjFechaCreacion,
            String mjFechaModifica) {
        IdmjAntCiberDron = idmjAntCiberDron;
        this.mjSerie = mjSerie;
        this.mjEstado = mjEstado;
        this.mjFechaCreacion = mjFechaCreacion;
        this.mjFechaModifica = mjFechaModifica;
    }

    
    public Integer getIdmjAntCiberDron() {
        return IdmjAntCiberDron;
    }
    public void setIdmjAntCiberDron(Integer idmjAntCiberDron) {
        IdmjAntCiberDron = idmjAntCiberDron;
    }
    public String getmjSerie() {
        return mjSerie;
    }
    public void setmjSerie(String mjSerie) {
        this.mjSerie = mjSerie;
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
        + "\n IdmjAntCiberDron: "+ getIdmjAntCiberDron  ()
        + "\n mjSerie         : "+ getmjSerie           ()
        + "\n mjEstado        : "+ getmjEstado          ()
        + "\n mjFechaCreacion : "+ getmjFechaCreacion   ()
        + "\n mjFechaModifica : "+ getmjFechaModifica   ()
        + "\n --------------------------- " ;
    }
}

