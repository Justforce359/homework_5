package com.justforce359;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class HomeworkDragAndDropTest {

    @Test
    void dragAndDropWithActionsTest() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        SelenideElement sourceA = $("#column-a");
        SelenideElement targetB = $("#column-b");
        actions().dragAndDrop(sourceA,targetB).build().perform();
        $("#column-a").shouldHave(text("B"));

    }

    @Test
    void dragAndDropTest() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        SelenideElement sourceA = $("#column-a");
        SelenideElement targetB = $("#column-b");
        $(sourceA).dragAndDropTo($(targetB));
        $("#column-a").shouldHave(text("B"));

    }
}
