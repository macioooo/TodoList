package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class LangRepository {
    private List<Lang> langList;

    LangRepository() {
        langList = new ArrayList<>();
        langList.add(new Lang(1, "Hello", LangCodes.EN));
        langList.add(new Lang(2, "Witaj", LangCodes.PL));
    }
    Optional<Lang> getLang(LangCodes code) {
        return langList.stream().filter(l -> l.getCode().equals(code)).findFirst();
    }

    Optional<Lang> findById(Integer idToBeFound) {
        return langList.stream().filter(l -> l.getId()
                .equals(idToBeFound))
                .findFirst();
    }
}
