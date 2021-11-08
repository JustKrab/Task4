package com.example.auth.repos;

import com.example.auth.entitys.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepo extends JpaRepository<Message,Long> {
}
