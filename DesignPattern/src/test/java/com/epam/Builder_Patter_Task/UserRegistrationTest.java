package com.epam.Builder_Patter_Task;

public class UserRegistrationTest {
    public static void main(String[] args) {
        User user = new User.UserBuilder()
                .setFirstname("Prahallada")
                .setLastname("V")
                .setJobtitle("Automation Test Engineer")
                .setHighereducation("B.Tech")
                .setSex("Male")
                .setExperience(1)
                .setDate("15-May")
                .build();

        String expectedFirstname = "Prahallada";
        String expectedLastname = "V";
        String expectedJobtitle = "Automation Test Engineer";
        String expectedHighereducation = "B.Tech";
        String expectedSex = "Male";
        int expectedExperience = 1;
        String expectedDate = "15-May";

        if (user.getFirstname().equals(expectedFirstname) &&
                user.getLastname().equals(expectedLastname) &&
                user.getJobtitle().equals(expectedJobtitle) &&
                user.getHighereducation().equals(expectedHighereducation) &&
                user.getSex().equals(expectedSex) &&
                user.getExperience() == expectedExperience &&
                user.getDate().equals(expectedDate)) {
            System.out.println("Test case passed. User details are correct.");
        } else {
            System.out.println("Test failed! User details do not match expected values.");
        }
    }
}
