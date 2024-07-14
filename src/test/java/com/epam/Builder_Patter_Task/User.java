package com.epam.Builder_Patter_Task;

public class User {
    private String firstname;
    private String lastname;
    private String jobtitle;
    private String highereducation;
    private String sex;
    private int experience;
    private String date;

    public User(String firstname, String lastname, String jobtitle, String highereducation, String sex, int experience, String date) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.jobtitle = jobtitle;
        this.highereducation = highereducation;
        this.sex = sex;
        this.experience = experience;
        this.date = date;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getJobtitle() {
        return jobtitle;
    }

    public String getHighereducation() {
        return highereducation;
    }

    public String getSex() {
        return sex;
    }

    public int getExperience() {
        return experience;
    }

    public String getDate() {
        return date;
    }

    public static class UserBuilder {
        private String firstname;
        private String lastname;
        private String jobtitle;
        private String highereducation;
        private String sex;
        private int experience;
        private String date;

        public UserBuilder setFirstname(String firstname) {
            this.firstname = firstname;
            return this;
        }

        public UserBuilder setLastname(String lastname) {
            this.lastname = lastname;
            return this;
        }

        public UserBuilder setJobtitle(String jobtitle) {
            this.jobtitle = jobtitle;
            return this;
        }

        public UserBuilder setHighereducation(String highereducation) {
            this.highereducation = highereducation;
            return this;
        }

        public UserBuilder setSex(String sex) {
            this.sex = sex;
            return this;
        }

        public UserBuilder setExperience(int experience) {
            this.experience = experience;
            return this;
        }

        public UserBuilder setDate(String date) {
            this.date = date;
            return this;
        }

        public User build() {
            return new User(firstname, lastname, jobtitle, highereducation, sex, experience, date);
        }
    }

}
