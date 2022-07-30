package de.rieckpil.quickstarts.service;

import de.rieckpil.quickstarts.model.AppUser;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppUserServiceTest {


    AppUserService underTest = new AppUserService();

    @Test
    public void findAllShouldReturnNotEmptyList() {
        //given
        List<AppUser> usersGiven = underTest.findAll();

        //then
        assertFalse(usersGiven.isEmpty());
    }

    @Test
    public void searchingForExistingUserShouldReturnUser() {
        //given
        var emailGiven = "filip19992@gmail.com";

        //when
        AppUser byEmail = underTest.findByEmail(emailGiven);

        //then
        assertTrue(byEmail.getEmail().equals(emailGiven));
    }
    @Test()
    public void searchingForNonExistingUserShouldThrowException() {
        //given
        var emailGiven = "filip19992@gmail.com";

        //when
        AppUser byEmail = underTest.findByEmail(emailGiven);

    }

    @Test
    public void afterDeletingOneUserListShouldBeSmallerByOne() {
        List<AppUser> usersGiven = underTest.findAll();
    }
}