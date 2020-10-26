import java.util.Scanner;

public class Analisis {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Inicialización
        int aprobados = 0;
        int reprobados = 0;
        int contadorEstudiantes = 1;

        //Procesamiento
        while (contadorEstudiantes <= 10){
            System.out.print("Escriba el resultado (1 = aprobado, 2= reprobado): ");
            int resultado = entrada.nextInt();

            if (resultado == 1)
                aprobados = aprobados + 1;
            else
                reprobados = reprobados + 1;

            contadorEstudiantes = contadorEstudiantes + 1;
        }

        //Terminación
        System.out.printf("Aprobados: %d%nReprobados: %d%n", aprobados, reprobados);

        if(aprobados > 8)
            System.out.print("Bono para el instructor!");
    }
}