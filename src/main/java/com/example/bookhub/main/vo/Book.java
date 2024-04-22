package com.example.bookhub.main.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book {
    private String title;
    private String author;
    private String pubDate;
    private String description;
    private String isbn;
    private int itemId;
    private int priceSales;
    private int priceStandard;
    private String cover;
    private String categoryId;
    private String categoryName;
    private String publisher;
    private int bestRank;

}
