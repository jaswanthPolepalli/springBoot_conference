//$Id$
package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Speaker;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {

}
