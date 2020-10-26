public class PolizaAuto {
    
    private int numeroCuenta;
    private String marcaModelo;
    private String estado;

    //  Constructor
    public PolizaAuto(int numeroCuenta, String marcaModelo, String estado)
    {
        this.numeroCuenta = numeroCuenta;
        this.marcaModelo = marcaModelo;
        this.estado = estado;
    }

    //  Establece el numeroCuenta
    public void establecerNumeroCuenta(int numeroCuenta)
    {
        this.numeroCuenta = numeroCuenta;
    }

    //  Devuelve el numeroCuenta
    public int obtenerNumeroCuenta()
    {
        return numeroCuenta;
    }

    //  Establece marcaModelo
    public void establecerMarcaModelo(String marcaModelo)
    {
        this.marcaModelo = marcaModelo;
    }

    //  Devuelve marcaModelo
    public String obtenerMarcaModelo()
    {
        return marcaModelo;
    }

    //  Establece estado
    public void establecerEstado(String estado)
    {
        this.estado = estado;
    }

    //  Devuelve estado
    public String obtenerEstado()
    {
        return estado;
    }

    //  Método predicado que devuelve si el estado tiene seguro sin culpa
    public boolean esEstadoSinCulpa(){

        boolean estadoSinCulpa;

        //  Determina si el estado tiene seguro de auto sin culpa
        switch(obtenerEstado())
        {
            case "MA": case "NJ": case "NY": case "PA":
                estadoSinCulpa = true;
                break;
            
            default:
                estadoSinCulpa = false;
                break;
        }

        return estadoSinCulpa;
    }
}