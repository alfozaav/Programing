public class Incremento {
    public static void main(String[] args) {
        //Postincremento
        int c = 5;
        System.out.printf("C antes del postincremento: %d%n", c);
        System.out.printf("Postincremento de C: %d%n", c++);
        System.out.printf("C después del postincremento: %d%n", c);

        System.out.print("");//Omite una linea

        //Preincremento
        c = 5;
        System.out.printf("C antes del preincremento: %d%n", c);
        System.out.printf("Preincremento de C: %d%n", ++c);
        System.out.printf("C después del preincremento: %d%n", c);
    }
}