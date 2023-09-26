package com.quotesDemo.Quotes;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import java.util.List;

public interface QuoteRepository extends MongoRepository<Quote , String> {


    @Query("{quoteAuthor : ?0}")
    List<Quote> getQuoteByAuthor(String author);
}
