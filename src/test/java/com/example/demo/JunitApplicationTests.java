package com.example.demo;

import com.example.demo.controller.Home;
import com.example.demo.service.WelcomeService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.when;

@SpringBootTest
class JunitApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testGreet() {
		// mocking the service layer
		WelcomeService welcomeService = Mockito.mock(WelcomeService.class);
		when(welcomeService.getWelcomeMessage("John")).thenReturn("Welcome John!");

		Home home = new Home(welcomeService);
		assertThat(home.greet("John")).isEqualTo("Welcome John!");
	}

}
