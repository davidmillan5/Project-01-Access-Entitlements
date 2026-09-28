package co.fintech.entitlements.api;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.client.RestTestClient;
import org.springframework.web.context.WebApplicationContext;

@SpringBootTest(classes = TestConfig.class)
class ApiRestTest {

    @Autowired
    private WebApplicationContext context;

    private RestTestClient client;

    @BeforeEach
    void setup() {
        client = RestTestClient.bindToApplicationContext(context).build();
    }

    @Test
    void shouldReturnValueFromUseCaseVersion1() {
        client.get()
                .uri("/api/usecase/path")
                .accept(MediaType.APPLICATION_JSON)
                .exchange()
                .expectStatus().isOk()
                .expectHeader().contentType(MediaType.APPLICATION_JSON)
                .expectBody(String.class)
                .isEqualTo("Value from use case v1");
    }


    @Test
    void shouldReturnNotFoundForInvalidPath() {
        client.get()
                .uri("/api/usecase/invalid")
                .accept(MediaType.APPLICATION_JSON)
                .exchange()
                .expectStatus().isNotFound();
    }
}
