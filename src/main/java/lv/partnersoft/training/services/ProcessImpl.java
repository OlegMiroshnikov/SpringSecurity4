package lv.partnersoft.training.services;

import org.springframework.stereotype.Service;

@Service("process")
public class ProcessImpl implements ProcessInterface {

    @RolesAllowed("ROLE_ADMIN")
    @Override
    public String getMessage() {
        return "my message";
    }
}
