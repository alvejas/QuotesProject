package com.quotesDemo.Quotes;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document(collection = "quotes")
public class Quote {
    @MongoId
    private String _id;
    private String quoteText;
    private String quoteAuthor;

    private String quoteGenre;

    private int __v;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getQuoteText() {
        return quoteText;
    }

    public void setQuoteText(String quoteText) {
        this.quoteText = quoteText;
    }

    public String getQuoteAuthor() {
        return quoteAuthor;
    }

    public void setQuoteAuthor(String quoteAuthor) {
        this.quoteAuthor = quoteAuthor;
    }

    public String getQuoteGenre() {
        return quoteGenre;
    }

    public void setQuoteGenre(String quoteGenre) {
        this.quoteGenre = quoteGenre;
    }

    public int get__v() {
        return __v;
    }

    public void set__v(int __v) {
        this.__v = __v;
    }

    public Quote(String _id, String quoteText, String quoteAuthor, String quoteGenre, int __v) {
        this._id = _id;
        this.quoteText = quoteText;
        this.quoteAuthor = quoteAuthor;
        this.quoteGenre = quoteGenre;
        this.__v = __v;
    }







}
