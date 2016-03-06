HPGL FILTER FOR USE WITH 32-BIT VERSIONS OF MICROSOFT WORD.

This filter can be used with all 32-bit versions of Microsoft Word. 
The HPGL filter does not ship with Word 97 or later. This filter can be 
used with Word after performing the following steps to install the 
filter on your system:

1. Double-click on the file HPGL.EXE to extract the necessary files for 
   installing the HPGL filter.

2. Copy the graphic filter file (HPGLIM32.FLT) to the folder containing 
   the Microsoft Shared application files, usually 
   C:\Program Files\Common Files\Microsoft Shared\Grphflt. (If your 
   graphics filters are located in a different folder, you will need to 
   copy the file to your shared files folder and edit the HPGL.REG file 
   to indicate the correct location. - See the section "Editing the 
   HPGL.REG File" for details before proceeding with step 3.)

3. Double-click on the HPGL.REG. This will create the necessary entries 
   in the Windows registry for the HPGL filter to work with the 32-bit 
   Microsoft Office applications.

4. If Microsoft Word was running while the information in the HPGL.REG 
   file was registered, you will need to exit Word and restart Word, 
   and may also need to restart Windows before the filter can be used.


EDITING THE HPGL.REG FILE

1. Open the HPGL.REG file using a text editor, such as NotePad.

2. Replace all occurrences of "C:\\Program Files\\Common Files
   \\Microsoft Shared\\Grphflt\\HPGLIM32.FLT" with the path you copied
   the HPGLIM32.FLT file to. Be sure to include two backslashes between 
   all folder names and the filename as in the current entries.

3. Save your changes and exit the text editor.

