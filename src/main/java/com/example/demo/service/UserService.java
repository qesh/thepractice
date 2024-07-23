package com.example.demo.service;

import com.example.demo.api.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private List<User> userList;
    public UserService() {
        userList = new ArrayList<>();
            User user=new User(1, "Ken", 33, "ken@mail.com");
            User user1=new User(2, "Sai", 31, "sai@mail.com");
            User user2=new User(3, "Salima", 2, "salima@mail.com");
            User user3=new User(4, "Gul", 36, "gul@mail.com");
            User user4=new User(5, "Zinash", 72, "zinash@mail.com");
            User user5=new User(6, "Adam", 1, "adam@mail.com");
            userList.addAll(Arrays.asList(user, user1, user2,user3,user4, user5));
        }

    public Optional<User> getUser(Integer id) {
            Optional optional=Optional.empty();
           for(User user:userList) {
               if(user.getId()==id) {
                   optional=Optional.of(user);
                   return optional;
               }
           }
           return optional;
    }





}
