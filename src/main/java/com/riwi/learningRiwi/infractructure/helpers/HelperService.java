package com.riwi.learningRiwi.infractructure.helpers;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;


public class HelperService {
    public static <E, R> List<R> transformList(
            List<E> entities,
            Function<E, R> entityToResponse) {

                return entities.stream()
                    .map(entityToResponse)
                    .collect(Collectors.toList());
    }
}
