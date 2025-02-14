/*
 * Second Devops School Application
 * Second Devops School Application API
 *
 * OpenAPI spec version: 1.1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ru.tsystems.devschool.api;

import ru.tsystems.devschool.model.ErrorDto;
import ru.tsystems.devschool.model.SchoolDto;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SchoolApi
 */
@Ignore
public class SchoolApiTest {

    private final SchoolApi api = new SchoolApi();

    
    /**
     * Create a School
     *
     * API for creating a new School
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createSchoolTest() {
        SchoolDto schoolDto = null;
        SchoolDto response = api.createSchool(schoolDto);

        // TODO: test validations
    }
    
    /**
     * Gets list of Schools
     *
     * API for getting all Schools
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllSchoolsTest() {
        List<SchoolDto> response = api.getAllSchools();

        // TODO: test validations
    }
    
    /**
     * Get School by id
     *
     * API for getting School by id
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSchoolTest() {
        Long id = null;
        SchoolDto response = api.getSchool(id);

        // TODO: test validations
    }
    
}
