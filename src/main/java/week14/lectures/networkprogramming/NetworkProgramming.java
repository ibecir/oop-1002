package week14.lectures.networkprogramming;

import org.json.JSONObject;

import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// https://jsonbin.io/quick-store/6578205fdc74654018821d0c
public class NetworkProgramming {
    public static void main(String[] args) throws IOException {
//        readUrl("https://klix.ba");
//         readPageData("https://rtrs.tv");
//        readJson("https://mocki.io/v1/8b38db79-9caf-47c7-a997-162e30379e67");
        // postExample();
//        socketServer(2345);
        socketClient("127.0.0.1", 2345);
//        readSimpleJson();
    }

    public static void readUrl(String urlAddress) {
        try {
            URL url = new URL(urlAddress);
            System.out.println("URL is ok, protocol used is " + url.getProtocol() + ", and the authority " + url.getAuthority());
        } catch (MalformedURLException e) {
            System.out.println("String " + urlAddress + " is not a valid URL");
        }
    }

    public static void readPageData(String urlAddress) throws IOException {
        URL url = new URL(urlAddress);
        BufferedReader inputStream = new BufferedReader(new InputStreamReader(url.openStream(), StandardCharsets.UTF_8));
        String content = "";
        String line = null;
        while ((line = inputStream.readLine()) != null) content = content + line;

        String pattern = "<h1[^>]*>(.*?)</h1>";

        Pattern regex = Pattern.compile(pattern, Pattern.DOTALL);
        Matcher matcher = regex.matcher(content);

        while (matcher.find()) {
            String h2Content = matcher.group(1);
            System.out.println("Matched h2 content: " + h2Content);
        }
    }

    public static void readSimpleJson() {
        String json = "{ \"key\": \"value\" }";
        JSONObject jsonObject = new JSONObject(json);
        System.out.println(jsonObject);
        System.out.println(jsonObject.getString("key"));
    }

    public static void readJson(String urlAddress) throws IOException {
        /*
        * SAMPLE JSON
        {
          "id": 1,
          "name": "Alice",
          "contact": {
            "email": "alice@example.com",
            "phone": "123-456-7890"
          },
          "roles": ["admin", "editor"],
          "preferences": {
            "notifications": {
              "email": true,
              "sms": false
            }
          }
        }
        * */
        URL url = new URL(urlAddress);
        BufferedReader inputStream = new BufferedReader(new InputStreamReader(url.openStream(), StandardCharsets.UTF_8));
        String content = "";
        String line = null;
        while ((line = inputStream.readLine()) != null) content = content + line;

        JSONObject jsonObject = new JSONObject(content);
        System.out.println(jsonObject.getJSONObject("preferences"));
        System.out.println(jsonObject.getJSONArray("roles"));
        System.out.println(jsonObject.getString("name"));
    }

    public static void postExample() throws IOException {
        URL url = new URL("http://localhost:8080/articles/");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-Type", "application/json; utf-8");
        connection.setRequestProperty("Accept", "application/json");
        connection.setDoOutput(true);

        String jsonInput = "{\"thumbnailUrl\": \"string\", \"title\": \"Hamic\", \"content\": \"Hamigudaa\", \"articleType\": \"SHORT_ARTICLE\"}";
        OutputStream outputStream = connection.getOutputStream();
        byte[] input = jsonInput.getBytes("utf-8");
        outputStream.write(input, 0, input.length);
        System.out.println(connection.getResponseCode());
    }

    public static void socketServer(int port) {
        try {
            ServerSocket serverSocket = new ServerSocket(2345);
            while (true) {
                Socket connection = serverSocket.accept();
                InputStream inputStream = connection.getInputStream();

                System.out.println("Client connected: " + connection.getInetAddress());
                // Read data from the client
                byte[] buffer = new byte[1024];
                int bytesRead = inputStream.read(buffer);
                String message = new String(buffer, 0, bytesRead);
                System.out.println("Received message from client: " + message);

                OutputStream output = connection.getOutputStream();
                PrintWriter writer = new PrintWriter(output, true); // auto-flush

                writer.println("Hello, client!");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void socketClient(String address, int port) {
        try {
            // Connect to the server
            Socket socket = new Socket(address, port);

            // Create a BufferedReader to read from the server
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            OutputStream output = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true); // auto-flush

            writer.println("Hello, server!");

            // Read data from the server
            String serverData;
            while ((serverData = input.readLine()) != null) {
                System.out.println(serverData);
            }

            // Close the connection
            input.close();
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
