package com.sky.SkyFlights;
import static org.assertj.core.api.Assertions.assertThat;

import com.sky.SkyFlights.domain.User;
import com.sky.SkyFlights.repos.UserRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

@DataJpaTest
public class UserRepoTests {


        @Autowired
        private TestEntityManager entityManager;

        @Autowired
        private UserRepo repo;

        // test methods
        @Test
        public void testCreateUser() {
            User user = new User();
            user.setEmail("ravi@gmail.com");
            user.setPassword("ravi2020");
            user.setFirstName("Ravi");
            user.setLastName("Kumar");
            user.setUsername("ravikumar");

            User savedUser = repo.save(user);

            User existUser = entityManager.find(User.class, savedUser.getUserID());

            assertThat(user.getEmail()).isEqualTo(existUser.getEmail());

        }
    }
