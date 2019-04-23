package wk4.activity1.querystring.Core;

import wk4.activity1.querystring.logger.ServiceLogger;
import wk4.activity1.querystring.models.SearchStudentRequestModel;
import wk4.activity1.querystring.models.SearchStudentResponseModel;

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

        // Get the URI for the IDM

        // Create a WebTarget to send a request at

        // Create an InvocationBuilder to create the HTTP request

        // Set the payload

        // Check that status code of the request
        return false;
    }
}
