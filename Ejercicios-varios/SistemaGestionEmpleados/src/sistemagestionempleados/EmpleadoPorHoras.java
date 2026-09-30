package sistemagestionempleados;

/**
 *
 * @author Reinaldo Gil
 */
public class EmpleadoPorHoras extends Empleado {

    private int horasTrabajadas;
    private double tarifaHora;

    // CONSTANTE STATIC: Máximo de horas extras permitidas
    private static final int MAX_HORAS_NORMALES = 160;  // 40 horas/semana * 4 semanas
    private static final double MULTIPLICADOR_EXTRA = 1.5;  // Horas extra pagan 50% más

    public EmpleadoPorHoras(String nombre, String departamento, int horasTrabajadas, double tarifaHora) {
        super(nombre, departamento);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaHora = Math.max(tarifaHora, getSalarioMinimo() / MAX_HORAS_NORMALES);
        registrarSalario(calcularSalarioBruto());
    }

    @Override
    public double calcularSalarioBruto() {
        int horasNormales = Math.min(horasTrabajadas, MAX_HORAS_NORMALES);
        int horasExtra = Math.max(0, horasTrabajadas - MAX_HORAS_NORMALES);

        double salarioNormal = horasNormales * tarifaHora;
        double salarioExtra = horasExtra * tarifaHora * MULTIPLICADOR_EXTRA;

        return salarioNormal + salarioExtra;
    }

    @Override
    public String obtenerInformacion() {
        return String.format("ID: %d | %s (%s) - Por Horas\n"
                + "   Horas: %d | Tarifa: %s/hora\n"
                + "   Bruto: %s | Neto: %s",
                id, nombre, departamento, horasTrabajadas,
                formatearEuros(tarifaHora),
                formatearEuros(calcularSalarioBruto()),
                formatearEuros(calcularSalarioNeto()));
    }

    /**
     * MÉTODO STATIC específico de esta clase Calcula cuántas horas se necesitan
     * para alcanzar un salario objetivo
     */
    public static int calcularHorasNecesarias(double salarioObjetivo, double tarifaHora) {
        return (int) Math.ceil(salarioObjetivo / tarifaHora);
    }
}
