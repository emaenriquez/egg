

package enumeraciones;

public enum RazaPeruna {
    BEAGEL(1221,"beagel"),MESTIZO(12221,"beagel"),CHIGUGUA(1221121,"beagel"),PITBULL(122131,"beagel");
    
    private Integer codigo;
    private String valor;
    
    private RazaPeruna(Integer codigo,String valor){
        this.codigo = codigo;
        this.valor = valor;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getValor() {
        return valor;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    
    
    
}
