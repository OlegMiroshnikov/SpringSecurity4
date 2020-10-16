package lv.partnersoft.training.services;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;

public interface ProcessInterface {

//    @PreAuthorize("hasRole('ROLE_ADMIN')")
//    @RolesAllowed("ROLE_ADMIN")
    @Secured("ROLE_ADMIN")
    String getMessage();

}
