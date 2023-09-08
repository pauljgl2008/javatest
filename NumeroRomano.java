import java.util.Map;
import java.util.TreeMap;

public class NumeroRomano {

    public static String convertirANumeroRomano(int numero) {
        // Verifica si el número está dentro del rango válido para números romanos.
        if (numero <= 0 || numero > 3999) {
            return "Número fuera de rango";
        }

        // Utilizamos un TreeMap para almacenar los valores romanos en orden descendente.
        TreeMap<Integer, String> valoresRomanos = new TreeMap<>();
        valoresRomanos.put(1000, "M");
        valoresRomanos.put(900, "CM");
        valoresRomanos.put(500, "D");
        valoresRomanos.put(400, "CD");
        valoresRomanos.put(100, "C");
        valoresRomanos.put(90, "XC");
        valoresRomanos.put(50, "L");
        valoresRomanos.put(40, "XL");
        valoresRomanos.put(10, "X");
        valoresRomanos.put(9, "IX");
        valoresRomanos.put(5, "V");
        valoresRomanos.put(4, "IV");
        valoresRomanos.put(1, "I");

        // Creamos un StringBuilder para construir la representación en números romanos.
        StringBuilder resultado = new StringBuilder();

        // Mientras el número sea mayor que cero, continuamos convirtiendo.
        while (numero > 0) {
            // Buscamos el valor romano más grande menor o igual al número.
            Map.Entry<Integer, String> par = valoresRomanos.floorEntry(numero);
            int valor = par.getKey();
            String simboloRomano = par.getValue();
            // Agregamos el símbolo romano al resultado y restamos el valor del número.
            resultado.append(simboloRomano);
            numero -= valor;
        }
        // Devolvemos la representación en números romanos como una cadena.
        return resultado.toString();
    }
    public static void main(String[] args) {
        int numero = 1984;
        String numeroRomano = convertirANumeroRomano(numero);
        System.out.println("El número " + numero + " en números romanos es: " + numeroRomano);
    }
}
