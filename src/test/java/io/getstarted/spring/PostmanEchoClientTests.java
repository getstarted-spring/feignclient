package io.getstarted.spring;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class PostmanEchoClientTests {

  @Autowired private PostmanEchoClient client;

  @Test
  void getEcho() throws Exception {
    final EchoGetResponse response = client.getEcho("abc", "123");
    assertThat(response.getArgs().getFoo()).isEqualTo("abc");
    assertThat(response.getArgs().getBar()).isEqualTo("123");
  }

  @Test
  void postEcho() {
    final EchoPostRequest request = new EchoPostRequest();
    request.setMessage("xyz");

    final EchoPostResponse response = client.postEcho("abc", "123", request);

    assertThat(response.getArgs().getFoo()).isEqualTo("abc");
    assertThat(response.getArgs().getBar()).isEqualTo("123");
    assertThat(response.getData().getMessage()).isEqualTo("xyz");
  }
}
