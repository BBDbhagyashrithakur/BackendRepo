//package com.example.ATCProject.Testing;
//
//import com.example.ATCProject.DTO.UserDTO;
//import com.example.ATCProject.Entity.Users;
//import com.example.ATCProject.Repository.CollageRepo;
//import com.example.ATCProject.Repository.UserRepository;
//import com.example.ATCProject.Service.Impl.UserServiceImpl;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//
//import static org.hamcrest.Matchers.any;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.Mockito.when;
//
//public class UserTesting {
//
//    @Mock
//    private UserRepository userRepository;
//
//    @Mock
//    private CollageRepo collegeRepository;
//
//    @InjectMocks
//    private UserServiceImpl userService;
//
//    @BeforeEach
//    public void setUp() {
//        MockitoAnnotations.initMocks(this);
//    }
//
//    @Test
//    public void testCreateUser() {
//        UserDTO userDTO = new UserDTO();
//        userDTO.setName("John");
//        userDTO.setEmail("john@example.com");
//        userDTO.setMobilenumber("1234567890");
//        userDTO.setRole("user");
//        userDTO.setCollegeId(1);
//
//        Users savedUser = new Users();
//        when(userRepository.save((savedUser))).thenReturn(savedUser);
//
//        UserDTO createdUserDTO = userService.createUser(userDTO);
//
//        assertEquals(userDTO, createdUserDTO);
//    }
//
//}
