/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Jhostin Roja
 */
public class Pasajeros {
    private Integer idPasajeros;
    private String DNI;
    private String nombres;
    private String apellidos;
    private String telefono;
    private VentaBoleto datosboleto;

        
    
    

    public Pasajeros(Integer idPasajeros, String DNI, String nombres,String apellidos, String telefono, VentaBoleto datosboleto) {
        this.DNI = DNI;
        this.apellidos = apellidos;
        this.datosboleto = datosboleto;
        this.nombres = nombres;
        this.telefono = telefono;
        this.idPasajeros = idPasajeros;
    }

    public Pasajeros() {
        
    }

    public Integer getIdPasajeros() {
        return idPasajeros;
    }

    public void setIdPasajeros(Integer idPasajeros) {
        this.idPasajeros = idPasajeros;
    }
    
    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI= DNI;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public VentaBoleto getDatosboleto() {
        return datosboleto;
    }

    public void setDatosboleto(VentaBoleto datosboleto) {
        this.datosboleto = datosboleto;
    }
    
    
    @Override
    public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Información del Pasajero:\n");
    stringBuilder.append("ID del Pasajero: ").append(idPasajeros).append("\n");
    stringBuilder.append("DNI: ").append(DNI).append("\n");
    stringBuilder.append("Nombres: ").append(nombres).append("\n");
    stringBuilder.append("Apellidos: ").append(apellidos).append("\n");
    stringBuilder.append("Teléfono: ").append(telefono).append("\n");
    stringBuilder.append("Datos del Boleto: ").append(datosboleto).append("\n");
    return stringBuilder.toString();
}
}
    
    
    

