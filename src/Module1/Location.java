package Module1;

import java.util.Locale;

public class Location {
    private String city;
    private double latitude;
    private double longitude;

    public Location(String city, double latitude, double longitude) {
        this.city = city;
        this.latitude = latitude;
        this.longitude = longitude;
    }

        //Getter Methods
    public String getCity() {
        return city;
    }

    public double getLatitude() {
        return latitude;
    }
    public double getLongitude() {
        return longitude;
    }

        //Setter Methods
    public void setCity(String city) {
        this.city = city;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }


    @Override
    public String toString() {
        if (city != null && !city.isEmpty()) {
            return String.format(Locale.ROOT, "%s (%.4f, %.4f)", city, latitude, longitude);
        }
        return String.format(Locale.ROOT, "(%.4f, %.4f)", latitude, longitude);
    }

}


