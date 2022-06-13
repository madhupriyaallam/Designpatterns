package DesignPatterns.Builder.Bexample2;

public class Website {
    public static void main(String[] args) {
        NewStudent student = new NewStudent.StudentBuilder("Madhu", "priya").addGender("M").addHasExperience(true).build();
        System.out.println(student);
    }
}
