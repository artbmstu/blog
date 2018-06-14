package ru.artbmstu.blogvulk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
public class BlogvulkApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogvulkApplication.class, args);
    }

    @RequestMapping("/hello")
    public String showHelloWorld(){
        return "hello-world";
    }
}
