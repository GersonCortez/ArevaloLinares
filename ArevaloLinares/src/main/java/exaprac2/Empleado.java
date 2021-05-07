
package exaprac2;

public class Empleado {
    private String nombre;
    private double salario;
    private int cantidad;

    public Empleado() {
    }

    public Empleado(String nombre, double salario, int cantidad) {
        this.nombre = nombre;
        this.salario = salario;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
}
