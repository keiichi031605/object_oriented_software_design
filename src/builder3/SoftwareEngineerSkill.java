package builder3;

public class SoftwareEngineerSkill {
    private Employee employee;
    private ArrayList<Language> languages;
    private Experience experience;
    private Knowledge knowledge;
    private Enthusiasm enthusiasm;
    private Responsibility responsibility;
    private WorkQuality workQuality;
    private Collaboration collaboration;

    private SoftwareEngineerSkill(SkillBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.gender = builder.gender;
        this.isGraduate = builder.isGraduate;
        this.hasExperience = builder.hasExperience;
        this.city = builder.city;
        this.state = builder.state;
        this.isEarning = builder.isEarning;
    }

    // @Override
    // public String toString() {
    //     return " firstName=" + firstName + "\n lastName=" + lastName + "\n age=" + age + "\n gender=" + gender
    //             + "\n isGraduate=" + isGraduate + "\n hasExperience=" + hasExperience + "\n city=" + city + "\n state="
    //             + state + "\n isEarning=" + isEarning;
    // }

    public static class SkillBuilder {

        private String firstName;
        private String lastName;
        private String age;
        private String gender;
        private boolean isGraduate;
        private boolean hasExperience;
        private String city;
        private String state;
        private boolean isEarning;

        public SkillBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public SkillBuilder addAge(String age) {
            this.age = age;
            return this;
        }

        public SkillBuilder addGender(String gender) {
            this.gender = gender;
            return this;
        }

        public SkillBuilder addisGraduate(boolean isGraduate) {
            this.isGraduate = isGraduate;
            return this;
        }

        public SkillBuilder addHasExperience(boolean hasExperience) {
            this.hasExperience = hasExperience;
            return this;
        }

        public SkillBuilder addCity(String city) {
            this.city = city;
            return this;
        }

        public SkillBuilder addState(String state) {
            this.state = state;
            return this;
        }

        public SkillBuilder addIsEarning(boolean isEarning) {
            this.isEarning = isEarning;
            return this;
        }

        public SoftwareEngineerSkill build() {
            return new SoftwareEngineerSkill(this);
        }

    }
}