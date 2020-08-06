package Modelo;

public class Mensaje {
    private int idmensaje;
    private int usuario;
    private String queja;
    private String estadoqueja;
    private int hora;
    private int fecha;

    public Mensaje() {
    }

    public Mensaje(int idmensaje, int usuario, String queja, String estadoqueja, int hora, int fecha) {
        this.idmensaje = idmensaje;
        this.usuario = usuario;
        this.queja = queja;
        this.estadoqueja = estadoqueja;
        this.hora = hora;
        this.fecha = fecha;
    }

    public int getIdmensaje() {
        return idmensaje;
    }

    public void setIdmensaje(int idmensaje) {
        this.idmensaje = idmensaje;
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    public String getQueja() {
        return queja;
    }

    public void setQueja(String queja) {
        this.queja = queja;
    }

    public String getEstadoqueja() {
        return estadoqueja;
    }

    public void setEstadoqueja(String estadoqueja) {
        this.estadoqueja = estadoqueja;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }
   
}
