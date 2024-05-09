import java.util.ArrayList;

public class CampusMap {

    ArrayList<Building> buildings;

    /* Default constructor, initializes empty ArrayList */
    public CampusMap() {
        buildings = new ArrayList<Building>();
    }

    /**
     * Adds a Building to the map
     * @param b the Building to add
     */
    public void addBuilding(Building b) {
        System.out.println("Adding building...");
        buildings.add(b);
        System.out.println("-->Successfully added " + b.getName() + " to the map.");
    }

    /**
     * Adds a House to the map
     * @param b the Building to add
     */
    public void addBuilding(House b) {
        System.out.println("Adding building...");
        buildings.add(b);
        System.out.println("-->Successfully added " + b.getName() + " to the map.");
    }

    /**
     * Adds a Library to the map
     * @param b the Building to add
     */
    public void addBuilding(Library b) {
        System.out.println("Adding building...");
        buildings.add(b);
        System.out.println("-->Successfully added " + b.getName() + " to the map.");
    }

    /**
     * Adds a Cafe to the map
     * @param b the Building to add
     */
    public void addBuilding(Cafe b) {
        System.out.println("Adding building...");
        buildings.add(b);
        System.out.println("-->Successfully added " + b.getName() + " to the map.");
    }

    /**
     * Removes a Building from the map
     * @param b the Building to remove
     * @return the removed Building
     */
    public Building removeBuilding(Building b) {
        System.out.println("Removing building...");
        buildings.remove(b);
        System.out.println("-->Successfully removed " + b.getName() + " to the map.");
        return b;
    }

    /**
     * Removes a house from the map
     * @param b the Building to remove
     * @return the removed Building
     */
    public Building removeBuilding(House b) {
        System.out.println("Removing building...");
        buildings.remove(b);
        System.out.println("-->Successfully removed " + b.getName() + " to the map.");
        return b;
    }

    /**
     * Removes a Library from the map
     * @param b the Building to remove
     * @return the removed Building
     */
    public Building removeBuilding(Library b) {
        System.out.println("Removing building...");
        buildings.remove(b);
        System.out.println("-->Successfully removed " + b.getName() + " to the map.");
        return b;
    }

    /**
     * Removes a Cafe from the map
     * @param b the Building to remove
     * @return the removed Building
     */
    public Building removeBuilding(Cafe b) {
        System.out.println("Removing building...");
        buildings.remove(b);
        System.out.println("-->Successfully removed " + b.getName() + " to the map.");
        return b;
    }

    public String toString() {
        String mapString = "DIRECTORY of BUILDINGS";

        for (int i = 0; i < this.buildings.size(); i ++) {
            mapString += "\n  " + (i+1) + ". "+ this.buildings.get(i).getName() + " (" + this.buildings.get(i).getAddress() + ")";
        }
        return mapString;
    }

    public static void main(String[] args) {
        CampusMap myMap = new CampusMap();
        myMap.addBuilding(new Building("Ford Hall", "100 Green Street Northampton, MA 01063", 4));
        myMap.addBuilding(new Building("Bass Hall", "4 Tyler Court Northampton, MA 01063", 4));
        myMap.addBuilding(new Cafe("Campus Cafe", "100 Elm Street Northampton, MA 01063", 1));
        myMap.addBuilding(new House("Northrop House", "49 Elm Street Northampton, MA 01063", 5, true, true));
        myMap.addBuilding(new Cafe("Compass Cafe Neilson", "7 Neilson Drive Northampton, MA 01063", 1));
        myMap.addBuilding(new Library("Neilson Library", "7 Neilson Drive Northampton, MA 01063", 4));
        myMap.addBuilding(new Library("Hillyer Library", "20 Elm Street Northampton, MA 01063", 2));
        myMap.addBuilding(new House("Gillett House", "47 Elm Street Northampton, MA 01063", 5, true, true));
        myMap.addBuilding(new House("Tyler House", "49 Elm Street Northampton, MA 01063", 4, true, false));
        myMap.addBuilding(new Building("Seelye Hall", "155-199 Green Street Northampton, MA 01063", 4));
        myMap.addBuilding(new Building("Sage Hall", "144 Green Street Northampton, MA 01063", 3));
        myMap.addBuilding(new House("Park House", "134 Elm Street Northampton, MA 01063", 3, false, false));
        System.out.println(myMap);
    }
    
}
