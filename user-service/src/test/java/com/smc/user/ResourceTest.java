package com.smc.user;

import com.smc.user.service.IResourceService;
import com.smc.user.vo.ResourceVo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ResourceTest extends UserServiceTests {

    @Autowired
    private IResourceService resourceService;

    @Test
    public void addResource() {
        ResourceVo resourceVo = new ResourceVo();
        resourceVo.setName("resource::add");
        resourceVo.setUrl("/api/v1/resources:POST");
        resourceService.addResource(resourceVo);
    }

}
