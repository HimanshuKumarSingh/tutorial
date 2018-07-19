package com.marlabs.himanshu.basic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {
	@GetMapping("/book")
    public List<Book> getAllBooks()
    {
		return Arrays.asList(new Book(1l,"jungle book","dont know"));
    }

}
