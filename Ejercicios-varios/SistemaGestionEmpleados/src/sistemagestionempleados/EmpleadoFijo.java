package sistemagestionempleados;

/**
 *
 * @author Reinaldo Gil
 */
public class EmpleadoFijo extends Empleado {

    private double salarioMensual;
    private double bonificacion;  // Bonificación adicional (porcentaje)

    public EmpleadoFijo(String nombre, String departamento, double salarioMensual, double bonificacion) {
        super(nombre, departamento);
        this.salarioMensual = Math.max(salarioMensual, getSalarioMinimo());
        this.bonificacion = bonificacion;
        registrarSalario(calcularSalarioBruto());
    }

    @Override
    public double calcularSalarioBruto() {
        return salarioMensual + (salarioMensual * bonificacion / 100);
    }

    @Override
    public String obtenerInformacion() {
        return String.format("ID: %d | %s (%s) - Fijo\n"
                + "   Salario: %s | Bonificación: %.1f%%\n"
                + "   Bruto: %s | Neto: %s",
                id, nombre, departamento,
                formatearEuros(salarioMensual), bonificacion,
                formatearEuros(calcularSalarioBruto()),
                formatearEuros(calcularSalarioNeto()));
    }
}
