package de.rieckpil.quickstarts.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
public class AppUser implements Serializable {

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

  public String getEmail() {
    return email;
  }

  public String getPassword() {
    return password;
  }

  public LocalDateTime getBirthDate() {
    return birthDate;
  }

  @Override
  public String toString() {
    return "AppUser{" +
            "email='" + email + '\'' +
            ", password='" + password + '\'' +
            ", birthDate=" + birthDate +
            '}';
  }
}
