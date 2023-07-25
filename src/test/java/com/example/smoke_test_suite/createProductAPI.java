package com.example.smoke_test_suite;

import io.restassured.RestAssured;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static io.restassured.RestAssured.given;

public class createProductAPI {

    String s = RandomStringUtils.randomAlphanumeric(5);
    String sku = "123" + s;
    String name = "Test Automation" + s;

    String ID = "ef0a2c_4787cb9497974ee9b352f47283a699fc~mv2.jpeg";

    public static String generateStringFromResource(String path) throws IOException {

        return new String(Files.readAllBytes(Paths.get(path)));

    }

    @BeforeAll
    public static void setup() {
        RestAssured.baseURI = "https://www.wixapis.com/";

    }

    @Test
    public static void createProduct(String sku, String name, String path) throws IOException {


        String json = generateStringFromResource(path);


       String response = given().
                header("Authorization", "IST.eyJraWQiOiJQb3pIX2FDMiIsImFsZyI6IlJTMjU2In0.eyJkYXRhIjoie1wiaWRcIjpcImQxMjllYTdlLTliZDctNDFlMC05ZGM4LTMzMDI3MDAyMjAxZVwiLFwiaWRlbnRpdHlcIjp7XCJ0eXBlXCI6XCJhcHBsaWNhdGlvblwiLFwiaWRcIjpcImYyZTZlMDU3LTAzNDYtNGRkYS1iNmVjLTRmOGI0OTVhY2I2ZFwifSxcInRlbmFudFwiOntcInR5cGVcIjpcImFjY291bnRcIixcImlkXCI6XCJlZjBhMmMxZi1iMWFlLTQxMjUtYjRjMS1kZGU5YTI4NTA3OTRcIn19IiwiaWF0IjoxNjY1NjgxOTg2fQ.YRhNQMU53Ge_xBX8TdvYO-ydLmUgyc0u5VMNAYIpDSBVG6jJR7D5UxhFIgDxOxFtQ4lnqBpxulhS_SxU4a0wXV31sP4SvyaC6r2kNjSrF_Tskz_rr-afRZyOv1MysXI7yQsXqpG4dpLrdeWIxbDpB18pyiglrqzBcU5TQq7UJewL6LMbpSQNSo5Xk2gSpO6mglSDCQO9bGsiADl3t8vtDlE01Yelle5wCLOFaInUm3YY5Qyn8r8hvcq3w0JZ4fERDtaVj2KEInh10tghsnbfN4VrUPsV8T8bI6XoEDnRehYkRgkXPShivDc_nsdijmxgSyKYbK6gMaxZ_A3V4ydIkw").
                header("wix-account-id", "ef0a2c1f-b1ae-4125-b4c1-dde9a2850794").
                header("wix-site-id", "5844f077-353e-48fd-a6a8-9a40fc43c663").
                contentType("application/json").
                body(json.replace("{{sku}}", sku).replace("{{name}}", name)).
                when().post("https://www.wixapis.com/stores/v1/products").then().statusCode(200).extract().response().path("product.id");


    }


    @Test
    public static void createImage(String ID,String productID) throws IOException {


        String json = generateStringFromResource("src/test/java/com/example/jsonFiles/single_variant.json");

        given().
                header("Authorization", "IST.eyJraWQiOiJQb3pIX2FDMiIsImFsZyI6IlJTMjU2In0.eyJkYXRhIjoie1wiaWRcIjpcImQxMjllYTdlLTliZDctNDFlMC05ZGM4LTMzMDI3MDAyMjAxZVwiLFwiaWRlbnRpdHlcIjp7XCJ0eXBlXCI6XCJhcHBsaWNhdGlvblwiLFwiaWRcIjpcImYyZTZlMDU3LTAzNDYtNGRkYS1iNmVjLTRmOGI0OTVhY2I2ZFwifSxcInRlbmFudFwiOntcInR5cGVcIjpcImFjY291bnRcIixcImlkXCI6XCJlZjBhMmMxZi1iMWFlLTQxMjUtYjRjMS1kZGU5YTI4NTA3OTRcIn19IiwiaWF0IjoxNjY1NjgxOTg2fQ.YRhNQMU53Ge_xBX8TdvYO-ydLmUgyc0u5VMNAYIpDSBVG6jJR7D5UxhFIgDxOxFtQ4lnqBpxulhS_SxU4a0wXV31sP4SvyaC6r2kNjSrF_Tskz_rr-afRZyOv1MysXI7yQsXqpG4dpLrdeWIxbDpB18pyiglrqzBcU5TQq7UJewL6LMbpSQNSo5Xk2gSpO6mglSDCQO9bGsiADl3t8vtDlE01Yelle5wCLOFaInUm3YY5Qyn8r8hvcq3w0JZ4fERDtaVj2KEInh10tghsnbfN4VrUPsV8T8bI6XoEDnRehYkRgkXPShivDc_nsdijmxgSyKYbK6gMaxZ_A3V4ydIkw").
                header("wix-account-id", "ef0a2c1f-b1ae-4125-b4c1-dde9a2850794").
                header("wix-site-id", "5844f077-353e-48fd-a6a8-9a40fc43c663").
                contentType("application/json").
                body(json.replace("{{ID}}", ID)).pathParam("productID", productID).
                when().post("https://www.wixapis.com/stores/v1/products/{productID}/media").then().statusCode(200).extract().response().prettyPrint();
    }

