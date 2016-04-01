/**
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
*/

package prototype2;

/**

@author John
*/
public class Sample
{
   private String sampleName;
   private char[] oldData, newData;

   public void setNewData(char[] newData)
   {
      this.newData = newData;
   }

   public char[] getNewData()
   {
      return newData;
   }

   public void setSampleName(String sampleName)
   {
      this.sampleName = sampleName;
   }

   public void setOldData(char[] oldData)
   {
      this.oldData = oldData;
   }

   public String getSampleName()
   {
      return sampleName;
   }

   public char[] getOldData()
   {
      return oldData;
   }
   
   public Sample()
   {
      sampleName = "";
      oldData = new char[0];
      newData = new char[0];
   }
   
   public Sample(int numYears, String name)
   {
      oldData = new char[numYears];
      newData = new char[numYears];
      sampleName = name;
   }
}
