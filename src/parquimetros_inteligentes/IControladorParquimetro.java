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
public interface IControladorParquimetro {
    
    void AutoDetectado(String Patente);
    void AvanzarMinuto();
    boolean EstacionamientoFinalizado(boolean estado);
    
}
