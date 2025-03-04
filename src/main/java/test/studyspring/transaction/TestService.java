package test.studyspring.transaction;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TestService {
    private final TestRepository testRepository;

    @Transactional
    public void test(){
        // 테스트 엔티티 생성
        Test test1 = Test.builder()
                .name("테스트1")
                .build();
        testRepository.save(test1);

        // ID 2인 엔티티 조회
        Test test2 = testRepository.findById(2L)
                    .orElseThrow();
    }
}
