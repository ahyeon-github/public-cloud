package com.example.publiccloud;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test") // 테스트 프로파일 활성화
public class PublicCloudApplicationTests {
    @Test
    void contextLoads() {
    }
}
