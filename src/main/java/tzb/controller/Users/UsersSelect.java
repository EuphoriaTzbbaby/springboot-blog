package tzb.controller.Users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tzb.Service.UsersService;
import tzb.pojo.Users;
@RestController  // 添加这个注解，表示这是一个 RESTful 控制器
@RequestMapping("/users")
public class UsersSelect {
    @Autowired
    private UsersService usersService;

    @GetMapping("/{id}")
    public Users getUserById(@PathVariable Integer id) {
        System.out.println("cnm");
        Users user = usersService.getUserById(id);
        System.out.println(user.getEmail());
        return user;  // 直接返回对象，Spring 会自动转为 JSON
    }
}

