/* This is a stub for the House class */

import java.util.ArrayList;

import javax.management.RuntimeErrorException;

public class House extends Building {
  private ArrayList<String> residents; // The <String> tells Java what kind of data we plan to store IN the ArrayList
  private boolean hasDiningRoom;
  boolean elevator;

  public House(String name, String address, int nFloors, boolean hasDiningRoom, boolean elevator) {
    super(name, address, nFloors);

    this.residents = new ArrayList<String>();
    this.hasDiningRoom = hasDiningRoom;
    this.elevator = elevator;

    if(hasDiningRoom == true){
      System.out.println("There is a dining room in the house");
    }
    else{
      System.out.println("there is no dining room in the house.");
    }
    System.out.println("You have built a house: 🏠");
  }

  /**
   * 
   * @return
   */
  public boolean hasDiningRoom(){
    return hasDiningRoom;
  }
  
  /**
   * 
   * @return
   */
  public int nResidents(){
    return residents.size();
  }

  /**
   * Add name into the residents arraylist
   * @param name
   */
  public void moveIn(String name){
    this.residents.add(name);
  }
  
  /**
   * return the name of the person who moved out
   * @param name The name of residents who are moving out
   * @return
   */
  public String moveOut(String name){
    if (this.residents.contains(name)) {
      this.residents.remove(name);
      return name;
    }
    else{
      return name + " isn't a resident in this house.";
    }

  }

  public boolean IsResident(String name){
    if (this.residents.contains(name)) {
      return true;
    }
    else{
      return false;
    }
  }

  public String toString(){
    return this.name + " is a " + this.nFloors + "-story resident house located at " + this.address;
  }

  public void showOptions() {
    System.out.println("Available options at " + this.name + 
                       ":\n + enter() \n + exit() \n + goUp() \n + goDown()\n + goToFloor(n) + \\n" + //
                       "hasdiningroom() \n + nResidents()  + moveIn(name) + moveOut(name) + IsResident(name)");
  }

  public void goToFloor(int floorNum) {
    if (this.activeFloor == -1) {
        throw new RuntimeException("You are not inside this Building. Must call enter() before navigating between floors.");
    }
    if (floorNum < 1 || floorNum > this.nFloors) {
        throw new RuntimeException("Invalid floor number. Valid range for this Building is 1-" + this.nFloors +".");
    }
    if (elevator) {
      System.out.println("You are now on floor #" + floorNum + " of " + this.name);
      this.activeFloor = floorNum;
    }
    else{
      if (floorNum > 1) {
        throw new RuntimeException("You cannot go to nonadjacent floor without an elevator.");
      }
    }
}

  public static void main(String[] args) {
    House newHouse = new House("Northrop House", "49 Elm Street", 5, false, true);
    System.out.println(newHouse.toString());
  }

}