package DesignPatterns.Prototype;

public class Client {
    public static void main(String[] args) {
        try {
            Movie originalObject = new Movie();
            originalObject.getData();
            System.out.println("originalObject: "+originalObject);
            Movie clonedObject = originalObject.clone();
            clonedObject.getRatings().add(("MetaCritic:71%"));
            clonedObject.getGenre().add("Superhero");
            System.out.println("\nclonedObject: "+clonedObject);
            System.out.println("\noriginalObject: "+originalObject);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
