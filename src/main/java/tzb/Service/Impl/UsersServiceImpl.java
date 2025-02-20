package tzb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tzb.Service.UsersService;
import tzb.mapper.UsersMapper;
import tzb.pojo.Users;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersMapper usersMapper;

    @Override
    public int insertUser(Users user) {
        return usersMapper.insertUser(user);
    }

    @Override
    public int updateUser(Users user) {
        return usersMapper.updateUser(user);
    }

    @Override
    public int deleteUser(long id) {
        return usersMapper.deleteUser(id);
    }

    @Override
    public Users getUserById(long id) {
        return usersMapper.getUserById(id);
    }

    @Override
    public List<Users> getAllUsers() {
        return usersMapper.getAllUsers();
    }
}
