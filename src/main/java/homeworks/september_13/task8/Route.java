package homeworks.september_13.task8;

import java.util.ArrayList;

public class Route {
    private String routeTitle;
    private ArrayList<String> cities;

    public Route() {}

    public Route(String routeTitle, ArrayList<String> cities) {
        this.routeTitle = routeTitle;
        this.cities = cities;
    }

    public String getRouteTitle() {
        return routeTitle;
    }

    public void setRouteTitle(String routeTitle) {
        this.routeTitle = routeTitle;
    }

    public ArrayList<String> getCities() {
        return cities;
    }

    public void setCities(ArrayList<String> cities) {
        this.cities = cities;
    }

    @Override
    public String toString() {
        return "Route: " +
                "Title= '" + this.routeTitle + '\'' +
                ", cities=" + this.cities;
    }
}
