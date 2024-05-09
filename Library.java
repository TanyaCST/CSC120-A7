/* This is a stub for the Library class */

import java.util.*;

public class Library extends Building {
  
  private Hashtable<String, Boolean> collection;

  /**
   * constructor
   * overloading constructor: create a library without name and address
   */
  public Library(){
    this.collection = new Hashtable<String, Boolean>();
    System.out.println("You have built a library: 📖");
  }

  /**
   * Constructor: Create a library
   * @param name: the name of library
   * @param address: library's address
   * @param nFloors: number of floors this library has
   */  
  public Library(String name, String address, int nFloors) {
      super(name, address, nFloors);
      this.collection = new Hashtable<String, Boolean>();
      System.out.println("You have built a library: 📖");
    }
  
    /**
     * To put a book into the library collection
     * @param title: title of the book put into the library
     */
    public void addTitle(String title){
      this.collection.put(title, true);
    }

    /**
     * To put a list of book into the library collection
     * @param titleList: a list of titles of books put into the library
     */
    public void addTitle(ArrayList<String> titleList){
      for(int i = 0; i < titleList.size(); i++){
        String title = titleList.get(i);
        this.collection.put(title, true);
      }
    }

    /**
     * To remove a book from the library collection
     * @param title a string variable representing the title of book
     * @return the title of the book removed
     */
    public String removeTitle(String title){
      if (collection.keySet().contains(title)){
        this.collection.remove(title);
        return title;
      }
      else{
        //return title + "is not found in the library";
        throw new NullPointerException();
      }
    }

    /**
     * To check out a book when it is borrowed by someone
     * @param title a string variable representing the title of book
     */
    
    public void checkOut(String title){
      if (this.collection.keySet().contains(title)){
        if(this.collection.get(title)){
          this.collection.replace(title, false);
        }
        else{
          throw new RuntimeException("Sorry. " + title + " is borrowed.");
        }
      }
      else{
        throw new RuntimeException("Sorry. " + title + " is not added to the library.");
      }
    }
    
    /**
     * To check in a book when someone returns it back
     * @param title a string variable representing the title of book
     */
    public void returnBook(String title){
      if (this.collection.keySet().contains(title)){
        if(this.collection.get(title) == false){
          this.collection.replace(title, true);
        }
        else{
          throw new RuntimeException("Sorry. " + title + " is already returned. Are you sure you borrowed it from our library?");
        }
      }
      else{
        throw new RuntimeException("Sorry. " + title + " is not implemented to our library.");
      }
    }

    /**
     * Check whether the collection contains certain book
     * @param title a string variable representing the title of book
     * @return
     */
    public boolean containsTitle(String title){
      return this.collection.keySet().contains(title);
    } 

    /**
     * Check whether the book is available in the collection
     * @param title a string variable representing the title of book
     * @return
     */
    public boolean isAvailable(String title){
      if (!containsTitle(title)) {
        throw new NullPointerException();
      }
      return this.collection.get(title);
    }

     /**
     * Print out the entire collection with check out status
     */
    public void printCollection(){
      Set<String> titles = collection.keySet();
      for (String key: titles){
        System.out.println(key + " " + collection.get(key));
      }
    } 

    /**
     * Go to floors that are not adjacent
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
     * show options in both Building class and Library class
     */
    public void showOptions() {
      super.showOptions();
      System.out.println("\n + addTitle() \n + removeTitle() \n + checkOut() \n + returnBook()\n + containsTitle()\n + isAvailable()\n + printCollection()\n + goToFloor(n)");
    }

    /**
     * Main methods
     * @param args
     */
    public static void main(String[] args) {
      Library mybibli = new Library("Fake Library", "123 Ghost Street", 100);
      mybibli.collection.put("A Story", true);
      mybibli.collection.put("Emily's Secret Diary", true);
      mybibli.checkOut("A Story");
      mybibli.returnBook("A Story");
      System.out.println(mybibli.removeTitle("A Story"));
      mybibli.containsTitle("Emily's Secret Diary");
      mybibli.isAvailable("Emily's Secret Diary");
      mybibli.printCollection();
      
      
      
    }
  
  }