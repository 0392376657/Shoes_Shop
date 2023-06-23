package com.doanjava.application.service;


import com.doanjava.application.entity.User;
import com.doanjava.application.model.request.CreateUserRequest;
import com.doanjava.application.model.request.UpdateProfileRequest;
import com.doanjava.application.model.dto.UserDTO;
import com.doanjava.application.model.request.ChangePasswordRequest;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    List<UserDTO> getListUsers();

    Page<User> adminListUserPages(String fullName, String phone, String email, Integer page);

    User createUser(CreateUserRequest createUserRequest);

    void changePassword(User user, ChangePasswordRequest changePasswordRequest);

    User updateProfile(User user, UpdateProfileRequest updateProfileRequest);
}
