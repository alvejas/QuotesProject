package com.quotesDemo.Quotes;

import com.google.gson.Gson;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@WebMvcTest(QuoteController.class)
class QuotesApplicationTests {
	@Autowired
	private MockMvc mvc;

	@MockBean
	private QuoteService quoteService;

	Quote quote = new Quote("5eb17aadb69dc744b4e70d5c" ,"I'm not interested in age. People who tell me their age are silly. You're as old as you feel." , "Henri Frederic Amiel" ,  "age" , 0 );

	@Test
	void getByIdTest() throws Exception {
		RequestBuilder request = MockMvcRequestBuilders.get("http://localhost:8080/api/v1/quotes/id/5eb17aadb69dc744b4e70d5c");
		MvcResult result = mvc.perform(request).andReturn();
		assertEquals(result.getResponse().getStatus(), 200);
	}

	@Test
	void getByIdAuthor() throws Exception {
		RequestBuilder request = MockMvcRequestBuilders.get("http://localhost:8080/api/v1/quotes/author/Rabindranath Tagore");
		MvcResult result = mvc.perform(request).andReturn();
		assertEquals(result.getResponse().getStatus(), 200);
	}

	@Test
	void getAllQuotes() throws Exception {
		RequestBuilder request = MockMvcRequestBuilders.get("http://localhost:8080/api/v1/quotes");
		MvcResult result = mvc.perform(request).andReturn();
		assertEquals(result.getResponse().getStatus(), 200);
	}

}
