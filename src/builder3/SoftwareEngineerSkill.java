package builder3;

import java.util.*;
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
        this.employee = builder.employee;
        this.languages = builder.languages;
        this.experience = builder.experience;
        this.knowledge = builder.knowledge;
        this.enthusiasm = builder.enthusiasm;
        this.responsibility = builder.responsibility;
        this.workQuality = builder.workQuality;
        this.collaboration = builder.collaboration;
    }
    public static class SkillBuilder {
        private Employee employee;
        private ArrayList<Language> languages;
        private Experience experience;
        private Knowledge knowledge;
        private Enthusiasm enthusiasm;
        private Responsibility responsibility;
        private WorkQuality workQuality;
        private Collaboration collaboration;

        public SkillBuilder(Employee employee) {
            this.employee = employee;
        }
        public SkillBuilder addLanguage(Language language) {
            this.languages.add(language);
            return this;
        }
        public SkillBuilder addExperience(Experience experience) {
            this.experience = experience;
            return this;
        }
        public SkillBuilder addKnowledge(Knowledge knowledge) {
            this.knowledge = knowledge;
            return this;
        }
        public SkillBuilder addEnthusiasm(Enthusiasm enthusiasm) {
            this.enthusiasm = enthusiasm;
            return this;
        }
        public SkillBuilder addResponsibility(Responsibility responsibility) {
            this.responsibility = responsibility;
            return this;
        }
        public SkillBuilder addWorkQuality(WorkQuality workQuality) {
            this.workQuality = workQuality;
            return this;
        }
        public SkillBuilder addCollaboration(Collaboration collaboration) {
            this.collaboration = collaboration;
            return this;
        }
        public SoftwareEngineerSkill build() {
            return new SoftwareEngineerSkill(this);
        }
    }
}