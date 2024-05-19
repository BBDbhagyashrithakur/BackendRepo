//package org.example.controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//@RestController
//public class HomeController {
//    @GetMapping("/")
//    public String test(){
//        return "Welcome To JobHub";
//    }
//    @GetMapping("/auth/code")
//    public String token(@RequestParam("code") String code) {
//        GithubTokenAuthentication githubTokenAuthentication = new GithubTokenAuthentication();
//        return githubTokenAuthentication.generateToken(code);
//    }
//}
//