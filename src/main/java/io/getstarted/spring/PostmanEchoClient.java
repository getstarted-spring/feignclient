package io.getstarted.spring;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "postman-echo")
public interface PostmanEchoClient {

  @GetMapping(path = "/get", consumes = "application/json")
  EchoGetResponse getEcho(@RequestParam("foo") String foo, @RequestParam("bar") String bar);

  @PostMapping(path = "/post", consumes = "application/json")
  EchoPostResponse postEcho(
      @RequestParam("foo") String foo,
      @RequestParam("bar") String bar,
      @RequestBody EchoPostRequest body);
}
