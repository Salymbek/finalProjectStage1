package service.Impl;

import model.Book;
import model.User;
import service.UserService;

import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

public class UserServiceImpl implements UserService {
    @Override
    public String createUser(List<User> users) {
        return null;
    }

    @Override
    public List<User> findAllUsers() {
        Scanner scanner = new Scanner(System.in);



        return null;
    }

    @Override
    public User findUserById(Long id, List<Book>books) {


        for (Book p:books) {
            if (p.getId().equals(id)) {
                System.out.println(p);


            }
        }
        return (User) books;
    }

    @Override
    public String removeUserByName(String name) {
        return null;
    }

    @Override
    public void updateUser(Long id) {

    }

    @Override
    public void groupUsersByGender() {

    }

    @Override
    public StringBuilder buyBooks(String name, List<Book> books, List<String> user) {

             BigDecimal d = new BigDecimal(10);
             int s = d.intValue();

            StringBuilder buy = new StringBuilder(">>>>>>>>>>>>> C H E C K <<<<<<<<<<<\n");
            int discount = 0;



            for (Book b : books) {
                int n = b.getPrice().intValue();
                for (int i = 0; i < books.size(); i++) {

                    if (b.getName().trim().toUpperCase().contains(user.get(i).trim().toUpperCase())){
                        buy.append(b.getName()).append("      ").append(b.getPrice()).append("\n");
                        discount += n;


                    }
                }
            }





            return buy.append("\n~BUYER: ").append(name).append("\nTHE COST OF ALL BOOKS: = ").append(discount).append(" SOM");



    }
}
