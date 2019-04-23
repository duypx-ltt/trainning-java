package com.example.demo.controller;

import com.example.demo.entity.UserProfile;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public String list(Model model) {
        model.addAttribute("user", userService.findAll());
        return "list";
    }

    @GetMapping("/user/add")
    public String add(Model model) {
        model.addAttribute("user", new UserProfile());
        return "form";
    }

    @GetMapping("/user/edit")
    public String edit(@RequestParam("id") Integer id, Model model) {
        model.addAttribute("user", userService.searchById(id));
        return "form";
    }

    @PostMapping("/user/save")
    public String save(UserProfile user) {
        java.sql.Date date = new java.sql.Date(System.currentTimeMillis());
        user.setCreate_at(date);
        user.setUpdate_at(date);
        user.setDelete_at(date);
        userService.save(user);
        return "redirect:/user";
    }

    @GetMapping("/user/search")
    public String search(@RequestParam("name") String name, Model model) {
        if (StringUtils.isEmpty(name))
            return "redirect:/user";

        model.addAttribute("user", userService.searchByName(name));
        return "list";
    }

    @GetMapping("/user/delete")
    public String delete(@RequestParam("id") Integer id, RedirectAttributes redirect) {
        userService.delete(id);
        redirect.addFlashAttribute("successMessage", "Deleted user successfully!");
        return "redirect:/user";
    }

}
