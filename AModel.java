import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class AModel {
    private String aId;

    public AModel(String aId) {
        this.aId = aId;
    }

    public String fetchDataFromGoogleScholar() throws Exception {
        String url = "https://scholar.google.com/citations?user=Xahj4nQAAAAJ&hl=es&oi=sra" + aId;
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        // Configurar petición
        con.setRequestMethod("GET");

        int responseCode = con.getResponseCode();
        System.out.println("Código de respuesta: " + responseCode);

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        return response.toString();
    }
}
