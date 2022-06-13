package DesignPatterns.Builder.Bexample2;

public class NewStudent {
    private StudentBuilder builder;
    private String firstName;
    private String lastName;
    private String gender;//opt
    private boolean isGraduate;//opt
    private boolean hasExperience;//opt
    private String city;//opt
    private String state;//opt
    private NewStudent(StudentBuilder builder) {
        this.builder = builder;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.gender = builder.gender;
        this.isGraduate = builder.isGraduate;
        this.hasExperience = builder.hasExperience;
        this.city = builder.city;
        this.state = builder.state;
    }
    @Override
    public String toString() {
        return " firstName=" + firstName + "\n lastName=" + lastName + "\n gender=" + gender
                + "\n isGraduate=" + isGraduate + "\n hasExperience=" + hasExperience + "\n city=" + city + "\n state="
                + state ;
    }
    public static class StudentBuilder {
        private String firstName;
        private String lastName;
        private String gender;
        private boolean isGraduate;
        private boolean hasExperience;
        private String city;
        private String state;
        public StudentBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
        public StudentBuilder addGender(String gender) {
            this.gender = gender;
            return this;
        }
        public StudentBuilder addisGraduate(boolean isGraduate) {
            this.isGraduate = isGraduate;
            return this;
        }
        public StudentBuilder addHasExperience(boolean hasExperience) {
            this.hasExperience = hasExperience;
            return this;
        }
        public StudentBuilder addCity(String city) {
            this.city = city;
            return this;
        }
        public StudentBuilder addState(String state) {
            this.state = state;
            return this;
        }
        public NewStudent build() {
            return new NewStudent(this);
        }
    }
}
