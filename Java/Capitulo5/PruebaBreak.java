public class PruebaBreak {
    public static void main(String[] args) {
        int cuenta;

        for (cuenta = 1; cuenta <= 10; cuenta++)
        {
            if (cuenta == 5)
                break;
            
            System.out.printf("%d",  cuenta);
        }

        System.out.printf("%n Salió del cliclo en cuenta = %d%n", cuenta);
    }
}