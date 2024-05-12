import com.fasterxml.jackson.databind.JsonNode;
/**
 *
 * @author Bet Hdz
 */
public class Controller {
    
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void finalPerfiles() {
        try {
            JsonNode perfiles = model.obtenerPerfiles();
            view.mostrarPerfiles(perfiles);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
     public void procesarPerfiles() {
        try {
            JsonNode perfiles = model.obtenerPerfiles();
            model.guardarDato(perfiles);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
