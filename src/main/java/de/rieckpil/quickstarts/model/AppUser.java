package de.rieckpil.quickstarts.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class AppUser {

  @Id
  @GeneratedValue
  private int id;
  private String email;

  private String password;
  private LocalDateTime birthDate;

  public AppUser(String email,String password, LocalDateTime birthDate) {
    this.email = email;
    this.password = password;
    this.birthDate = birthDate;
  }

  public AppUser() {
  }
}