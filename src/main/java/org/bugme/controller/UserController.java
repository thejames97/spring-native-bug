package org.bugme.controller;

import java.util.Optional;
import org.common.domain.User;
import org.common.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/users")
@RequiredArgsConstructor
public class UserController {

  private final UserService userService;

  @GetMapping
  public ResponseEntity<Iterable<User>> getAll() {
    return new ResponseEntity<>(userService.getUsers(), HttpStatus.OK);
  }

  @GetMapping("/{id}")
  public ResponseEntity<User> getById(@PathVariable Integer id) {
    Optional<User> user = userService.getUser(id);
    if (user.isPresent())
      return new ResponseEntity<>(user.get(), HttpStatus.OK);
    else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }

}
