package emt.lab.library.service;

import emt.lab.library.model.Author;
import emt.lab.library.model.Country;

import java.util.List;
import java.util.Optional;

public interface CountryService {
    Optional<Country> findById(Long id);

    List<Country> findAll();
}
