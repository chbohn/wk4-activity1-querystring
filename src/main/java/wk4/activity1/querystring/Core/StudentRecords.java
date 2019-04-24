package wk4.activity1.querystring.Core;

import org.glassfish.jersey.jackson.JacksonFeature;
import wk4.activity1.querystring.ExampleService;
import wk4.activity1.querystring.logger.ServiceLogger;
import wk4.activity1.querystring.models.SearchStudentRequestModel;
import wk4.activity1.querystring.models.SearchStudentResponseModel;
import wk4.activity1.querystring.models.VerifyPrivilegeRequestModel;

import javax.ws.rs.client.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class StudentRecords {
    public static SearchStudentResponseModel searchForStudents(SearchStudentRequestModel requestModel) {
        ServiceLogger.LOGGER.info("Searching for students...");

        // Verify that the requester has the correct privilege level to make the request
        if (!isUserAllowedToMakeRequest(requestModel.getEmail())) {
            return new SearchStudentResponseModel(2, "Unauthorized");
        } else {
            // make the query, build the ResponseModel, and return it
            return new SearchStudentResponseModel(1, "Success");
        }
    }

    private static boolean isUserAllowedToMakeRequest(String email) {
        ServiceLogger.LOGGER.info("Verifying privilege level with IDM...");

        // Create a new Client
        ServiceLogger.LOGGER.info("Building client...");

        // Get the URI for the IDM
        ServiceLogger.LOGGER.info("Building URI...");

        ServiceLogger.LOGGER.info("Setting path to endpoint...");

        // Create a WebTarget to send a request at
        ServiceLogger.LOGGER.info("Building WebTarget...");

        // Create an InvocationBuilder to create the HTTP request
        ServiceLogger.LOGGER.info("Starting invocation builder...");

        // Set the payload
        ServiceLogger.LOGGER.info("Setting payload of the request");

        // Send the request and save it to a Response
        ServiceLogger.LOGGER.info("Sending request...");
        ServiceLogger.LOGGER.info("Sent!");

        // Check that status code of the request
        return false;
    }
}
