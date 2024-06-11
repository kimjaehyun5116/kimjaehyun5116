package com.example.cookie.controller;

import com.example.cookie.model.UserDto;
import com.example.cookie.db.UserRepository;
import com.example.cookie.service.UserService;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/user")
public class UserApiController {

    private final UserRepository userRepository;

    @GetMapping("/me")
    public UserDto me(
            HttpServletRequest httpServletRequest,

            @CookieValue(name = "authorization-cookie", required = false)
                    String authorizationCookie
    ){
        log.info("authorizationCookie : {}", authorizationCookie);
        var optionalUserDto = userRepository.finById(authorizationCookie);
        return optionalUserDto.get();
        /*
        var cookies = httpServletRequest.getCookies();

        if(cookies != null){
            for(Cookie cookie : cookies){
                log.info("key : {}, value : {}", cookie.getName(), cookie.getValue());
            }
        }
*/
    }
    @GetMapping("/me2")
    public UserDto me2(
            @RequestHeader(name = "authorization", required = false)
            String authorizationHeader
    ) {
        log.info("authorizationHeader : {}", authorizationHeader);
        var optionalUserDto = userRepository.finById(authorizationHeader);
        return optionalUserDto.get();
    }
}
