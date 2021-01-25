package org.abc.actuator.endpoint;

import java.util.HashMap;
import java.util.Map;

import org.abc.actuator.dao.UserDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

@Component
public class UserStatusCountContributor implements InfoContributor {

    @Autowired
    private UserDatabase userDatabase;

    @Override
    public void contribute(Info.Builder builder) {
        Map<String, Long> userStatusMap=new HashMap<>();
        userStatusMap.put("active",userDatabase.getUserStatusCountByStatus("active"));
        userStatusMap.put("inActive",userDatabase.getUserStatusCountByStatus("inActive"));
        builder.withDetail("userStatus",userStatusMap);
    }
}