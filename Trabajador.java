public class Trabajador extends Persona
{
    private double salario;
    private RegimenPensional regimenPensional;
    
    public Trabajador() {
    }

    public Trabajador(String nombre, String identificacion, String tipoTrabajador, double salario, RegimenPensional regimenPensional) {
        super(nombre,identificacion,tipoTrabajador);
        this.salario = salario;
        this.regimenPensional = regimenPensional;
    }

    public double getSalario() {
        return salario;
    }

    public RegimenPensional getRegimenPensional() {
        return regimenPensional;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setRegimenPensional(RegimenPensional regimenPensional) {
        this.regimenPensional = regimenPensional;
    }
    
    public double calcularAportes(double salario) {
        return salario * 0.16; // 16% del salario
    }
    
}
