import java.io.BufferedReader;
import java.io.IOException;

public class Util {
    public static String converteJsonString(BufferedReader buffereReader) throws IOException {
        String resposta, jsonString = "";
        while ((resposta = buffereReader.readLine()) != null) {
            jsonString += resposta;
        }
        return jsonString;
    }
}
