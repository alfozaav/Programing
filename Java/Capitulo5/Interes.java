//  Calculo del interés compuesto con for

public class Interes {
    public static void main(String[] args) {
        double monto; //    Monto depositado al final de cada año
        double principal = 1000.0; //   Monto inicial antes de los intereses
        double tasa = 0.05; // Tasa de interés

        //  Muestra los encabezados
        System.out.printf("%s%20s%n", "Año", "Monto de deposito");

        //  Calcula el monto en depósito para cada uno de los diez años
        for (int year = 1; year <= 10; ++year)
        {
            //  Calcula el nuevo monto para el año especificado
            monto = principal * Math.pow(1.0 + tasa, year);

            //  Muestra el año y el monto
            System.out.printf("%4d%,20.2f%n", year, monto);
        }
        //La coma indica que se debe ageragr esta cada 3 numeros, ejemplo : 1,230 / 2,784  
    }
}