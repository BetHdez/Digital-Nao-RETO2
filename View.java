 import com.fasterxml.jackson.databind.JsonNode;

/**
 *
 * @author Bet Hdz
 */
public class View {
    
    
    // Verificar si el nodo de perfiles existe
    public void mostrarPerfiles(JsonNode perfiles) {
         System.out.println("Top 10 de investigadores de la universidad (IPN)");
         
        if (perfiles != null && perfiles.isArray()) {
            for (JsonNode perfil : perfiles) {
                String nombre = perfil.get("name").asText();
               
                System.out.println("Nombre: " + nombre);
            }
        }
    }
}
