//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    int edad;
    String nombre;
    String apellido;
    int fecha;
    public Main(int edad,String nombre,String apellido,int fecha)
    {
        this.edad=edad;
        this.nombre=nombre;
        this.apellido=apellido;
        this.fecha=fecha;
    }
    public void imprimir(){
        System.out.println("El nombre: "+nombre+" Apellido: "+apellido+edad+fecha);
    }
}