package test.studyspring.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import test.studyspring.dto.TestResponse;
import test.studyspring.service.TestService;

@RestController
@RequiredArgsConstructor
public class TestController {
    private final TestService testService;

    @GetMapping("/test")
    public TestResponse test(){
        return testService.test();
    }
}
