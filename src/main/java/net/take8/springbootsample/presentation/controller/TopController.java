package net.take8.springbootsample.presentation.controller;

import net.take8.springbootsample.application.service.UserService;
import net.take8.springbootsample.domain.model.user.UserSummaries;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
class TopController {
    UserService userService;

    @ModelAttribute("users")
    UserSummaries users() {
        return userService.list();
    }

    @GetMapping
    String show() {
        return "top";
    }

    TopController(UserService userService) {
        this.userService = userService;
    }
}
