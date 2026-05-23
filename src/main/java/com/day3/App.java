package com.day3;

import java.util.Scanner;

import com.day3.exception.InvalidAgeException;
import com.day3.model.User;
import com.day3.service.UserService;
import com.day3.service.UserServiceImpl;
import com.day3.util.LoggerUtil;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        UserService service = new UserServiceImpl();

        while (true) {

            System.out.print(
                    "Enter Username (type exit to stop): "
            );

            String username = scanner.nextLine();

            if (username.equalsIgnoreCase("exit")) {

                System.out.println("Program Ended");
                break;
            }

            System.out.print("Enter Age: ");

            int age = scanner.nextInt();
            scanner.nextLine();

            User user = new User(username, age);

            try {

                service.registerUser(user);

            } catch (InvalidAgeException e) {

                System.out.println(
                        "Exception: " + e.getMessage()
                );

                LoggerUtil.logError(e.getMessage());
            }
        }

        scanner.close();
    }
}