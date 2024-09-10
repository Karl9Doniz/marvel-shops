package com.andrii.marvelshops.service.user;

import com.andrii.marvelshops.dto.UserDto;
import com.andrii.marvelshops.model.User;
import com.andrii.marvelshops.request.CreateUserRequest;
import com.andrii.marvelshops.request.UserUpdateRequest;

public interface IUserService {

    User getUserById(Long userId);
    User createUser(CreateUserRequest request);
    User updateUser(UserUpdateRequest request, Long userId);
    void deleteUser(Long userId);

    UserDto convertUserToDto(User user);

    User getAuthenticatedUser();
}