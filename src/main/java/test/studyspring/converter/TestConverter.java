package test.studyspring.converter;

import test.studyspring.domain.Test;
import test.studyspring.dto.TestResponse;

public class TestConverter {
    public static TestResponse toTestResponse(Test test){
        return TestResponse.builder()
                .id(test.getId())
                .name(test.getName())
                .build();
    }
}
