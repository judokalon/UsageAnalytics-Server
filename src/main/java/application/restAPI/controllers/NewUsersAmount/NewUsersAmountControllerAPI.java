package application.restAPI.controllers.NewUsersAmount;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RequestMapping("/newusersamount")
public interface NewUsersAmountControllerAPI {

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<Integer> getNewUsersAmount( @RequestParam("vendor")String vendor);
}
