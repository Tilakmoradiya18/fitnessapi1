package com.fitness.fitnessapi.repository;

import com.fitness.fitnessapi.entity.ResetToken;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ResetTokenRepository extends JpaRepository<ResetToken, Long> {
    Optional<ResetToken> findByToken(String token);
    void deleteByEmail(String email); // Optional: clear old token when generating new one
}
