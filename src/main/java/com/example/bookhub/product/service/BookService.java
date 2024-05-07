package com.example.bookhub.product.service;

import com.example.bookhub.product.dto.BookDto;
import com.example.bookhub.product.mapper.BookMapper;
import com.example.bookhub.product.vo.BookAuthor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookMapper bookMapper;

    public BookDto getBookDetailByNo(long bookNo){
        return bookMapper.getBookDetailByNo(bookNo);
    }

    public BookDto getBookByBookNo(long bookNo){
        return bookMapper.getBookByBookNo(bookNo);
    }

    public List<BookAuthor> getAuthorByBookNo(long bookNo) {
        return bookMapper.getAuthorByBookNo(bookNo);
    }
}
