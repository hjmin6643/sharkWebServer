package com.nexmore.calltaxi;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;


@Controller
public class MainController {

    @GetMapping(value = {"/", "/main"})
    public String index(HttpServletRequest req, Model model) {
        model.addAttribute("title", "main");
        return "index";
    }

    @GetMapping("/login")
    public String login(HttpServletRequest req, Model model) {
        model.addAttribute("title", "로그인");
        return "login";
    }

    @GetMapping("/register_text")
    public String register(HttpServletRequest req, Model model) {
        model.addAttribute("title", "회원가입");
        return "register";
    }

    @GetMapping("/register_prev")
    public String prev_register(HttpServletRequest req, Model model) {
        model.addAttribute("title", "회원가입");
        return "prev_register";
    }


    @GetMapping("/register_authentication")
    public String authentication(HttpServletRequest req, Model model) {
        model.addAttribute("title", "회원가입");
        return "authentication";
    }

    @GetMapping("/register_complete")
    public String registerComplete(HttpServletRequest req, Model model) {
        model.addAttribute("title", "회원가입");
        return "register_complete";
    }
    @GetMapping("/change_password")
    public String change_password(HttpServletRequest req, Model model) {
        model.addAttribute("title", "비밀번호 변경");
        return "change_password";
    }

    @GetMapping("/notice_list")
    public String notice_list(HttpServletRequest req, Model model) {
        model.addAttribute("title", "공지사항");
        return "notice_list";
    }

    @GetMapping("/notice_insert")
    public String notice_insert(HttpServletRequest req, Model model) {
        model.addAttribute("title", "공지사항 추가");
        return "notice_insert";
    }

    @GetMapping("/register_normal")
    public String register_normal(HttpServletRequest req, Model model) {
        model.addAttribute("title", "회원가입");
        return "register_normal";
    }

    @GetMapping("/find_id")
    public String find_id(HttpServletRequest req, Model model) {
        model.addAttribute("title", "아이디 찾기");
        return "find_id";
    }
    @GetMapping("/info_change")
    public String info_change(HttpServletRequest req, Model model) {
        model.addAttribute("title", "회원 정보 수정");
        return "info_change";
    }
    @GetMapping("/phone_change")
    public String phone_change(HttpServletRequest req, Model model) {
        model.addAttribute("title", "회원 정보 수정");
        return "phone_change";
    }
    @GetMapping("/inquire_insert")
    public String inquire_insert(HttpServletRequest req, Model model) {
        model.addAttribute("title", "1:1문의");
        return "inquire";
    }

    @GetMapping("/inquire_list")
    public String inquire_list(HttpServletRequest req, Model model) {
        model.addAttribute("title", "1:1문의");
        return "inquire_list";
    }
    @GetMapping("find_id_complete")
    public String find_id_complete(HttpServletRequest req, Model model) {
        model.addAttribute("title", "아이디 찾기");
        return "find_id_complete";
    }
    @GetMapping("find_pw")
    public String find_pw(HttpServletRequest req, Model model) {
        model.addAttribute("title", "비밀번호 찾기");
        return "find_pw";
    }
    @GetMapping("find_pw_complete")
    public String find_pw_complete(HttpServletRequest req, Model model) {
        model.addAttribute("title", "비밀번호 찾기");
        return "find_pw_complete";
    }
    @GetMapping("register_driver2")
    public String register_driver2(HttpServletRequest req, Model model) {
        model.addAttribute("title", "회원가입_기사");
        return "register_driver2";
    }
    @GetMapping("register_driver")
    public String register_driver(HttpServletRequest req, Model model) {
        model.addAttribute("title", "회원가입_기사");
        return "register_driver";
    }
    @GetMapping("register_authentication_driver")
    public String register_authentication_driver(HttpServletRequest req, Model model) {
        model.addAttribute("title", "회원가입_기사");
        return "register_authentication_driver";
    }
    @ResponseBody
    @PostMapping("find_pw_change")
    public String find_pw_change(HttpServletRequest req, Model model, @RequestParam String pw) {
        System.out.println(pw);
        return "find_pw_complete";
    }
}
