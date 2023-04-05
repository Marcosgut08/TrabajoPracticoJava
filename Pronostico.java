package trabajopráctico;

public class Pronostico {
    public int codigoPartido;
    public Equipo equipo;
    public ResultadoEnum resultado;
    

    public Pronostico(int codigoPartido, Equipo equipo, int codigo) {
        this.codigoPartido = codigoPartido;
        this.equipo = equipo;
        this.resultado = new ResultadoEnum(codigo);
    }

    public int Puntos(Partido partido) {
    	if(partido.Resultado(equipo).codigo == this.resultado.codigo) {
    		return 2;
    	} 
    	return 0;       
    }
}