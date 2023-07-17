package vn.dube.controller;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import vn.dube.apis.EmployeeApi;
import vn.dube.models.EmployeeResponseBody;

@RestController
public class EmployeeController implements EmployeeApi {
    @Override
    public ResponseEntity<EmployeeResponseBody> getEmployeeInfo(@Parameter(name = "id", description = "employee id", required = true, in = ParameterIn.PATH) @PathVariable("id") String id) {
        return null;
    }
}
