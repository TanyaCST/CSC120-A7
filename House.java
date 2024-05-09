/* This is a stub for the House class */

import java.util.ArrayList;

public class House extends Building {
  private ArrayList<String> residents; // The <String> tells Java what kind of data we plan to store IN the ArrayList
  private boolean hasDiningRoom;
  boolean elevator;

  /**
   * 
   * @param hasDiningRoom
   * @param elevator
   */
  public House(boolean hasDiningRoom, boolean elevator){
    
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
   * Constructor
   * @param name
   * @param address
   * @param nFloors
   * @param hasDiningRoom
   * @param elevator
   */
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
   * T/F whether the house has dining room
   * @return boolean: whether the house has Dining rooms
   */
  public boolean hasDiningRoom(){
    return hasDiningRoom;
  }
  
  /**
   * tell how many residents are there in this house
   * @return number of residents in this house
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
   * Add a list of name into residents array list
   * @param residentName
   */
  public void moveIn(ArrayList<String> residentName){
    for(int i = 0; i < residentName.size(); i++){
      String name = residentName.get(i);
      this.residents.add(name);
    }
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

  /**
   * T/F check whether this resident lives in this house
   * @param name resident name
   * @return T/F 
   */
  public boolean isResident(String name){
    return this.residents.contains(name);
  }

  /**
   * an introduction to this house
   */
  public String toString(){
    return this.name + " is a " + this.nFloors + "-story resident house located at " + this.address;
  }

  /**
   * To help users to go to certain floor if that floor is vaild
   */
  public void goToFloor(int floorNum) {
    if (this.activeFloor == -1) {
        throw new RuntimeException("You are not inside this Building. Must call enter() before navigating between floors.");
    }
    if (floorNum < 1 || floorNum > this.nFloors) {
        throw new RuntimeException("Invalid floor number. Valid range for this Building is 1-" + this.nFloors +".");
    }
    System.out.println("You are now on floor #" + floorNum + " of " + this.name);
    this.activeFloor = floorNum;
  }

  /**
   * show methods available in house class
   */
  public void showOptions() {
    super.showOptions();
    System.out.println("\n + hasDiningRoom()\n + nResidents()\n + moveIn()\n + moveOut()\n + isResident()\n + toString()\n + goToFloor()");
  }

  public static void main(String[] args) {
    House newHouse = new House("Northrop House", "49 Elm Street", 5, false, true);
    System.out.println(newHouse.toString());
  }

}