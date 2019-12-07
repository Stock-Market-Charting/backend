package com.smc.user;

import com.smc.user.service.IUserService;
import com.smc.user.vo.UserVo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.Set;

public class UserTest extends UserServiceTests {

    @Autowired
    private IUserService userService;

    @Test
    public void addUser() {
        UserVo userVo = new UserVo();
        userVo.setContactNumber("0411-23935912");
        userVo.setEmail("admin@smc.com");
        userVo.setPassword("admin");
        userVo.setUsername("admin");

        Set<Long> roleIds = new HashSet<>();
        roleIds.add((long) 1);
        userVo.setRoleIds(roleIds);

        userService.addUser(userVo);
    }

    @Test
    public void updateUser() {
        UserVo userVo = new UserVo();
        userVo.setContactNumber("0411-23935912");
        userVo.setEmail("admin@smc.com");
        userVo.setPassword("admin");
        userVo.setUsername("admin");

        Set<Long> roleIds = new HashSet<>();
        roleIds.add((long) 1);
        userVo.setRoleIds(roleIds);

        userService.updateUser((long) 1, userVo);
    }

    @Test
    public void updateUserActive() {
        userService.updateUserActive((long) 1, true);
    }

}
