public class Rais extends RegimenPensional
{
    private double saldoAcumulado;
    private int expectativaVida;
    
    public Rais() {
    }

    public Rais(double saldoAcumulado, int expectativaVida) {
        this.saldoAcumulado = saldoAcumulado;
        this.expectativaVida = expectativaVida;
    }

    public double getSaldoAcumulado() {
        return saldoAcumulado;
    }

    public int getExpectativaVida() {
        return expectativaVida;
    }

    public void setSaldoAcumulado(double saldoAcumulado) {
        this.saldoAcumulado = saldoAcumulado;
    }

    public void setExpectativaVida(int expectativaVida) {
        this.expectativaVida = expectativaVida;
    }

    @Override
    public double calcularPension() {
        return saldoAcumulado / expectativaVida;
    }
}
