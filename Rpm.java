
public class  Rpm extends RegimenPensional
{
    private double ibl; 
    private int semanasCotizadas;
    private int edad;
    
    private static double porcentajePension1 = 0.65;
    private static double porcentajeIncrementoPension = 0.015;
    private static double porcentajeMaxPension = 0.8;
    
    public Rpm() {
    }

    public Rpm(double ibl, int semanasCotizadas, int edad) {
        this.ibl = ibl;
        this.semanasCotizadas = semanasCotizadas;
        this.edad = edad;
    }

    public double getIbl() {
        return ibl;
    }

    public int getSemanasCotizadas() {
        return semanasCotizadas;
    }

    public int getEdad() {
        return edad;
    }

    public static double getPorcentajePension1() {
        return porcentajePension1;
    }

    public static double getPorcentajeIncrementoPension() {
        return porcentajeIncrementoPension;
    }

    public static double getPorcentajeMaxPension() {
        return porcentajeMaxPension;
    }

    public void setIbl(double ibl) {
        this.ibl = ibl;
    }

    public void setSemanasCotizadas(int semanasCotizadas) {
        this.semanasCotizadas = semanasCotizadas;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public static void setPorcentajePension1(double porcentajePension1) {
        Rpm.porcentajePension1 = porcentajePension1;
    }

    public static void setPorcentajeIncrementoPension(double porcentajeIncrementoPension) {
        Rpm.porcentajeIncrementoPension = porcentajeIncrementoPension;
    }

    public static void setPorcentajeMaxPension(double porcentajeMaxPension) {
        Rpm.porcentajeMaxPension = porcentajeMaxPension;
    }

     

    @Override
    public double calcularPension() {
        double porcentajePension = calcularPorcentajePension(semanasCotizadas, edad);
        return ibl * porcentajePension;
    }

    private double calcularPorcentajePension(int semanasCotizadas, int edad) {
        double porcentajePension = porcentajePension1;
        int semanasRestantes = semanasCotizadas - 1300;
        if (semanasRestantes > 0) {
            porcentajePension += semanasRestantes / 50 * porcentajeIncrementoPension;
            porcentajePension = Math.min(porcentajePension, porcentajeMaxPension);
        }
        return porcentajePension;
    }
}
