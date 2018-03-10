package com.apress.spring.web;

import com.apress.spring.domain.Journal;
import com.apress.spring.repository.JournalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.awt.*;
import java.util.List;
import java.util.Optional;

@Controller
public class JournalController {

    @Autowired
    JournalRepository repo;

    @RequestMapping("/")
    public String index(Model model){
        //testbranch pull request test
        //testbranch pull request test
        //testbranch pull request test
        //testbranch pull request test
        //testbranch pull request test
        //testbranch pull request test
        //testbranch pull request test
        //testbranch pull request test
        //testbranch pull request test
        //testbranch pull request test
        //testbranch pull request test
        //testbranch pull request test
        //testbranch pull request test
        //testbranch pull request test


        //모델 객체 생성 "journal"이라는 이름으로 repo.findAll() 속성추가
        //repo.findAll은 JpaRepository 기본 메서드.
        //JpaRepository에는 findAll, save, flush,deleteVatch같은 상용메서드 10개정도 선언되있다.
        model.addAttribute("journal",repo.findAll());

        //마지막으로 index 추가해주면 스프링 MVC엔진은 템플릿 폴더에서 index.html 파일을 찾는다.
        return "index";
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello(@RequestParam Optional<String> name) {
        //@RequestParam (required = false ) 반드시 들어와야하는지
        //@Responsebody , Controller 합친것 문자열 제이슨 리턴

        return name.orElse("guest ") + " hello!";
    }

    @RequestMapping(value="/journal", produces = { MediaType.APPLICATION_JSON_VALUE } )
    public @ResponseBody List<Journal> getJournal() {
        return repo.findAll();
    }
}
