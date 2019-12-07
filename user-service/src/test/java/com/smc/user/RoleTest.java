package com.smc.user;

import com.smc.user.service.IRoleService;
import com.smc.user.vo.RoleVo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.Set;

public class RoleTest extends UserServiceTests {

    @Autowired
    private IRoleService roleService;

    @Test
    public void addRole() {
        RoleVo roleVo = new RoleVo();
        roleVo.setName("ADMIN");

        Set<Long> resourceIds = new HashSet<>();
        resourceIds.add((long) 1);
        roleVo.setResourceIds(resourceIds);

        roleService.addRole(roleVo);
    }

}
