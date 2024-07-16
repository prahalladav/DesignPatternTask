package com.epam.Builder_Patter_Task;

public class User {
    private final String firstName;
    private final String lastName;
    private final String jobTitle;
    private final String educationLevel;
    private final String sex;
    private final String yearsOfExperience;
    private final String dateOfBirth;

    private User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.jobTitle = builder.jobTitle;
        this.educationLevel = builder.educationLevel;
        this.sex = builder.sex;
        this.yearsOfExperience = builder.yearsOfExperience;
        this.dateOfBirth = builder.dateOfBirth;
    }

    public static class UserBuilder {
        private final String firstName;
        private final String lastName;
        private String jobTitle;
        private String educationLevel;
        private String sex;
        private String yearsOfExperience;
        private String dateOfBirth;

        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public UserBuilder jobTitle(String jobTitle) {
            this.jobTitle = jobTitle;
            return this;
        }

        public UserBuilder educationLevel(String educationLevel) {
            this.educationLevel = educationLevel;
            return this;
        }

        public UserBuilder sex(String sex) {
            this.sex = sex;
            return this;
        }

        public UserBuilder yearsOfExperience(String yearsOfExperience) {
            this.yearsOfExperience = yearsOfExperience;
            return this;
        }

        public UserBuilder dateOfBirth(String dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

    // Getters for fields
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getJobTitle() { return jobTitle; }
    public String getEducationLevel() { return educationLevel; }
    public String getSex() { return sex; }
    public String getYearsOfExperience() { return yearsOfExperience; }
    public String getDateOfBirth() { return dateOfBirth; }
}
