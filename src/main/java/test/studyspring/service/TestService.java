package test.studyspring.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import test.studyspring.domain.Test;
import test.studyspring.dto.TestResponse;
import test.studyspring.repository.TestRepository;

import static test.studyspring.converter.TestConverter.toTestResponse;

@Service
@RequiredArgsConstructor
public class TestService {
    private final TestRepository testRepository;

    @Transactional
    public TestResponse test(){
        // 테스트 엔티티 생성
        Test test1 = Test.builder()
                .name("테스트1")
                .build();
        testRepository.save(test1);

        // ID 2인 엔티티 조회
        Test test2 = testRepository.findById(1L)
                    .orElseThrow();

        return toTestResponse(test1);
    }
}
