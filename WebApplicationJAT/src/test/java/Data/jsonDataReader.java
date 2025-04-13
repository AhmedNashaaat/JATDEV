package Data;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class jsonDataReader {
    public String email,password,firstName,lastName,birthDate
            ,street ,postalCode,city,state,country,phone;
    public void jsonReader() throws IOException, ParseException {
        String filePath = System.getProperty("user.dir") + "/src/test/java/Data/UserData.json";
        File srcFile = new File(filePath);
        JSONParser parser = new JSONParser();
        JSONArray jsonArray = (JSONArray) parser.parse(new FileReader(srcFile));

        for (Object obj : jsonArray) {
            JSONObject data = (JSONObject) obj;

             email = (String) data.get("Email");
             password = (String) data.get("Password");
             firstName = (String) data.get("FName");
             lastName = (String) data.get("LName");
             birthDate = (String) data.get("BirthDate");
             street = (String) data.get("Street");
             postalCode = (String) data.get("PostalCode");
             city = (String) data.get("City");
             state = (String) data.get("State");
             country = (String) data.get("Country");
             phone = (String) data.get("Phone");



        }
    }
}