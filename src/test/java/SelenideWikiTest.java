import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import org.junit.jupiter.api.Test;


public class SelenideWikiTest {

    @BeforeAll
    static void beforeAll(){
        Configuration.browserSize="1920x1080";
        Configuration.baseUrl = "https://github.com";
    }
    @Test
    void selenideTest() {
        open("/selenide/selenide");
        $("#wiki-tab").click();
        $(".wiki-more-pages-link button").click();
        $(byText("Soft assertions")).click();
        $ ("#user-content-3-using-junit5-extend-test-class").parent().shouldHave(text("Unit5 extend test"));


    }



}
