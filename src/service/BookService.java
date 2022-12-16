package service;

import model.Book;

import java.util.List;

public interface BookService {

    List <Book>  createBooks(List<Book>books);

    List<Book> getAllBooks(List<Book>books);

    String getBooksByGenre(String genre, List<Book>books);

    Book removeBookById(Long id);

    List<Book> sortBooksByPriceInDescendingOrder(List<Book>books);

    List<Book> filterBooksByPublishedYear(List<Book>books);// Konsolgo akyrky 10 jilda chygarylgan kitepter chyksyn

    List<Book> getBookByInitialLetter();

    Book maxPriceBook();

}
