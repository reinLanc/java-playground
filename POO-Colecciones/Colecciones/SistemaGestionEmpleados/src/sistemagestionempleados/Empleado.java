package sistemagestionempleados;

/**
 *
 * @author Reinaldo Gil
 */
abstract class Empleado implements Empleable {

    // ATRIBUTOS STATIC (compartidos por todas las instancias)
    private static int contadorId = 1000;  // Contador para generar IDs únicos
    private static double salarioMinimo = 1080.00;  // Salario mínimo interprofesional
    private static final double PORCENTAJE_IRPF = 0.15;  // 15% de IRPF
    private static final double PORCENTAJE_SS = 0.0635;  // 6.35% Seguridad Social

    // Estadísticas estáticas
    private static int totalEmpleados = 0;
    private static double sumaSalariosTotal = 0;

    // ATRIBUTOS DE INSTANCIA (únicos para cada empleado)
    protected int id;
    protected String nombre;
    protected String departamento;

    /**
     * Constructor de Empleado Asigna automáticamente un ID único usando el
     * contador estático
     */
    public Empleado(String nombre, String departamento) {
        this.id = contadorId++;  // Asigna ID y luego incrementa el contador
        this.nombre = nombre;
        this.departamento = departamento;
        totalEmpleados++;
    }

    // Implementación de métodos de la interface
    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int getId() {
        return id;
    }

    /**
     * Implementación del cálculo de salario neto Aplica deducciones de IRPF y
     * Seguridad Social
     */
    @Override
    public double calcularSalarioNeto() {
        double bruto = calcularSalarioBruto();
        double deducciones = calcularDeducciones(bruto);
        return bruto - deducciones;
    }

    /**
     * MÉTODO STATIC: Calcula las deducciones fiscales Es static porque el
     * cálculo es igual para todos los empleados
     *
     * @param salarioBruto Salario bruto del empleado
     * @return Total de deducciones
     */
    public static double calcularDeducciones(double salarioBruto) {
        double irpf = salarioBruto * PORCENTAJE_IRPF;
        double seguridadSocial = salarioBruto * PORCENTAJE_SS;
        return irpf + seguridadSocial;
    }

    /**
     * MÉTODO STATIC: Formatea una cantidad en euros
     *
     * @param cantidad Cantidad a formatear
     * @return String formateado con símbolo de euro
     */
    public static String formatearEuros(double cantidad) {
        return String.format("%.2f€", cantidad);
    }

    /**
     * MÉTODO STATIC: Obtiene el salario mínimo
     *
     * @return Salario mínimo actual
     */
    public static double getSalarioMinimo() {
        return salarioMinimo;
    }

    /**
     * MÉTODO STATIC: Modifica el salario mínimo Afecta a todos los empleados
     *
     * @param nuevoSalario Nuevo salario mínimo
     */
    public static void setSalarioMinimo(double nuevoSalario) {
        salarioMinimo = nuevoSalario;
    }

    /**
     * MÉTODO STATIC: Obtiene el total de empleados registrados
     *
     * @return Número total de empleados
     */
    public static int getTotalEmpleados() {
        return totalEmpleados;
    }

    /**
     * MÉTODO STATIC: Registra un salario en las estadísticas
     *
     * @param salario Salario a registrar
     */
    protected static void registrarSalario(double salario) {
        sumaSalariosTotal += salario;
    }

    /**
     * MÉTODO STATIC: Calcula el salario medio de todos los empleados
     *
     * @return Salario medio
     */
    public static double calcularSalarioMedio() {
        if (totalEmpleados == 0) {
            return 0;
        }
        return sumaSalariosTotal / totalEmpleados;
    }

    /**
     * MÉTODO STATIC: Reinicia las estadísticas
     */
    public static void reiniciarEstadisticas() {
        totalEmpleados = 0;
        sumaSalariosTotal = 0;
        contadorId = 1000;
    }
}
