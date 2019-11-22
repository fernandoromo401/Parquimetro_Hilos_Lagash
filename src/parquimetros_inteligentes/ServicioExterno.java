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
public class ServicioExterno {
    
    private String asunto;
    private String cuerpo;
    private String destinatario;

    public ServicioExterno() {
    }
    
    static String ObtenerEmailXPatente(String mail) {
        mail = "mail@example.org";
        
        return mail;
    }

    public static void EnviarEmail(String asunto, String cuerpo, String destinatario){
        System.out.println("Destinatario: " + destinatario);
        System.out.println("Asunto: " + asunto);
        System.out.println("Cuerpo: " + cuerpo);
    }
    
    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }
   
    
}
