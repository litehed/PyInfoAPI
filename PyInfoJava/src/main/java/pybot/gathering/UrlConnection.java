package pybot.gathering;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;


public class UrlConnection {
	
	private static HttpURLConnection con;
	
	public UrlConnection(String queryVariable, String parameter) throws IOException {

        String url = "http://localhost:8080/";

        try {

        	String charset = "UTF-8";
        	String queryVar = queryVariable;
            String param1 = parameter;

            String query = String.format(queryVar + "=%s", 
            URLEncoder.encode(param1, charset));
            con = (HttpURLConnection) new URL(url + "?" + query).openConnection();
            con.setRequestMethod("GET");
            
            StringBuilder content;

            try (BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()))) {

                String line;
                content = new StringBuilder();

                while ((line = in.readLine()) != null) {

                    content.append(line);
                    content.append(System.lineSeparator());
                }
            }

            System.out.println(content.toString());

        } finally {

            con.disconnect();
        }
    }
}
