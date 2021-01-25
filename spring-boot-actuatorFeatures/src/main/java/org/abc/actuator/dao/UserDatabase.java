package org.abc.actuator.dao;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.abc.actuator.dto.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDatabase {



    public List<User> getAllUsers() {
        return Stream.of(
                new User(102, "Yash", "yash@gmail.com", "inActive"),
                new User(100, "Vikas", "vikas@gmail.com", "active"),
                new User(105, "Kavita", "kavita@gmail.com", "active"),
                new User(108, "Shreya", "shreya@gmail.com", "inActive"),
                new User(101, "Aaditya", "aaditya@gmail.com", "active"),
                new User(107, "Avinav", "avinav@yahoo.com", "inActive"))
                .collect(Collectors.toList());
    }


    public long getUserStatusCountByStatus(String status){
       return getAllUsers().stream().filter(user -> user.getStatus().equals(status)).count();
    }

}