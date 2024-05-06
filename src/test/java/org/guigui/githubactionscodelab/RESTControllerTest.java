package org.guigui.githubactionscodelab;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class RESTControllerTest {
    @LocalServerPort
    private int port;
    @Test
    void sayHello() {
        String response = given()
                .baseUri("http://localhost")
                .port(port)
                .when()
                .get("/hello")
                .then()
                .assertThat()
                .extract()
                .response()
                .asString();
        assertThat(response).isEqualTo("hello");
    }
}