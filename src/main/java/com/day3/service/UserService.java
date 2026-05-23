package com.day3.service;

import com.day3.model.User;
import com.day3.exception.InvalidAgeException;

public interface UserService {

    void registerUser(User user) throws InvalidAgeException;
}