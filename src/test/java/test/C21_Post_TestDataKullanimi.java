package test;

import baseURL.HerokuappBaseUrl;
import org.junit.Test;

public class C21_Post_TestDataKullanimi extends HerokuappBaseUrl {


    // https://restful-booker.herokuapp.com/booking url’ine asagidaki body'ye sahip bir POST request gonderdigimizde
    // donen response’un id haric asagidaki gibi oldugunu test edin.

    //Request body
    //       {
    //           "firstname" : "Ahmet",
    //           "lastname" : “Bulut",
    //           "totalprice" : 500,
    //           "depositpaid" : false,
    //           "bookingdates" : {
    //               "checkin" : "2021-06-01",
    //               "checkout" : "2021-06-10"
    //           },
    //           "additionalneeds" : "wi-fi"
    //       }


    //Response Body
//{
//"bookingid":

// "booking":{
// "firstname":"Ahmet",
// "lastname":"Bulut",
// "totalprice":500,
// "depositpaid":false,

// "bookingdates":{
// "checkin":"2021-06-01",
// "checkout":"2021-06-10"
// }

//"additionalneeds":"wi-fi"
//}

@Test
    public void Post01(){

    //URL ve Body hazırla

  specHerokuapp.pathParam("pp1","booking");












}

























}