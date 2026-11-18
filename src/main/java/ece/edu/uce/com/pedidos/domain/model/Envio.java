package ece.edu.uce.com.pedidos.domain.model;

public class Envio {

    private Integer id;
    private String direccionDestino;
    private String estadoEnvio;
    private Double costoEnvio;
    private String fechaEstimadaEntrega;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDireccionDestino() {
        return direccionDestino;
    }

    public void setDireccionDestino(String direccionDestino) {
        this.direccionDestino = direccionDestino;
    }

    public String getEstadoEnvio() {
        return estadoEnvio;
    }

    public void setEstadoEnvio(String estadoEnvio) {
        this.estadoEnvio = estadoEnvio;
    }

    public Double getCostoEnvio() {
        return costoEnvio;
    }

    public void setCostoEnvio(Double costoEnvio) {
        this.costoEnvio = costoEnvio;
    }

    public String getFechaEstimadaEntrega() {
        return fechaEstimadaEntrega;
    }

    public void setFechaEstimadaEntrega(String fechaEstimadaEntrega) {
        this.fechaEstimadaEntrega = fechaEstimadaEntrega;
    }

}
