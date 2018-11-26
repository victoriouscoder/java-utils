package com.github.quiram.utils;

import java.util.List;
import java.util.Optional;

import static java.util.Collections.emptyList;
import static java.util.Collections.singletonList;

public class Optionals {
    public static <T> List<T> toList(Optional<T> o) {
        if (o.isPresent()) {
            return singletonList(o.get());
        }

        return emptyList();
    }
}