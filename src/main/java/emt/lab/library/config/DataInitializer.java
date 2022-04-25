package emt.lab.library.config;

import emt.lab.library.model.Author;
import emt.lab.library.model.Book;
import emt.lab.library.model.Country;
import emt.lab.library.model.enumerations.Category;
import emt.lab.library.repository.AuthorRepository;
import emt.lab.library.repository.BookRepository;
import emt.lab.library.repository.CountryRepository;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class DataInitializer {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final CountryRepository countryRepository;

    public DataInitializer(AuthorRepository authorRepository, BookRepository bookRepository, CountryRepository countryRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.countryRepository = countryRepository;
    }

    @PostConstruct
    public void initData() {
        Country russia = new Country("Russia", "Europe");
        this.countryRepository.save(russia);
        Country france = new Country("France", "Europe");
        this.countryRepository.save(france);
        Country spain = new Country("Spain", "Europe");
        this.countryRepository.save(spain);
        Country uk = new Country("UK", "Europe");
        this.countryRepository.save(uk);
        Country germany = new Country("Germany", "Europe");
        this.countryRepository.save(germany);
        Country usa = new Country("USA" , "America");
        this.countryRepository.save(usa);

        Author balzac = new Author("Honoré", "de Balzac", france);
        this.authorRepository.save(balzac);
        Author dostoevsky = new Author("Fyodor", "Dostoevsky", russia);
        this.authorRepository.save(dostoevsky);
        Author cervantes = new Author("Miguel", "de Cervantes", spain);
        this.authorRepository.save(cervantes);
        Author pushkin = new Author("Alexander", "Pushkin", russia);
        this.authorRepository.save(pushkin);
        Author bronte = new Author("Emily", "Brontë", uk);
        this.authorRepository.save(bronte);
        Author shakespeare = new Author("William", "Shakespeare", uk);
        this.authorRepository.save(shakespeare);
        Author chekhov = new Author("Anton", "Chekhov", russia);
        this.authorRepository.save(chekhov);
        Author tolstoy = new Author("Lev", "Tolstoy", russia);
        this.authorRepository.save(tolstoy);
        Author brown = new Author("Dan", "Brown", usa);
        this.authorRepository.save(brown);
        Author lewis = new Author("Clive Staples", "Lewis", uk);
        this.authorRepository.save(lewis);
        Author berry = new Author("Steve", "Berry", uk);
        this.authorRepository.save(berry);

        this.bookRepository.save(new Book("Father Goriot", Category.NOVEL, balzac, 8));
        this.bookRepository.save(new Book("The Da Vinci Code", Category.THRILLER, brown, 12));
        this.bookRepository.save(new Book("Crime and Punishment", Category.CLASSICS, dostoevsky, 6));
        this.bookRepository.save(new Book("Don Quixote", Category.NOVEL, cervantes, 10));
        this.bookRepository.save(new Book("The Chronicles of Narnia", Category.FANTASY, lewis, 10));
        this.bookRepository.save(new Book("Eugene Onegin", Category.NOVEL, pushkin, 7));
        this.bookRepository.save(new Book("The Alexandria Link", Category.HISTORY, berry, 9));
        this.bookRepository.save(new Book("Wuthering Heights", Category.NOVEL, bronte, 4));
        this.bookRepository.save(new Book("War and Peace", Category.CLASSICS, tolstoy, 5));
        this.bookRepository.save(new Book("Anna Karenina", Category.NOVEL, tolstoy, 6));


    }
}