    @Test
    public static void createproductwithimage(String sku, String name, String path) throws IOException {

        String json = generateStringFromResource(path);
        String json2 = generateStringFromResource("src/test/java/com/example/jsonFiles/image.json");
        String s = RandomStringUtils.randomAlphanumeric(5);
        String ID = "ef0a2c_35caca2d7c40452b837d8578debdce3a~mv2.jpeg";

        String responseID = given().
                header("Authorization", "IST.eyJraWQiOiJQb3pIX2FDMiIsImFsZyI6IlJTMjU2In0.eyJkYXRhIjoie1wiaWRcIjpcImQxMjllYTdlLTliZDctNDFlMC05ZGM4LTMzMDI3MDAyMjAxZVwiLFwiaWRlbnRpdHlcIjp7XCJ0eXBlXCI6XCJhcHBsaWNhdGlvblwiLFwiaWRcIjpcImYyZTZlMDU3LTAzNDYtNGRkYS1iNmVjLTRmOGI0OTVhY2I2ZFwifSxcInRlbmFudFwiOntcInR5cGVcIjpcImFjY291bnRcIixcImlkXCI6XCJlZjBhMmMxZi1iMWFlLTQxMjUtYjRjMS1kZGU5YTI4NTA3OTRcIn19IiwiaWF0IjoxNjY1NjgxOTg2fQ.YRhNQMU53Ge_xBX8TdvYO-ydLmUgyc0u5VMNAYIpDSBVG6jJR7D5UxhFIgDxOxFtQ4lnqBpxulhS_SxU4a0wXV31sP4SvyaC6r2kNjSrF_Tskz_rr-afRZyOv1MysXI7yQsXqpG4dpLrdeWIxbDpB18pyiglrqzBcU5TQq7UJewL6LMbpSQNSo5Xk2gSpO6mglSDCQO9bGsiADl3t8vtDlE01Yelle5wCLOFaInUm3YY5Qyn8r8hvcq3w0JZ4fERDtaVj2KEInh10tghsnbfN4VrUPsV8T8bI6XoEDnRehYkRgkXPShivDc_nsdijmxgSyKYbK6gMaxZ_A3V4ydIkw").
                header("wix-account-id", "ef0a2c1f-b1ae-4125-b4c1-dde9a2850794").
                header("wix-site-id", "5844f077-353e-48fd-a6a8-9a40fc43c663").
                contentType("application/json").
                body(json.replace("{{sku}}", sku).replace("{{name}}", name)).
                when().post("https://www.wixapis.com/stores/v1/products").then().statusCode(200).extract().response().path("product.id").toString();

        given().
                header("Authorization", "IST.eyJraWQiOiJQb3pIX2FDMiIsImFsZyI6IlJTMjU2In0.eyJkYXRhIjoie1wiaWRcIjpcImQxMjllYTdlLTliZDctNDFlMC05ZGM4LTMzMDI3MDAyMjAxZVwiLFwiaWRlbnRpdHlcIjp7XCJ0eXBlXCI6XCJhcHBsaWNhdGlvblwiLFwiaWRcIjpcImYyZTZlMDU3LTAzNDYtNGRkYS1iNmVjLTRmOGI0OTVhY2I2ZFwifSxcInRlbmFudFwiOntcInR5cGVcIjpcImFjY291bnRcIixcImlkXCI6XCJlZjBhMmMxZi1iMWFlLTQxMjUtYjRjMS1kZGU5YTI4NTA3OTRcIn19IiwiaWF0IjoxNjY1NjgxOTg2fQ.YRhNQMU53Ge_xBX8TdvYO-ydLmUgyc0u5VMNAYIpDSBVG6jJR7D5UxhFIgDxOxFtQ4lnqBpxulhS_SxU4a0wXV31sP4SvyaC6r2kNjSrF_Tskz_rr-afRZyOv1MysXI7yQsXqpG4dpLrdeWIxbDpB18pyiglrqzBcU5TQq7UJewL6LMbpSQNSo5Xk2gSpO6mglSDCQO9bGsiADl3t8vtDlE01Yelle5wCLOFaInUm3YY5Qyn8r8hvcq3w0JZ4fERDtaVj2KEInh10tghsnbfN4VrUPsV8T8bI6XoEDnRehYkRgkXPShivDc_nsdijmxgSyKYbK6gMaxZ_A3V4ydIkw").
                header("wix-account-id", "ef0a2c1f-b1ae-4125-b4c1-dde9a2850794").
                header("wix-site-id", "5844f077-353e-48fd-a6a8-9a40fc43c663").
                contentType("application/json").
                body(json2.replace("{{ID}}", ID)).pathParam("productID", responseID).
                when().post("https://www.wixapis.com/stores/v1/products/{productID}/media").then().statusCode(200).extract().response().prettyPrint();


    }
}



