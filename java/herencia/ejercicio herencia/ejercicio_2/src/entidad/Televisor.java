
package entidad;


public class Televisor extends Electrodomesticos{
    
    
    protected int resolucionPulgadas;
    protected Boolean tdt;

    public Televisor() {
    }

    public Televisor(int resolucionPulgadas, Boolean tdt, Double precio, String color, String consumoEnergetico, Double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucionPulgadas = resolucionPulgadas;
        this.tdt = tdt;
    }

    public int getResolucionPulgadas() {
        return resolucionPulgadas;
    }

    public void setResolucionPulgadas(int resolucionPulgadas) {
        this.resolucionPulgadas = resolucionPulgadas;
    }

    public Boolean getTdt() {
        return tdt;
    }

    public void setTdt(Boolean tdt) {
        this.tdt = tdt;
    }

    public Televisor crearTelevisor() {
        System.out.println("Creamos un Televisor");
        System.out.println("");
        Electrodomesticos electro = crearElectrodomestico();
        System.out.println("ingresar la resolucion de la pantalla en pulgadas");
        int  resPulgadas = leer.nextInt();
        System.out.println("Tiene tdt?");
        boolean tDt = leer.nextBoolean();
        return new Televisor(resPulgadas, tDt, electro.getPrecio(), electro.getColor(), electro.getConsumoEnergetico(), electro.getPeso());
    }

    @Override
    public void precioFinal() {
        super.precioFinal(); 
        if (this.getResolucionPulgadas()>40) this.setPrecio((this.getPrecio()*0.30)+this.getPrecio());
        if (this.getTdt()) this.setPrecio(this.getPrecio()+500);
    }
    
    
    
    
}
