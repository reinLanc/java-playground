/*
Ejercicio 5: C�lculo de Factura con IVA y Descuentos
Enunciado
Crea un programa que calcule el total de una factura considerando:

Precio base del producto: 250.00�
Cantidad de productos: 3
Descuento del 15% sobre el subtotal
IVA del 21% sobre el precio con descuento
Calcula:

Subtotal (precio � cantidad)
Monto del descuento
Precio despu�s del descuento
Monto del IVA
Total final


Muestra tambi�n cu�nto dinero se ahorr� con el descuento
 */
package calculofactura;

/**
 *
 * @author Reinaldo Gil
 */
public class CalculoFactura {

    public static void main(String[] args) {
        // Datos del producto
        double precioUnitario = 250.00;
        int cantidad = 3;

        // Constantes
        final double PORCENTAJE_DESCUENTO = 0.15; // 15%
        final double PORCENTAJE_IVA = 0.21; // 21%

        // C�lculo del subtotal
        double subtotal = precioUnitario * cantidad;

        // C�lculo del descuento
        double montoDescuento = subtotal * PORCENTAJE_DESCUENTO;
        double precioConDescuento = subtotal - montoDescuento;

        // C�lculo del IVA
        double montoIVA = precioConDescuento * PORCENTAJE_IVA;

        // Total final
        double totalFinal = precioConDescuento + montoIVA;

        // Ahorro por el descuento
        double ahorro = montoDescuento;

        // Mostrar resultados en formato factura
        System.out.println("========================================");
        System.out.println("           FACTURA DE COMPRA            ");
        System.out.println("========================================");
        System.out.println();
        System.out.println("Producto: Art�culo gen�rico");
        System.out.println("Precio unitario: " + precioUnitario + " �");
        System.out.println("Cantidad: " + cantidad + " unidades");
        System.out.println("----------------------------------------");
        System.out.println("Subtotal: " + subtotal + " �");
        System.out.println();
        System.out.println("Descuento (" + (PORCENTAJE_DESCUENTO * 100) + "%): -" + montoDescuento + " �");
        System.out.println("Precio con descuento: " + precioConDescuento + " �");
        System.out.println();
        System.out.println("IVA (" + (PORCENTAJE_IVA * 100) + "%): " + montoIVA + " �");
        System.out.println("========================================");
        System.out.println("TOTAL A PAGAR: " + totalFinal + " �");
        System.out.println("========================================");
        System.out.println();
        System.out.println("�Has ahorrado " + ahorro + " � con el descuento!");
    }

}
