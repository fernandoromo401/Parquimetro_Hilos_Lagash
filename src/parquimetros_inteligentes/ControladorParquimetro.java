/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parquimetros_inteligentes;

/**
 *
 * @author Fernando
 */
public class ControladorParquimetro implements IControladorParquimetro{

    //Atrubutos de la clase
    private String patente;
    private int minutosEstacionado;
    private int centavosPorHora;
    //Asociasion a servicio externo
    private ServicioExterno servicioExterno;

    //Constructor Vacio
    public ControladorParquimetro() {
    }
    //Constructor sobrecargado
    public ControladorParquimetro(String patente, int minutosEstacionado, int centavosPorHora) {
        this.patente = patente;
        this.minutosEstacionado = minutosEstacionado;
        this.centavosPorHora = centavosPorHora;
    }
    //Metodos
    @Override
    public void AutoDetectado(String Patente) {
        if (patente != null) {
            System.out.println("------------------");
            System.out.println("Estado actual del parquimetro:");
            System.out.println("Ocupado:");
            System.out.println("Patente: " + patente);
            System.out.println("------------------");
	}
	if (patente == null){
            int tiempo = 0;
            System.out.println("-------------------");
            System.out.println("Estado actual del parquimetro:");
            System.out.println("No hay ningun auto");
            System.out.println("Tiempo: " + tiempo);
            System.out.println("------------------");
	}
    }

    @Override
    public void AvanzarMinuto() {
        System.out.println("Avanzo un minuto");
    }

    @Override
    public boolean EstacionamientoFinalizado(boolean estado) {
        
        
               
        return estado;
    } 
    
    

    // Los getter and setter de cada atributo   
    public int getCentavosPorHora() {
        return centavosPorHora;
    }
    public void setCentavosPorHora(int centavosPorHora) {
        this.centavosPorHora = centavosPorHora;
    }
    public int getMinutosEstacionado() {
        return minutosEstacionado;
    }
    public void setMinutosEstacionado(int minutosEstacionado) {
        this.minutosEstacionado = minutosEstacionado;
    }
    public String getPatente() {
        return patente;
    }
    public void setPatente(String patente) {
        this.patente = patente;
    }
    public ServicioExterno getServicioExterno() {
        return servicioExterno;
    }
    public void setServicioExterno(ServicioExterno servicioExterno) {
        this.servicioExterno = servicioExterno;
    }
    
   
}
