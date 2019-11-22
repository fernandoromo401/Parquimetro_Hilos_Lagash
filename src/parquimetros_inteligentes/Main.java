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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ControladorParquimetro estadoParquimetro1 = new ControladorParquimetro("aa 123 aa", 120, 1000);

            if (estadoParquimetro1.getPatente() != null) {

                if (estadoParquimetro1.EstacionamientoFinalizado(true) == true) {
                    
                    ControladorParquimetro estadoParquimetro = new ControladorParquimetro(null, 0, 1000);
                    estadoParquimetro.AutoDetectado("");
                    
                    int tiempo = (estadoParquimetro1.getMinutosEstacionado() / 60) + 1;
                    int precio = estadoParquimetro1.getCentavosPorHora();
                    float total = tiempo * precio;
                    float totalP = total / 100;

                    String mail = ServicioExterno.ObtenerEmailXPatente(estadoParquimetro1.getPatente());
                    System.out.println("Mail enviado a ultimo vehiculo estacionado");
                    System.out.println("Patente: " + estadoParquimetro1.getPatente());
                    System.out.println("-------MAIL--------");
                    ServicioExterno.EnviarEmail("Parquimetro Inteligente", "Tiene que abonar: $" + totalP, mail);

                    
                }
                else{
                    estadoParquimetro1.AutoDetectado("");
                    System.out.println("Tiempo: " + estadoParquimetro1.getMinutosEstacionado() + " minutos");
                }
            }
            else{
                estadoParquimetro1.AutoDetectado("");
                System.out.println("Tiempo: " + estadoParquimetro1.getMinutosEstacionado() + " minutos");
            }
            
        }
    
}
