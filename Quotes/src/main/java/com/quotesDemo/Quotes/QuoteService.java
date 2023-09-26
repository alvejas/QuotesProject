package com.quotesDemo.Quotes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import org.springframework.data.mongodb.core.MongoTemplate;
@Service
public class QuoteService {


    @Autowired
    MongoTemplate mongoTemplate;

    @Autowired
    private  QuoteRepository  quoteRepository;
    public QuoteService() {
    }

    public List<Quote> getAllQuotes(){
        return mongoTemplate.findAll(Quote.class);
    }

    public Quote getByIdentifier(String id){
        return mongoTemplate.findById(id, Quote.class );
    }

    public List<Quote> getByAuthor(String author){
        return quoteRepository.getQuoteByAuthor(author);
    }
}
