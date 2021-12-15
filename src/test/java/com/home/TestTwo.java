package com.home;

import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestTwo {
    @Test
    void textBox() {
        open("https://demoqa.com/automation-practice-form");

        $("#firstName").setValue("Name");
        $("#lastName").setValue("Surname");
        $("#userEmail").setValue("mail@mail.ru");
        $("#genterWrapper").$(byText("Male")).click();
        $("#userNumber").setValue("89876543210");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("June");
        $(".react-datepicker__year-select").selectOption("1941");
        $(".react-datepicker__day--022").click();
        $("#subjectsInput").setValue("Computer Science").pressEnter();
        $("#hobbiesWrapper").$(byText("Reading")).click();
        $("#uploadPicture").uploadFile(new File("src/test/java/com/home/Penguins.jpg"));
        $("#currentAddress").setValue("address");
        $("#react-select-3-input").setValue("NCR").pressEnter();
        $("#react-select-4-input").setValue("Delhi").pressEnter();
        $("#submit").scrollTo().click();
        $("#closeLargeModal").click();
    }
}
