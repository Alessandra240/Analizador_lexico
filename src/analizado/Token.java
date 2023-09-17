package analizado;

public class Token {

    private String valor;
    Tipos tipo;

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Tipos getTipo() {
        return tipo;
    }

    public void setTipo(Tipos tipo) {
        this.tipo = tipo;
    } // cierre de valores get y set
    
    enum Tipos {
        NUMERO("[0-9]+"),
        OPERADOR("[*|/|+|-]"),
        VARIABLE("[w-zW-Z]"),
        DESCONOCIDO ("[^w,x,y,z|pi|e|0-9|*|/|+|-]+"),
        CONSTANTE("[\bpi\b\be\b]");

        public final String patron;

        Tipos(String s) {
            this.patron = s;

        }// cierra constructor tipos

    } //cierra enum tipos

}//cierra de public
