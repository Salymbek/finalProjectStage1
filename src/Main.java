import enums.Gender;
import enums.Genre;
import enums.Language;
import model.Book;
import model.User;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Бардык Id лер уникальный болуш керек. Эгер уникальный болбосо озубуз тузгон UniqueConstraintException класс ыргытсын.
        // User дин email адресси уникальный болуш керек жана @ болуусу керек. Эгер уникальный болбосо UniqueConstraintException класс,
        // @ болбосо озубуз тузгон BadRequestException класс ыргытсын.
        // User дин телефон номери +996 дан башталып 13 символдон турсун. Болбосо BadRequestException класс ыргытсын.
        // Китептин баасы терс сан болбошу керек. Болбосо NegativeNumberException ыргытсын.
        // Китептин чыккан жылы келечек убакыт болбошу керек.Болбосо DateTimeException ыргытсын.
        // Китептин автору бош болбошу керек. Болбосо EmptyStackException ыргытсын.


        List<Book>books = new LinkedList<>();
        books.add(new Book("Ak kuu", Genre.ROMANCE, BigDecimal.valueOf(400),"Alykul Osvonov", Language.KYRGYZ, LocalDate.of(1996, 8, 12)));
        books.add(new Book("Ak keme", Genre.FANTASY, BigDecimal.valueOf(500),"Chyngyz Aitmatov", Language.KYRGYZ, LocalDate.of(1996, 7, 12)));
        books.add(new Book("Voina i mir", Genre.ROMANCE, BigDecimal.valueOf(400),"Lev Tolstoi", Language.RUSSIAN, LocalDate.of(1865, 8, 12)));
        books.add(new Book("", Genre.ROMANCE, BigDecimal.valueOf(400),"Alykul Osvonov", Language.KYRGYZ, LocalDate.of(1996, 8, 12)));
        books.add(new Book("Ak kuu", Genre.ROMANCE, BigDecimal.valueOf(400),"Alykul Osvonov", Language.KYRGYZ, LocalDate.of(1996, 8, 12)));


        List<User>users = new LinkedList<>();
        users.add(new User(1L,"Bakyt","Alykulov","bakyt@gmail.com","996706450975", Gender.MALE,BigDecimal.valueOf(1200),books));
        users.add(new User(2L,"Bayel","Jalilov","bayel@gmail.com","996706450975", Gender.MALE,BigDecimal.valueOf(1200),books));
        users.add(new User(3L,"Aza","Mamakeev","aza@gmail.com","996706450975", Gender.MALE,BigDecimal.valueOf(1200),books));
        users.add(new User(4L,"Akyl","Kubanov","akyl@gmail.com","996706450975", Gender.MALE,BigDecimal.valueOf(1200),books));
        users.add(new User(5L,"Nur","Salmanov","nur@gmail.com","996706450975", Gender.MALE,BigDecimal.valueOf(1200),books));

        Book book = new Book();

    }
}