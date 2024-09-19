package com.huntercodexs.cucumberdemo;

public class BookService {

    private BookDTO fakeDAO() {
        BookDTO bookDTO = new BookDTO();
        bookDTO.setId(1);
        bookDTO.setName("Java Spring Boot");
        bookDTO.setCode("1234");
        return bookDTO;
    }

    public boolean findBook(String bookName) {
        BookDTO result = fakeDAO();
        return bookName.equals(result.getName());
    }

}
