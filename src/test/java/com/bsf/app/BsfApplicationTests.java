package com.bsf.app;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.bsf.app.controller.AccountController;
import com.bsf.app.controller.TransactionController;

@SpringBootTest
class BsfApplicationTests {

	@Autowired
	private AccountController accountController;

	@Autowired
	private TransactionController transactionController;

	@Test
	void contextLoads() {
		assertThat(accountController).isNotNull();
		assertThat(transactionController).isNotNull();
	}

}
