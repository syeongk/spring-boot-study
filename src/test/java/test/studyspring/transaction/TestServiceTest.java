package test.studyspring.transaction;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import test.studyspring.service.TestService;

@SpringBootTest
class TestServiceTest {

    @Autowired
    private TestService testService;

    @Test
    void test(){
        testService.test();
    }
}