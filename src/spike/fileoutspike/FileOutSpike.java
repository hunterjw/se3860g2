/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spike.fileoutspike;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**

 @author pattersonz
 */
public class FileOutSpike
{

   /**
    @param args the command line arguments
    */
   public static void main(String[] args)
   {
      //"               :"
      String input = "";
      int Year =2000, samples = 2, ID = 3, yearsRun = 5;
      try 
      {
         PrintStream outF = new PrintStream(new FileOutputStream("datFile.alex"));
         
         outF.println("Name of site   : " + input);
         outF.println("Site code      : " + input);
         outF.println("Collection date: " + input);
         outF.println("Collectors     : " + input);
         outF.println("Crossdaters    : " + input);
         outF.println("Number samples : " + input);
         outF.println("Species name   : " + input);
         outF.println("Common name    : " + input);
         outF.println("Habitat name   : " + input);
         outF.println("Country        : " + input);
         outF.println("State          : " + input);
         outF.println("County         : " + input);
         outF.println("Park/Monument  : " + input);
         outF.println("National Forest: " + input);
         outF.println("Ranger district: " + input);
         outF.println("Township       : " + input);
         outF.println("Range          : " + input);
         outF.println("Section        : " + input);
         outF.println("Quarter section: " + input);
         outF.println("UTM easting    : " + input);
         outF.println("UTM northing   : " + input);
         outF.println("Latitude       : " + input);
         outF.println("Longitude      : " + input);
         outF.println("Topographic map: " + input);
         outF.println("Lowest elev    : " + input);
         outF.println("Highest elev   : " + input);
         outF.println("Slope          : " + input);
         outF.println("Aspect         : " + input);
         outF.println("Area sampled   : " + input);
         outF.println("Substrate type : " + input);
         outF.println("Begin comments BELOW this line:" + '\n'+ input);
         
         
         
         outF.println("End comments ABOVE this line.");
         outF.println("");
         outF.println("FHX2 FORMAT");
         outF.println (Year + " " + samples + " " + ID);
         
         for (int i = 0; i < ID; i++)
            //inside is replaced with a string created of the 
            outF.println("this is row " + i + " of the IDs");
         
         outF.println("");
         
         
         for (int i = 0; i < yearsRun; i++)
         {
            for (int j = 0; j < samples; j++)
               outF.print("."); //this will be a character read from the table
            outF.println(" " + (Year + i));
         }
         
         
      }
      catch (IOException ex)
      {
         System.out.println("file error: " + ex);
        
      }
      
      
   }
   
}
