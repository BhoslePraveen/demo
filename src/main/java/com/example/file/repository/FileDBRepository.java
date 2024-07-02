package com.example.file.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.file.model.FileDB;

@Repository
public interface FileDBRepository extends JpaRepository<FileDB, Long> {

}
