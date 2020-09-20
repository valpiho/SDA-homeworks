package homeworks.september_13.task7;

import java.util.ArrayList;

public class Route {
    private String routeTitle;
    private ArrayList<String> cities;

    public Route(String routeTitle, ArrayList<String> cities) {
        this.routeTitle = routeTitle;
        this.cities = cities;

        checkForDoubles();
    }

    private void checkForDoubles() {
        for (int i = 0; i < this.cities.size(); i++) {
            for (int j = i + 1; j < this.cities.size(); j++) {
                if (this.cities.get(i).equals(this.cities.get(j))) {
                    this.cities.set(j, this.cities.get(j) + " back and forth");
                }
            }
        }
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
