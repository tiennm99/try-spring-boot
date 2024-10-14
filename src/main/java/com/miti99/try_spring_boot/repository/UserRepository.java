package com.miti99.try_spring_boot.repository;

import com.miti99.try_spring_boot.document.User;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {
  Optional<User> findById(String id);

  List<User> findAllBy();
}
