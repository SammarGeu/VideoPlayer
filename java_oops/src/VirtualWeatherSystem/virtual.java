//package VirtualWeatherSystem;
//
//
//import org.json.simple.JSONArray;
//import org.json.simple.JSONObject;
//import org.json.simple.JSONValue;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.net.HttpURLConnection;
//import java.net.URLEncoder;
//import java.net.URL;
//
//public class virtual {
//    private static JFrame frame;
//    private static JTextField locationField;
//    private static JTextArea weatherDisplay;
//    private static JButton fetchButton;
//    final private static String apiKey = "d5c6e8f92051525e81dfa50588268355";
//
//    private static String fetchWeatherData(String city) {
//        try {
//            String encodedCity = URLEncoder.encode(city, "UTF-8");
//            URL url = new URL("https://api.openweathermap.org/data/2.5/weather?q=" + encodedCity + "&appid=" + apiKey);
//            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//            connection.setRequestMethod("GET");
//
//            int responseCode = connection.getResponseCode();
//            if (responseCode != 200) {
//                return "Failed to fetch weather data. HTTP error code: " + responseCode;
//            }
//
//            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
//            StringBuilder response = new StringBuilder();
//            String line;
//            while ((line = reader.readLine()) != null) {
//                response.append(line);
//            }
//            reader.close();
//
//            JSONObject jsonObject = (JSONObject) JSONValue.parse(response.toString());
//            JSONObject mainObj = (JSONObject) jsonObject.get("main");
//
//            double temperatureKelvin = (double) mainObj.get("temp");
//            long humidity = (long) mainObj.get("humidity");
//            double temperatureCelsius = temperatureKelvin - 273.15;
//
//            JSONArray weatherArray = (JSONArray) jsonObject.get("weather");
//            JSONObject weather = (JSONObject) weatherArray.get(0);
//            String description = (String) weather.get("description");
//
//            JSONObject sysObj = (JSONObject) jsonObject.get("sys");
//            String country = (String) sysObj.get("country");
//
//            JSONObject coordObj = (JSONObject) jsonObject.get("coord");
//            double lat = (double) coordObj.get("lat");
//            double lon = (double) coordObj.get("lon");
//
//            JSONObject windObj = (JSONObject) jsonObject.get("wind");
//            double windSpeed = windObj != null ? (double) windObj.get("speed") : 0;
//
//            long visibility = (long) jsonObject.get("visibility");
//
//            return "City: " + city + "\n" +
//                    "Country: " + country + "\n" +
//                    "Coordinates: Latitude " + lat + ", Longitude " + lon + "\n" +
//                    "Description: " + description + "\n" +
//                    "Temperature: " + String.format("%.2f", temperatureCelsius) + " Celsius\n" +
//                    "Humidity: " + humidity + "%\n" +
//                    "Wind Speed: " + windSpeed + " m/s\n" +
//                    "Visibility: " + visibility + " meters";
//        } catch (Exception e) {
//            return "Failed to fetch weather data. Please check your city and API key.";
//        }
//    }
//
//    public static void main(String[] args) {
//        frame = new JFrame("Weather Forecast App");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(500, 400);
//        frame.setLayout(new FlowLayout());
//
//        locationField = new JTextField(15);
//        fetchButton = new JButton("Fetch Weather");
//        weatherDisplay = new JTextArea(15, 40);
//        weatherDisplay.setEditable(false);
//
//        frame.add(new JLabel("Enter City Name"));
//        frame.add(locationField);
//        frame.add(fetchButton);
//        frame.add(weatherDisplay);
//
//        fetchButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String city = locationField.getText();
//                String weatherInfo = fetchWeatherData(city);
//                weatherDisplay.setText(weatherInfo);
//            }
//        });
//        frame.setVisible(true);
//    }
//}
//
