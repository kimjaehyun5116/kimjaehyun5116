package com.example.demo.book.db.repository;

import com.example.demo.book.db.entity.BookEntity;
import com.example.demo.db.SimpleDataRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

public interface BookRepository extends JpaRepository<BookEntity, Long> {
}
