//$Id$
package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Session;

public interface SessionRepository extends JpaRepository<Session, Long> {

}
