package com.theironyard.jpademo;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by doug on 9/12/17.
 */
public interface SandwichRepository extends JpaRepository<Sandwich, Integer> {
}
