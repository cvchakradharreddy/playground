package com.cv.playground;

import static org.junit.Assert.assertTrue;

import org.json.JSONException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = PlaygroundApplication.class)
public class PlaygroundApplicationTests {

	TestRestTemplate restTemplate = new TestRestTemplate();

	HttpHeaders headers = new HttpHeaders();


	@Test
	public void testRetrieveProducts() {

		HttpEntity<String> entity = new HttpEntity<String>(null, headers);

		ResponseEntity<String> response = restTemplate.exchange(
				createURLWithPort("/products"),
				HttpMethod.GET, entity, String.class);

			assertTrue(200 == response.getStatusCodeValue());	
	}
	
	@Test
	public void testRetrieveProduct() {

		HttpEntity<String> entity = new HttpEntity<String>(null, headers);

		ResponseEntity<String> response = restTemplate.exchange(
				createURLWithPort("/products/5c5dac7d1c9d4400003d9eb9"),
				HttpMethod.GET, entity, String.class);

			assertTrue(200 == response.getStatusCodeValue());	
	}


	private String createURLWithPort(String uri) {
		return "http://localhost:8080/playground"+ uri;
	}

}

