package com.sky.SkyFlights.service;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;

import java.util.Optional;

import org.junit.jupiter.api.Assertions;

import com.sky.SkyFlights.domain.User;
import com.sky.SkyFlights.repos.UserRepo;
import com.sky.SkyFlights.services.UserService;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
@Sql(scripts={"classpath:user-schema.sql", "classpath:user-data.sql"}, executionPhase=Sql.ExecutionPhase.BEFORE_TEST_METHOD)
@ActiveProfiles("test")
public class UserServiceDBUnitTest {

    @Autowired
    private UserService service;

    @MockBean UserRepo repo;

    @Test
    void testFindByUsername() {
        // GIVEN
        final int id = 1;
        User user = new User();
        user.setUserID(id);
        user.setEmail("coolguy@gmail.com");
        user.setPassword("ThisIsASecurePassword");
        user.setFirstName("Guy");
        user.setLastName("MacGyver");
        user.setUsername("imSoCool101");

        // WHEN
        Mockito.when(this.repo.findById(id)).thenReturn(Optional.of(user));

        // THEN
        Assertions.assertEquals(user, this.service.getUserById(id));

        Mockito.verify(this.repo, Mockito.times(1)).findById(id);

    }
    
    
}
