package org.common.domain;

import java.io.Serializable;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;


@Entity
@Table(name = "users")
@Data
public class User implements Serializable {

  @Id
  private Integer id;

  @Column(name = "user_name")
  private String userName;

  @Column(name = "first_name")
  private String firstName;

  @Column(name = "last_name")
  private String lastName;

}
