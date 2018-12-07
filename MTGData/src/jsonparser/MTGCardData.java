/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsonparser;

import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


/**
 *
 * @author Zac Murdaugh 12/4/2018
 */
public class MTGCardData
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        MTGJsonParser parser = new MTGJsonParser();
        
        parser.parseMTGJson();
        parser.exportMTGJsonToFile();
        //parser.readInJson(file);
    }
    
}
