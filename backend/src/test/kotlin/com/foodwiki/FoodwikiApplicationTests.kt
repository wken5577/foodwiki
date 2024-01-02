package com.foodwiki

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class FoodwikiApplicationTests {

	@Test
	@DisplayName("canary test should pass")
	fun contextLoads() {
		Assertions.assertThat(true).isTrue
	}
}
