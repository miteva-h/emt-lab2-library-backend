package emt.lab.library.web.rest;

import emt.lab.library.model.Author;
import emt.lab.library.model.enumerations.Category;
import emt.lab.library.service.AuthorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "https://e-library-frontend-191007.herokuapp.com")
@RequestMapping(value = {"/authors"})
public class AuthorRestController {
    private final AuthorService authorService;

    public AuthorRestController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping
    public List<Author> findAll() {
        return this.authorService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Author> findById(@PathVariable Long id) {
        return this.authorService.findById(id)
                .map(book -> ResponseEntity.ok().body(book))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
