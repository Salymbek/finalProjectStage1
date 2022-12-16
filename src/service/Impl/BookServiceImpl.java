package service.Impl;

import model.Book;
import service.BookService;

import java.time.Year;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class BookServiceImpl implements BookService {
    @Override
    public List<Book> createBooks(List<Book> books) {
        return null;
    }

    @Override
    public List<Book> getAllBooks(List<Book>books) {
        return books;
    }

    @Override
    public String getBooksByGenre(String genre, List<Book>books) {

        for (Book b : books) {
            if (genre.equals(b.getGenre().name())){
                System.out.println(b);
            }
        }



        return genre;
    }

    @Override
    public Book removeBookById(Long id) {

        return null;
    }

    @Override
    public List<Book> sortBooksByPriceInDescendingOrder(List<Book>books) {
        return books;
    }




    public static Comparator<Book> descending = new Comparator<Book>() {
        @Override
        public int compare(Book o1, Book o2) {
            return  o2.getPrice().compareTo(o1.getPrice()) ;
        }
    };



    @Override
    public List<Book> filterBooksByPublishedYear(List<Book>books) {
        for (Book b : books) {
            books.stream().filter(Year.now().minus(b.getPublishedYear().get()));
        }



        return null;
    }

    @Override
    public List<Book> getBookByInitialLetter() {
        Scanner scanner = new Scanner(System.in);
        return null;
    }

    @Override
    public Book maxPriceBook() {
        return null;
    }
}
