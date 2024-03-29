package pojos;

import com.google.gson.annotations.SerializedName;

public class Location {
@SerializedName("lat")
    double latitude;
@SerializedName("lng")  //json name
    double longitude;

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
