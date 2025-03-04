package test.studyspring.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class TestResponse {
    private Long id;
    private String name;
}
