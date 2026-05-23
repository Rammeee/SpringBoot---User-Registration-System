package com.day3.service;

import com.day3.exception.InvalidAgeException;
import com.day3.model.User;

public class UserServiceImpl implements UserService {

    @Override
    public void registerUser(User user)
            throws InvalidAgeException {

        if (user.getAge() < 18) {

            throw new InvalidAgeException(
                    "User age must be 18 or above"
            );
        }

        System.out.println(
                "User Registered Successfully: "
                + user.getUsername()
        );
    }
}