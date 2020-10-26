public class PruebaPolizaAuto {
    public static void main(String[] args) {
        //  Crea dos objetos PolizaAuto
        PolizaAuto poliza1 = new PolizaAuto(11111111, "Toyota Camry", "NJ");
        PolizaAuto poliza2 = new PolizaAuto(22222222, "Ford Fusion", "ME");
    }

    //  Método que demuestra en la pantalla si una poliza se encuentra en un estado sin culpa
    public static void polizaSinCulpa(PolizaAuto poliza)
    {
        System.out.print("La poliza de auto:");
        System.out.printf(
            "Cuenta: #%d; Auto: %s; Estado %s %s un estado sin culpa%n%n",
            poliza.obtenerNumeroCuenta(), poliza.obtenerMarcaModelo(), poliza.obtenerEstado(),
            (poliza.esEstadoSinCulpa() ? "está en:" : "no está en:"));
    }
}