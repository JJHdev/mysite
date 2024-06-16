package com.project.mySite.users;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<Users, Long> {

    Optional<Users> findByUserId(String userId);
    Optional<Users> findByEmail(String email);
}
