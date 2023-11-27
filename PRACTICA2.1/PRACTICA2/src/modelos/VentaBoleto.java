/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Jhostin Roja
 */
public class VentaBoleto {
    private String Salida;
    private String Llegada;
    private Integer idBoletos;
    private Integer BoletosComprados;
    private String FechadeSalida;
    private String HoradeEmbarque;
    private Float PrecioTotal;




public VentaBoleto(Integer idBoletos, String Salida, Integer BoletosComprados, String Llegada, String FechadeSalida, Float PrecioTotal){
    this.Salida = Salida;
    this.Llegada = Llegada; 
    this.idBoletos = idBoletos;
    this.BoletosComprados = BoletosComprados;
    this.FechadeSalida = FechadeSalida;
    this.HoradeEmbarque = HoradeEmbarque;
    this.PrecioTotal = PrecioTotal;
}

    public String getSalida() {
        return Salida;
    }

    public void setSalida(String Salida) {
        this.Salida = Salida;
    }

    public String getLlegada() {
        return Llegada;
    }

    public void setLlegada(String Llegada) {
        this.Llegada = Llegada;
    }

    public Integer getIdBoletos() {
        return idBoletos;
    }

    public void setIdBoletos(Integer idBoletos) {
        this.idBoletos = idBoletos;
    }

    public Integer getBoletosComprados() {
        return BoletosComprados;
    }

    public void setBoletosComprados(Integer BoletosComprados) {
        this.BoletosComprados = BoletosComprados;
    }

    public String getFechadeSalida() {
        return FechadeSalida;
    }

    public void setFechadeSalida(String FechadeSalida) {
        this.FechadeSalida = FechadeSalida;
    }

    public String getHoradeEmbarque() {
        return HoradeEmbarque;
    }

    public void setHoradeEmbarque(String HoradeEmbarque) {
        this.HoradeEmbarque = HoradeEmbarque;
    }

    public Float getPrecioTotal() {
        return PrecioTotal;
    }

    public void setPrecioTotal(Float PrecioTotal) {
        this.PrecioTotal = PrecioTotal;
    }
    @Override
   public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Detalles de la Venta de Boleto:\n");
    stringBuilder.append("ID de Boleto: ").append(idBoletos).append("\n");
    stringBuilder.append("Llegada: ").append(Llegada).append("\n");
    stringBuilder.append("Salida: ").append(Salida).append("\n");
    stringBuilder.append("Boletos Comprados: ").append(BoletosComprados).append("\n");
    stringBuilder.append("Fecha de Salida: ").append(FechadeSalida).append("\n");
    stringBuilder.append("Hora de Embarque: ").append(HoradeEmbarque).append("\n");
    stringBuilder.append("Precio Total: ").append(PrecioTotal).append("\n");
    return stringBuilder.toString();
   }

}




