package com.example.demo.repo;

import com.example.demo.models.User;
import org.hibernate.annotations.SQLUpdate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Set;

public interface UserRepository extends JpaRepository<User,Long> {

    //@Query("SELECT FROM user")
    //Set<User> AllUsers()

    User findByUsername(String username);
    @Query("SELECT u FROM User u where u.email=:email and u.password=:password")
    User ConfirmUser(@Param("email")String email,@Param("password") String password);


    @Query("SELECT u.id FROM User u WHERE u.email = :email")
    Long GetUserIdByName(@Param("email") String email);


    //public void DeleteUser(User user) => dBContent.User.Remove(user);

    @Query("SELECT u FROM User u where u.id=:id")
    User GetUser(@Param("id") Long id);


    @Query("SELECT u FROM User u where u.email=:email")
    User WithSameName(@Param("email") String email);
}
