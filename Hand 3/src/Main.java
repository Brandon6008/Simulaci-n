/**
 * -------------------------------------------------------------
 * Universidad: [Tu Universidad]
 * Materia: Análisis Predictivo y Modelos Matemáticos
 * Práctica: Modelo Simple Linear Regression - Caso Benetton
 * Fecha: 20 de octubre de 2025
 * Autor: [Tu Nombre Completo]
 * -------------------------------------------------------------
 * Descripción:
 * Clase principal que ejecuta el modelo de regresión lineal simple.
 * Carga los datos del caso Benetton, crea el modelo SLR, muestra
 * los resultados y realiza simulaciones para varios valores de Advertising.
 * -------------------------------------------------------------
 */

public class Main {
    public static void main(String[] args) {
        // Crear el dataset hardcoded
        DataSetBenetton datos = new DataSetBenetton();

        // Crear el modelo de regresión lineal simple
        SimpleLinearRegression modelo = new SimpleLinearRegression(
                datos.getAdvertising(),
                datos.getSales()
        );

        // Mostrar resultados del modelo
        modelo.mostrarResultados();

        // Simulación: predecir al menos 5 valores
        double[] valoresPrueba = {20, 30, 40, 50, 60};

        System.out.println("\n--- Simulación de Ventas ---");
        for (double valor : valoresPrueba) {
            double prediccion = modelo.predecir(valor);
            System.out.println("Advertising = " + valor + " → Sales (predicción) = " + String.format("%.2f", prediccion));
        }
    }
}
