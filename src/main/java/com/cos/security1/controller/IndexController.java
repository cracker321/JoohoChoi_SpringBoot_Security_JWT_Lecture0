package com.cos.security1.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //'뷰'를 리턴
public class IndexController {



    //---------------------------------------------------------------------------------------


    //============================================================================================



    @GetMapping({"", "/"})
    public String index(){


        return "index"; //'뷰 index.html'로 넘어감.
    }

    //============================================================================================

    //[ '스프링부트 시큐리티 2강 - 시큐리티 설정'강 00:00~ ]



    @GetMapping("/user")
    public String user(){

        return "user";
    }

    //============================================================================================


    @GetMapping("/admin")
    public String admin(){

        return "admin";
    }

    //============================================================================================


    @GetMapping("/manager")
    public String manager(){

        return "manager";
    }


    //============================================================================================


    @GetMapping("/login")
    public String login(){

        return "login";
    }


    //============================================================================================


    @GetMapping("/join")
    public String join(){

        return "join";
    }


    //============================================================================================

    @GetMapping("/joinProc")
    public @ResponseBody String joinProc(){

        return "회원가입 완료됨!";
    }



    //============================================================================================



}
