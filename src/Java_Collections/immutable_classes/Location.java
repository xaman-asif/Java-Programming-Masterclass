package Java_Collections.immutable_classes;

import java.util.HashMap;
import java.util.Map;

public class Location {
    //make all the fields final & private
    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;

    public Location(int locationID, String description, Map<String, Integer> exits) {
        this.locationID = locationID;
        this.description = description;
        this.exits = new HashMap<>(exits);
        this.exits.put("Q", 0);
    }

    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<>(exits);
    }
}
