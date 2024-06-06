package com.example.rest_api.controller;

import com.example.rest_api.model.BookQueryParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api")
public class RestApiController {

    @GetMapping(path = "/hello")
    public String hello(){
        var html = "<html><body><h1>Hello Spring Boot!!!</h1></body></html>";
        return html;
    }

    // http://localhost:8080/api/echo/{message}

    @GetMapping(path = "/echo/{message}/age/{age}/is-man/{isMan}")
    public String echo(
            @PathVariable (name = "message") String msg,
            @PathVariable int age,
            // integer 는 null값이 할당될수있어서 주소에는 쓰지 않는다.
            // int는 디폴트값이 0이다
            @PathVariable Boolean isMan
            ){
        System.out.println("echo message : " + msg);
        System.out.println("echo age : " + age);
        System.out.println("echo isMan : " + isMan);

        // TODO 대문자로 변환해서 RETURN 받기 => toUpperCase

        // String 타입의 변수 외에 다른 타입 받아보기

        // boolean, integer

        return msg.toUpperCase();
    }

    // http://localhost:8080/api/echo/{message}/age/{age}/is-man/{isMan}
    // http://localhost:8080/api/echo/steve/age/20/is-man/true

    // http://localhost:8080/book?category=IT&issuedYear=2023&issued-month=01&issued_day=31
    @GetMapping(path = "/book")
    public void queryParam(
            @RequestParam String category,
            @RequestParam String issuedYear,
            @RequestParam(name = "issued-month") String issuedMonth,
            // @RequestParam String issued_day // _ 형식은 추천하지않는다
            @RequestParam(name = "issued_day") String issuedDay
            ){
        System.out.println(category);
        System.out.println(issuedYear);
        System.out.println(issuedMonth);
        // System.out.println(issued_day);
        System.out.println(issuedDay);
    }
    // http://localhost:8080/api/book2?category=IT&issuedYear=2023&issuedMonth=01&issuedDay=31
    @GetMapping(path = "/book2")
    public void queryParamDto(
           BookQueryParam bookQueryParam
    ){
        System.out.println(bookQueryParam);
    }


    // TODO Parameter 2가지 받습니다. int 형태로 받아서 두 수의 덧셈, 곱셈
    // TODO String 타입 boolean 타입도 받아보기
    @GetMapping(path ="/calculate")
    public String calculate(
            @RequestParam int num1,
            @RequestParam int num2
    ){
        int sum = num1+num2;
        int product = num1*num2;
        return "Sum : " + sum + ", Product : " + product;
    }
@GetMapping(path = "/process")
    public String process(
            @RequestParam String text,
            @RequestParam boolean flag
){
        return "Received text : " + text + ", Received flag : " + flag;
}
@DeleteMapping(path = {
        "/user/{userName}/delete",
        "/user/{userName}/del"
    }
) // path 를 사용안해도 같지만 path 를 사용하면 여러개의 주소를 지정할 수 도있음
public void delete(
        @PathVariable String userName
){
    log.info("user-naem : {}", userName);
}
}
