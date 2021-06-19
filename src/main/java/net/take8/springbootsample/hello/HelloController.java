package net.take8.springbootsample.hello;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class HelloController {
  @RequestMapping("/")
  @ResponseBody
  public String index() {
    return "Hello world";
  }
}
