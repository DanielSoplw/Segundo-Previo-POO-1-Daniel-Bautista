import java.util.ArrayList;
import java.util.List;
public class SistemaPensional
{
    private List<Trabajador> trabajadores;
    private RegimenPensional regimenPensional;
    
    public  SistemaPensional(){
        this.trabajadores = new ArrayList<>();
    }
    
    public List<Trabajador>getTrabajador(){
        return trabajadores;
    }
    
    public void setTrabajador (List<Trabajador>trabajadores){
        this.trabajadores = trabajadores;
    }
    
    public void addTrabajador ( Trabajador trabajadores){
        this.trabajadores.add(trabajadores);
        System.out.println("¡Trabajador afiliado correctamente!");
    }
    
    
    
}
