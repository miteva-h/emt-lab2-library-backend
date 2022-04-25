package emt.lab.library.web.rest;

import emt.lab.library.model.Book;
import emt.lab.library.model.enumerations.Category;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = "https://e-library-frontend-191007.herokuapp.com")
@RequestMapping(value = {"/categories"})
public class CategoryRestController {

    @GetMapping
    public List<Category> findAll() {
        return Arrays.stream(Category.values()).collect(Collectors.toList());
    }
}
