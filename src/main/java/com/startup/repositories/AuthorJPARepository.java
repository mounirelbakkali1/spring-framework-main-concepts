package com.startup.repositories;

import com.startup.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorJPARepository extends JpaRepository<Author,Integer> {
}
