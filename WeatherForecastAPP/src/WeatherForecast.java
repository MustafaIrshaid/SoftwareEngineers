
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ameed
 */
public class WeatherForecast {
    private float humidity, pressure, windSpeed;
    private int temp, maxTemp, minTemp, feelsLike;
    private String description="";

    
    public WeatherForecast(){
        this.temp=0;
        this.maxTemp=0;
        this.minTemp=0;
        this.humidity=0;
        this.pressure=0;
        this.windSpeed=0;
        this.feelsLike=0;
    }
    
    public WeatherForecast(int temp,float humidity,float pressure,float windSpeed, int maxTemp, int minTemp, int feelsLike){
        this.temp=temp;
        this.humidity=humidity;
        this.pressure=pressure;
        this.windSpeed=windSpeed;
        this.minTemp = minTemp;
        this.maxTemp = maxTemp;
        this.feelsLike = feelsLike;
    }

    @Override
    public String toString() {
        return "WeatherForecast{" + "humidity=" + humidity + ", pressure=" + pressure + ", windSpeed=" + windSpeed + ", temp=" + temp + ", maxTemp=" + maxTemp + ", minTemp=" + minTemp + ", feelsLike=" + feelsLike + ", description=" + description + '}';
    }

    
    
    public static WeatherForecast getDay(String Location){
        WeatherForecast thisDayWeather = new WeatherForecast();
        float humidity=0, pressure=0, windSpeed=0;
        int temp=0, maxTemp=0, minTemp=0, feelsLike=0;
        String description="";
        try {
            HttpResponse<String> response = Unirest.get("https://community-open-weather-map.p.rapidapi.com/weather?q=Nablus&lat=0&lon=0&callback=test&id=2172797&lang=null&units=imperial&mode=xml")
                    .header("X-RapidAPI-Host", "community-open-weather-map.p.rapidapi.com")
                    .header("X-RapidAPI-Key", "f4c3ccca47msh1d25b694f6c7db2p1ec471jsn79326608e90f")
                    .asString();
            for(String allDaysSeperator: response.getBody().split("weather")[1].split(",")){
                System.out.println(allDaysSeperator);
                if(allDaysSeperator.contains("description")) 
                    description = getDescription("description",allDaysSeperator);
                else if(allDaysSeperator.contains("humidity"))
                        humidity = getValue("humidity",allDaysSeperator);
                else if(allDaysSeperator.contains("pressure"))
                    pressure = getValue("pressure",allDaysSeperator);
                else if(allDaysSeperator.contains("wind"))
                    windSpeed = getValue("speed",allDaysSeperator);
                else if(allDaysSeperator.contains("main"))
                    temp = (int)getValue("temp",allDaysSeperator);
                else if(allDaysSeperator.contains("temp_max"))
                    maxTemp = (int)getValue("temp_max",allDaysSeperator);
                else if(allDaysSeperator.contains("temp_min"))
                    minTemp = (int)getValue("temp_min",allDaysSeperator);
                else if(allDaysSeperator.contains("feels_like"))
                    feelsLike = (int) getValue("feels_like",allDaysSeperator);
            }
            thisDayWeather = new WeatherForecast(temp, humidity, pressure, windSpeed, maxTemp, minTemp,feelsLike);
            thisDayWeather.setDescription(description);
            System.out.println(thisDayWeather.toString());
        } catch (UnirestException ex) {
            Logger.getLogger(WeatherForecast.class.getName()).log(Level.SEVERE, null, ex);
        }
        return thisDayWeather;
    }
    
    public static ArrayList<WeatherForecast> getList(String Location){
        ArrayList<WeatherForecast> weather7Days = new ArrayList<>();
        float humidity=0, pressure=0, windSpeed=0;
        int temp=0, maxTemp=0, minTemp=0;
        boolean flagEntered = false;
        try {
            HttpResponse<String> response = Unirest.get("https://community-open-weather-map.p.rapidapi.com/climate/month?q="+Location+"")
	.header("X-RapidAPI-Host", "community-open-weather-map.p.rapidapi.com")
	.header("X-RapidAPI-Key", "f4c3ccca47msh1d25b694f6c7db2p1ec471jsn79326608e90f")
	.asString();
            
            for(String allDaysSeperator: response.getBody().split("list")[1].split("\"dt\":")){
                flagEntered = false;
                for(String specificDaySeperator: allDaysSeperator.split(",")){
                    if(specificDaySeperator.contains("humidity"))
                        humidity = getValue("humidity",specificDaySeperator);
                    else if(specificDaySeperator.contains("pressure"))
                        pressure = getValue("pressure",specificDaySeperator);
                    else if(specificDaySeperator.contains("wind_speed"))
                        windSpeed = getValue("wind_speed",specificDaySeperator);
                    else if(specificDaySeperator.contains("temp"))
                        temp = (int)getValue("average",specificDaySeperator);
                    else if(specificDaySeperator.contains("average_max"))
                        maxTemp = (int)getValue("average_max",specificDaySeperator);
                    else if(specificDaySeperator.contains("average_min")){
                        minTemp = (int)getValue("average_min",specificDaySeperator);
                        flagEntered = true;
                    }
                }
                if(flagEntered){ weather7Days.add(new WeatherForecast(temp, humidity, pressure, windSpeed, maxTemp, minTemp,0));
                    System.out.println(weather7Days.get(weather7Days.size()-1));
                }
            }
        } catch (UnirestException ex) {
            Logger.getLogger(WeatherFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        return weather7Days;
    }
    
    private static float getValue(String para, String line){
        String []spliter = line.split("\""+para+"\":");
        
        if(spliter.length > 1)
            return Float.parseFloat(spliter[1].split("}")[0]);
        return -1;
    }
    
    private static String getDescription(String para, String line){
        String []spliter = line.split("\""+para+"\":");
        return spliter[1].split("}")[0].replaceAll("\"", "");
    }
    
    public static int FirToCil(int cil){
        return (cil-32) * 5/9;
    }
    
    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public float getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(float windSpeed) {
        this.windSpeed = windSpeed;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public int getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(int maxTemp) {
        this.maxTemp = maxTemp;
    }

    public int getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(int minTemp) {
        this.minTemp = minTemp;
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getFeelsLike() {
        return feelsLike;
    }

    public void setFeelsLike(int feelsLike) {
        this.feelsLike = feelsLike;
    }
    
}
