import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class CepService {

    static int sucess = 200;
    static String webService = "http://viacep.com.br/ws/";

    public static Endereco buscaCep(String cep) throws Exception {
        String urlChamada = webService + cep + "/json";

        try {
            URL url = new URL(urlChamada);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            if (connection.getResponseCode() != sucess)
                throw new RuntimeException("Error" + connection.getResponseCode());

            BufferedReader resposta = new BufferedReader(new InputStreamReader((connection.getInputStream())));
            String jsonString = Util.converteJsonString(resposta);

            Gson gson = new Gson();
            Endereco endereco = gson.fromJson(jsonString, Endereco.class);

            return endereco;
        } catch (Exception e) {
            throw new Exception("ERRO: " + e);
        }
    }
}