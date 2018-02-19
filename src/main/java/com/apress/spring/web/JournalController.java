package com.apress.spring.web;

import com.apress.spring.repository.JournalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JournalController {

    @Autowired
    JournalRepository repo;

    @RequestMapping("/")
    public String index(Model model){
        //모델 객체 생성 "journal"이라는 이름으로 repo.findAll() 속성추가
        model.addAttribute("journal",repo.findAll());
        //repo.findAll은 JpaRepository 기본 메서드.
        //JpaRepository에는 findAll, save, flush,deleteVatch같은 상용메서드 10개정도 선언되있다.

        //마지막으로 index 추가해주면 스프링 MVC엔진은 템플릿 폴더에서 index.html 파일을 찾는다.
        return "index";
    }
}
