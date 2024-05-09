import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
/**
 *
 * @author Bet Hdz
 */
public class Model {

     public JsonNode obtenerPerfiles() throws Exception {
        String url = "https://serpapi.com/search.json?engine=google_scholar_profiles&mauthors=IPN&hl=es-419&api_key=5d22edaa9923020628bb570a6ed33b22961c1017864e6a8b20e030202b8992fc";

        // Crear un cliente HTTP
        HttpClient client = HttpClient.newHttpClient();
        // Crear una solicitud HTTP GET con la URL proporcionada
        HttpRequest request = HttpRequest.newBuilder() 
       // Aqui se convierte la cadena URL en un objeto URI
                .uri(URI.create(url))
                .header("User-Agent", "Mozilla/5.0")
                .build();
          // Enviar la solicitud y obtener la respuesta
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        // Extraer la respuesta
        String jsonResponse = response.body();

        
        // Crear un objeto ObjectMapper para manejar JSON
        ObjectMapper objectMapper = new ObjectMapper();
        // Convertir la respuesta JSON en un árbol de nodos JSON
        JsonNode rootNode = objectMapper.readTree(jsonResponse);

   
         return rootNode.get("profiles");
        }
    }

   
