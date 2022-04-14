package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller // Đánh dấu class là một controller
public class GreetingController {
    @GetMapping("/greeting") // Đánh dấu method dùng để xử lý request GET gửi đến this pa.
    public String greeting(@RequestParam String name, Model model) {
        // @RequestParam đánh dấu tham số được truyền vào
        model.addAttribute("name", name); // method để truyền dữ liệu từ controller sang view
        return "index";
    }
}
