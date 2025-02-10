package org.example.repository;

import org.example.common.Authorities;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

/**
 * Репозиторий для работы с привелегиями.
 */
@Component
public class UserRepository {

    public List<Authorities> getUserAuthorities(String user, String password) {
        return Collections.emptyList();
    }
}
