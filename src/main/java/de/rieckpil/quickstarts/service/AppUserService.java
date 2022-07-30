package de.rieckpil.quickstarts.service;

import de.rieckpil.quickstarts.model.AppUser;
import de.rieckpil.quickstarts.repository.AppUserDao;

import java.util.List;

public class AppUserService {

    AppUserDao repository = new AppUserDao();

    public List<AppUser> findAll() {
       return repository.findAll();
    }

    public void deleteUserByUsername(String username) {
        try {
            AppUser byEmail = repository.findByEmail(username);
            repository.deleteUser(byEmail);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public AppUser findByEmail(String email) {
        try {
            return repository.findByEmail(email);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}
