package Modelo;

public class Persona {
    private int idpersona;
    private String nombre;
    private String sexo;
    private String f_nacimiento;
    private int edad;
    private String estado;

    public Persona() {
        
    }

    public Persona(int idpersona, String nombre, String sexo, String f_nacimiento, int edad, String estado) {
        this.idpersona = idpersona;
        this.nombre = nombre;
        this.sexo = sexo;
        this.f_nacimiento = f_nacimiento;
        this.edad = edad;
        this.estado = estado;
    }

    public int getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(int idpersona) {
        this.idpersona = idpersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getF_nacimiento() {
        return f_nacimiento;
    }

    public void setF_nacimiento(String f_nacimiento) {
        this.f_nacimiento = f_nacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    

          
}
