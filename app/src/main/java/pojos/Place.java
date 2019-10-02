package pojos;

import pojos.Geometery;

public class Place {
    private  String name;
    private  String vinicity;
    private Geometery geometry;  //geometry same as Json name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVinicity() {
        return vinicity;
    }

    public void setVinicity(String vinicity) {
        this.vinicity = vinicity;
    }

    public Geometery getGeometery() {
        return geometry;
    }

    public void setGeometery(Geometery geometery) {
        this.geometry = geometery;
    }


}
