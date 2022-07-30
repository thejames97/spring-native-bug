package org.common.service;

import java.util.Optional;
import org.common.domain.User;
import org.common.repository.UserRepository;
import javax.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
public class UserService {

  private final UserRepository repository;

  public Iterable<User> getUsers() {
    return repository.findAll();
  }

  public Optional<User> getUser(Integer id) {
    return repository.findById(id);
  }

}
