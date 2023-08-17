// package com.sky.SkyFlights.rest;

// import org.junit.jupiter.api.Test;
// import org.junit.jupiter.api.extension.ExtendWith;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
// import org.springframework.boot.test.context.SpringBootTest;
// import org.springframework.security.test.context.support.TestExecutionEvent;
// import org.springframework.security.test.context.support.WithAnonymousUser;
// import org.springframework.security.test.context.support.WithMockUser;
// import org.springframework.security.test.context.support.WithUserDetails;
// import org.springframework.test.context.ActiveProfiles;
// import org.springframework.test.context.ContextConfiguration;
// import org.springframework.test.context.jdbc.Sql;
// import org.springframework.test.context.junit.jupiter.SpringExtension;
// import org.springframework.test.web.servlet.MockMvc;
// import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
// import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

// import com.fasterxml.jackson.databind.ObjectMapper;

// @SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
// @AutoConfigureMockMvc
// @Sql(scripts={"classpath:user-schema.sql", "classpath:user-data.sql"}, executionPhase=Sql.ExecutionPhase.BEFORE_TEST_METHOD)
// @ActiveProfiles("test")
// @WithMockUser(value = "imSoCool101", password = "ThisIsASecurePassword")
// public class UserMvcIntegrationTest {

//     @Autowired
//     private MockMvc mvc;

//     @Autowired
//     private ObjectMapper mapper;
    
//     @Test
//     void testAnyResponse() throws Exception {
//         final int id = 1;
//         mvc.perform(MockMvcRequestBuilders.get("/users/getByID/" + id))
//             .andExpect(MockMvcResultMatchers.status().isOk());
//     }
    
//     // @Test
//     // void testFindUserById() throws Exception {
//     //     // METHOD: GET
//     //     // PATH: /
//     //     // BODY: JSON
//     //     // HEADERS: CONTENT-TYPE: application/json
//     //     final int id = 1;

//     //     User user = new User();
//     //     user.setUserID(id);
//     //     user.setEmail("coolguy@gmail.com");
//     //     user.setPassword("ThisIsASecurePassword");
//     //     user.setFirstName("Guy");
//     //     user.setLastName("MacGyver");
//     //     user.setUsername("imSoCool101");

//     //     String responseBody = this.mapper.writeValueAsString(user);
//     //     this.mvc.perform(MockMvcRequestBuilders.get("/users/getByID/" + id))
//     //         .andExpect(MockMvcResultMatchers.status().isOk())
//     //         .andExpect(MockMvcResultMatchers.content().json(responseBody));

//     // }
    
    
// }
