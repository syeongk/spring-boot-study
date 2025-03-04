package test.studyspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import test.studyspring.domain.Test;

public interface TestRepository extends JpaRepository<Test, Long> {
}
