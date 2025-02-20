package tzb.Service;

import tzb.pojo.Users;

import java.util.List;

public interface UsersService {
    int insertUser(Users user);

    int updateUser(Users user);

    int deleteUser(long id);

    Users getUserById(long id);

    List<Users> getAllUsers();
}
