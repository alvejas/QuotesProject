package com.quotesDemo.Quotes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/quotes")
public class QuoteController {
    @Autowired
    private final QuoteService quoteService;

    public QuoteController(QuoteService quoteService) {
        this.quoteService = quoteService;
    }


    @GetMapping()
    public List<Quote> fetchAllQuotes(){
        return quoteService.getAllQuotes();
    }

    @GetMapping("/id/{id}")
    public Quote fetchQuotesById(@PathVariable("id") String id){
        return quoteService.getByIdentifier(id);
    }

    @GetMapping("/author/{author}")
    public List<Quote> fetchQuotesByAuthor(@PathVariable("author") String author){
        return quoteService.getByAuthor(author);
    }

}
