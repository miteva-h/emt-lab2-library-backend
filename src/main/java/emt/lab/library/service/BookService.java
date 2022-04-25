package emt.lab.library.service;

import emt.lab.library.model.Author;
import emt.lab.library.model.Book;
import emt.lab.library.model.dto.BookDto;
import emt.lab.library.model.enumerations.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface BookService {

    List<Book> findAll();

    Optional<Book> findById(Long id);

    Optional<Book> save(BookDto bookDto);

    Optional<Book> edit(Long id, BookDto bookDto);

    void deleteById(Long id);

    void getACopy(Long id);

    void returnACopy(Long id);
}
