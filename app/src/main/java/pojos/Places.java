package pojos;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

import pojos.Place;

public class Places {
    @SerializedName("results") //maaping of result array to list
    private ArrayList<Place> list;

    public ArrayList<Place> getList() {
        return list;
    }

    public void setList(ArrayList<Place> list) {
        this.list = list;
    }
}
