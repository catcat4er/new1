package com.home;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.CollectionCondition.containExactTextsCaseSensitive;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class TestTwo {

    @BeforeAll
    static void Size() {
        Configuration.browserSize = "1920x1040";
    }

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
        $("#uploadPicture").uploadFile(new File("src/test/resources/Penguins.jpg"));
        $("#currentAddress").setValue("address");
        $("#react-select-3-input").setValue("NCR").pressEnter();
        $("#react-select-4-input").setValue("Delhi").pressEnter();
        $("#submit").scrollTo().click();

        $$(".modal-content td").shouldHave(containExactTextsCaseSensitive("Name Surname", "mail@mail.ru",
                "Male", "8987654321", "22 June,1941", "Computer Science", "Reading", "Penguins.jpg",
                "address", "NCR Delhi"));

//        $(".table-responsive").shouldHave(        //much longer type
//                text("Name"),
//                text("Surname"),
//                text("mail@mail.ru"),
//                text("Male"),
//                text("8987654321"),
//                text("22 June,1941"),
//                text("Computer Science"),
//                text("Reading"),
//                text("Penguins.jpg"),
//                text("address"),
//                text("NCR Delhi"));

        Selenide.closeWebDriver();

    }
}
