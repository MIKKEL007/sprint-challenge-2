public class Sistema {
    private static ConsultaConversion consulta = new ConsultaConversion();

    public static void proceso(String tipoMoneda, double cantidadConvertir, String tipoMonedaConvertir) {

        try {
            Moneda moneda = consulta.buscaMoneda(tipoMoneda);

          double base = moneda.conversion_rates().get(tipoMonedaConvertir);
          double total = cantidadConvertir * base;

          info(tipoMoneda, base, tipoMonedaConvertir,cantidadConvertir ,total);
        } catch (NumberFormatException e) {
            System.out.println("Número no encontrado " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando la aplicación.");
        }

    }

    public static void menu() {
        String menu = """
                ********************************************
                Sean bienvenido/a al conversor de Moneda :]

                1) Dolar =>> Peso argentino
                2) Peso argentino =>> Dolar
                3) Dolar =>> Real brasileño
                4) Real brasileño =>> Dolar
                5) Dolar =>> Peso colombiano
                6) Peso colombiano =>> Dolar
                7) SALIR


                Elija una opcion valida:
                ********************************************
                """;

        System.out.println(menu);
    }

    public static void info(String tipoMoneda, double valor1, String tipoMonedaConvertir, double valor2, double total) {

        String datos = """

                TASA DE CONVERSION:
                -----------------------------
                - 1 %s = %.4f %s
                -----------------------------
                - VALOR EN [%s] = %.2f
                - VALOR EN [%s] = %.2f
                -----------------------------
                """.formatted(tipoMoneda, valor1, tipoMonedaConvertir, tipoMoneda, valor2, tipoMonedaConvertir, total);

        System.out.println(datos);
    }
}
