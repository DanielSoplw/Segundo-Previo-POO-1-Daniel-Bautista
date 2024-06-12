public class Persona
{
    private String nombre, identificacion, tipoTrabajador;
    
    public Persona() {
    }

    public Persona(String nombre, String identificacion, String tipoTrabajador) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.tipoTrabajador = tipoTrabajador;
    }

    public String getNombre() {
        return nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getTipoTrabajador() {
        return tipoTrabajador;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public void setTipoTrabajador(String tipoTrabajador) {
        this.tipoTrabajador = tipoTrabajador;
    }
}
