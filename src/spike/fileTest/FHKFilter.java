package spike.fileTest;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.File;
import javax.swing.filechooser.*;

/**
 *
 * @author Ashlyn
 */
public class FHKFilter extends FileFilter{
    @Override
    public boolean accept(File f){
        if (f.isDirectory())
        {
            return true;
        }
        String extension = getExtension(f);
        if (extension != null)
        {
            if(extension.equals("FHX"))
                return true;
            else
                return false;
        }
        return false;
    }
    
    @Override
    public String getDescription()
    {
        return ".FHX";
    }
    
    private String getExtension(File f)
    {
        String name = f.getName();
        try
        {
            return name.substring(name.lastIndexOf(".") + 1);
        }
        catch (Exception e)
        {
            return "";
        }
    }
    
}
