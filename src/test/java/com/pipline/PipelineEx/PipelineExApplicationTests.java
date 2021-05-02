package com.pipline.PipelineEx;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PipelineExApplicationTests {

	TestController underTest = new TestController();

	@Test
	void contextLoads() {
		when(underTest.test()).thenReturn(anyString());
       Assertions.assertEquals(anyString(),underTest.test());
	}

}
