package org.example.lang;

import static java.util.stream.Collectors.toList;

import java.util.List;

public class LangService {
    private LangRepository repository;
    LangService() {
        this(new LangRepository());
    }
    LangService(LangRepository repository) {
        this.repository = repository;
    }

    List<LangDTO> findAll() {
        return repository
                .findAll()
                .stream()
                .map(LangDTO::new)
                .collect(toList());
    }
}
