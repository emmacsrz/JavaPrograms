package Week3_and_4_ReplitPractice;

import java.util.Scanner;


public class HTTPStatusCode3_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter status code:");
        int status = input.nextInt();
        String output = " ";
        switch (status) {
            case 200:
                output = "OK";
                break;

            case 201:
                output = "Created";
                break;

            case 202:
                output = "Accepted";
                break;

            case 307:
                output = "Temporary Redirect";
                break;

            case 400:
                output = "Bad Request";
                break;
            case 401:
                output = "Unauthorized";
                break;
            case 403:
                output = "Forbidden";
                break;

            case 404:
                output = "Not Found";
                break;

            case 410:
                output = "Gone";
                break;

            case 500:
                output = "Internal Server Error";
                break;

            case 303:
                output = "Service Unavailable";
                break;

            default:
                output = "Invalid status code";
        }


        System.out.println("output");
    }

}

