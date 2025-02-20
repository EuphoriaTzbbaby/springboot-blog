package tzb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import tzb.pojo.Users;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface UsersMapper extends BaseMapper<Users> {

    @Insert("INSERT INTO users(username, email, password, role, status, created_at, updated_at, last_login_at, profile_picture) " +
            "VALUES(#{username}, #{email}, #{password}, #{role}, #{status}, #{createdAt}, #{updatedAt}, #{lastLoginAt}, #{profilePicture})")
    int insertUser(Users user);

    @Update("UPDATE users SET username = #{username}, email = #{email}, password = #{password}, role = #{role}, " +
            "status = #{status}, updated_at = #{updatedAt}, last_login_at = #{lastLoginAt}, profile_picture = #{profilePicture} " +
            "WHERE id = #{id}")
    int updateUser(Users user);

    @Delete("DELETE FROM users WHERE id = #{id}")
    int deleteUser(long id);

    @Select("SELECT * FROM users WHERE id = #{id}")
    Users getUserById(long id);

    @Select("SELECT * FROM users")
    List<Users> getAllUsers();
}
