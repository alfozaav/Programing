public class PruebaContinue {
    public static void main(String[] args) {
        for (int cuenta = 1; cuenta <= 10; cuenta++)
        {
            if (cuenta == 5)
                continue;

            System.out.printf("%d", cuenta);
        }

        System.out.print("Se usó continue para para omitir imprimir 5");
    }
}