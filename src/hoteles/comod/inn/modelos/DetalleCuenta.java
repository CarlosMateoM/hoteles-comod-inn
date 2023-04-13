
package hoteles.comod.inn.modelos;

public class DetalleCuenta {
    
    private String concepto;
    private float valor;

    public DetalleCuenta(String concepto, float valor) {
        this.concepto = concepto;
        this.valor = valor;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    
    
}
