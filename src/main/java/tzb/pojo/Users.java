package tzb.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class Users implements Serializable {

  private long id;
  private String username;
  private String email;
  private String password;
  private String role;
  private String status;
  private java.sql.Timestamp createdAt;
  private java.sql.Timestamp updatedAt;
  private java.sql.Timestamp lastLoginAt;
  private String profilePicture;
}