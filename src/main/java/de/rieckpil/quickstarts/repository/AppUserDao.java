package de.rieckpil.quickstarts.repository;

import de.rieckpil.quickstarts.model.AppUser;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;


public class AppUserDao {

    AppUser appUser = new AppUser("filip19992@gmail.com", "password", LocalDateTime.now());
    AppUser appUser2 = new AppUser("grzesiek12@gmail.com", "password", LocalDateTime.now());
    AppUser appUser3 = new AppUser("maciej@gmail.com", "password", LocalDateTime.now());
    AppUser appUser4 = new AppUser("zlomek@gmail.com", "password", LocalDateTime.now());
    AppUser appUser5 = new AppUser("gracek@gmail.com", "password", LocalDateTime.now());
    AppUser appUser6 = new AppUser("asd@gmail.com", "password", LocalDateTime.now());
    AppUser appUser7 = new AppUser("monika@gmail.com", "password", LocalDateTime.now());
    List<AppUser> listOfAllUsers= List.of(appUser,appUser2,appUser3,appUser4,appUser5,appUser6,appUser7);
    public List<AppUser> findAll() {
        return listOfAllUsers;
    }
    public void addUser(AppUser appUser) {
        listOfAllUsers.add(appUser);
    }
    public void deleteUser(AppUser appUser) {
        listOfAllUsers.remove(appUser);
    }


    public AppUser findByEmail(String email) throws Exception {
        Optional<AppUser> userByEmail = listOfAllUsers.stream().filter(c -> c.getEmail().equals(email)).findFirst();
        if(userByEmail.isPresent())
            return userByEmail.get();
        else
            throw new Exception("User not found");
    }
}
