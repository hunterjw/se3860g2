Fire History Analysis and Exploration System (FHAES) 
Alpha 1.0 Release Readme

Change Log:
20080609 File created.

Contents:
I.          INTRODUCTION
II.         INTENDED AUDIENCE
III.        ALPHA RELEASE CONTENT
IV.         QUICK START
V.          SYSTEM REQUIREMENTS
VI.         INSTALLATION GUIDE
VII.        NOTES ON RUNNING FHAES
VIII.       CONTACT INFORMATION AND HELP
APPENDIX A. FHAES GRAPHICS FEATURES FOR A FUTURE RELEASE
APPENDIX B. BACKGROUND ON THE FHAES PROJECT
APPENDIX C. CITATIONS

********************
I. INTRODUCTION
********************
The Fire History Analysis and Exploration System (FHAES) analyzes
chronologies of fire scars developed from tree-ring data (and can be
used to analyze chronologies of other disturbance events). It can graph
and plot fire history data, statistically analyze the fire chronologies,
and evaluate the relationship between fire occurrence and climate
condition. To this end, the FHAES project has redeveloped components of
the FHX2 software program
(http://www.forestresearchtools.com/fhx2.html), developed by Henri
Grissino-Mayer, so that they are free, user-friendly, and easily
accessible to a broad range of users on the Internet. For an extended
description of the FHAES project see APPENDIX B or visit the FHAES 
website at http://frames.nbii.gov/fhaes/.

********************
II. INTENDED AUDIENCE
********************
FHAES will most often be used by fire historians and land managers to
analyze fire scar event data.  Note that FHAES (or FHX2) really can
analyze any event data - not just events recorded in tree rings
(landslides, avalanches, flooding, etc.) but also regeneration
events in forest stands; also useful information in determining
the impact of disturbance events on forested landscapes.

**************************
III. ALPHA RELEASE CONTENT
**************************

The FHAES ALPHA release is made up of the following files (available at 
http://frames.nbii.gov/fhaes/):

  readme-fhaes-alpha_01.txt: this document.

  fhaesa01.zip: This contains the statistical and graphics functionality
     from the original FHX2. At this time there is no data entry module.  
     It is supported for Microsoft Windows only (not Macintosh or Linux). 
     Java 1.5 or higher is required.

  fhgraphics-alpha_01.jar: This is the FHAES Graphics module packaged 
     as an executable Java archive(JAR). Besides creating fire charts,
     it can also be used to re-order samples and create different data
     files, as well as to create the composite data files needed to run
     the Superposed Epoch Analysis (EVENT) module. fhgraphics-alpha_01.jar
     is also bundled in fhaesa01.zip. It is available as a stand-
     alone application because it offers support for all windowing 
     system platforms that support Java 1.5 or higher (e.g., 
     Microsoft Windows, Linux, Macintosh, etc.). Java 1.5 or higher
     is required.

  FENTER3.EXE: This is the original FHX2 short series data entry 
     module, and is supported for DOS only. FHAES does not have its own 
     data entry module yet. When it does, the module will be supported
     for Microsoft Windows at a minimum, and will be integrated into 
     the FHAES software. 

  fhxspreadsheetentryinfo.pdf: These are directions for entering and 
     editing fire history data into the FHX format, which is required to 
     run FHX2 and FHAES. These instructions are platform and software 
     independent, but the user needs to use some sort of spreadsheet 
     and text editing programs. 

  samples.zip: This contains a set of sample data files, including a
     readme text file describing the sample data files.

  fhx2_manual.pdf: This is the original FHX2 documentation. It is 
     available for downloading from its permanent home at:
     http://web.utk.edu/~grissino/downloads/fhx2_manual.pdf
  
NOTE: at this time, end user documentation is not available for FHAES 
but it is planned for the future. The original FHX2 documentation is 
available for download from its permanent home at:
http://web.utk.edu/~grissino/downloads/fhx2_manual.pdf, (there is a
link to this document at the FHAES home page) where useful information 
about how data is formatted, the tests performed, etc. can be found. 
You may also wish to refer to Grissino-Mayer, H.D., 2001, "FHX2 - 
Software for analyzing temporal and spatial patterns in fire regimes 
from tree rings." Tree-Ring Research 57(1): 115-124. available at: 
  http://www.treeringsociety.org/TRBTRR/TRRvol57_1_115-124.pdf
 
********************
IV. QUICK START
********************
Download the FHAES zipped archive, fhaesa01.zip. Unzip it and copy all 
files to a new, empty directory (for example c:\FHAES). NOTE: The 
subdirectory and all directories in the path must have fewer than 8 
characters, and no special characters or blanks. This is your 
"installation directory". Double-click on fhaes-alpha_01.jar in the 
Windows Explorer, or launch it from a DOS command window by entering:
   java -jar fhaes-alpha_01.jar

For system requirements and detailed installation instructions, read 
sections V. SYSTEM REQUIREMENTS and VI. INSTALLATION GUIDE.


********************
V. SYSTEM REQUIREMENTS
********************
-----------------------
FHAES:
-----------------------
Microsoft Windows (98/2000/SP/Vista) and Java 1.5 (or later). Please 
verify what version of Java is on your computer or download the 
software for free at http://www.java.com/. Contact your system 
administrator for assistance. 

-----------------------
FHAES GRAPHICS:
-----------------------
Java 1.5 (or later). Please verify your version of Java or download 
the software for free at http://www.java.com/. Contact your system 
administrator for assistance. 

-----------------------
FENTER3:
-----------------------
DOS operating system.


********************
VI. INSTALLATION GUIDE
********************
-----------------------
FHAES:
-----------------------
Download the fhaesa01.zip file. Unzip all the files to a new, empty 
directory: your "installation directory". (NOTE: make sure that 
no part of the path to this directory contains more than eight 
characters, spaces, or special characters. This is also true of the 
directory where you want your input (data) and output (results) files
to reside.)

The contents of the fhaesa01.zip follow:

fhaes-alpha_01.jar - the FHAES executable
fhaes.ico - icon file for creating a shortcut to launch FHAES
fhgraphics-alpha_01.jar - the FHAES Graphics module executable
fstats2.exe - executable called by FHAES
jevent.exe - executable called by FHAES
logo20x21.gif - icon used by FHAES
readme-fhaes-alpha_01.txt - this file
WEIB.EXE - executable used by FHAES

Double-click on fhaes-alpha_01.jar in the Windows Explorer, or launch 
it from a DOS command window by entering:
   java -jar fhaes-alpha_01.jar

You can also create a shortcut to launch it in Microsoft Windows (see: 
http://support.microsoft.com/kb/140443/ for more information). 
To change the icon for the shortcut:
   right click on the shortcut and select "Properties"
   in the shortcut tab click "change icon"
   browse to the FHAES directory and select the "fhaes.ico" file

NOTE: As a best practice, and to facilitate upgrades, DO NOT save any
files to your installation directory other than the files you unzipped
from FHAES.zip. This includes input (data) and output (results) files.

-----------------------
FHAES GRAPHICS:
-----------------------
Some users might want to run the FHAES Graphics by itself, without the 
rest of FHAES - for example, because it runs on any windowing system 
platform that supports Java 1.5 or higher (e.g., Microsoft Windows, Linux, 
Macintosh etc.) 

Download the FHAES Graphics executable fhgraphics-alpha_01.jar. 
Double-click on fhgraphics-alpha_01.jar in the Windows Explorer, or 
launch it from a command window by entering:
   java -jar fhgraphics-alpha_01.jar

-----------------------
FENTER3:
-----------------------
Download FENTER3.EXE. Double-click on FENTER3.EXE in the Windows 
Explorer, or launch it from a DOS command window by entering:
   FENTER3.EXE

-----------------------
SAMPLE DATA
-----------------------
Download the samples.zip file to your hard drive and unzip it. This 
set of sample data files contains five FHX2 files (along with their 
accompanying documentation) for use with the Statistics, Graphics, 
and Epoch Analysis, and one chronology file for use with the Epoch 
Analysis. It also contains the spreadsheet and text files used in 
the fhxspreadsheetentryinfo.pdf document.

You can also use FHX data files you already have, or create your own 
in several ways.  You can use the data entry module from FHX2 
(FENTER3.EXE), try the spreadsheet and text editor approach (see
fhxspreadsheetentryinfo.pdf for instructions), or if you have a copy 
of FHX2, enter data from there. 

********************
VII. NOTES ON RUNNING FHAES
********************
1. Upon launching FHAES, you should see two menus: Main and Help.

2. The Main menu offers 6 options:
  a. Data Entry
  b. Statistics
  c. Graphics
  d. Epoch Analysis
  e. Statistics Batch
  f. Exit

3. Make your selection by clicking the appropriate option. 

4. Files Created by FHAES: Note that the files listed in a. to c. 
below will be automatically created and remain in the same folder as
the FHAES executables.

  a. log.txt is created in the application folder every time the 
Statistics or Epoch Analysis module is run. This file is used to track 
any actions taken by the user.

  b. param.txt is created in the application folder every time the 
statistics module is run. This file is used by the statistics engine.

  c. weibull.out and weibull.dat will are created in the application 
folder every time the Fire Intervals Analysis under the Statistic module 
is run. 

  d. By default, the output file from running the Statistic module will 
be created in the same folder where the input file is located, and will 
have the same name as the input file with an "out" extension, unless 
the user specifies a different location or name. When changing the name 
or location please remember these naming restrictions: no more than eight 
characters, and no spaces or special characters can be in either the
file names or directory path to the files.
  NOTE: Make sure that when running the Statistic Batch in FHAES (running 
  FHAES with several FHX files all at once), there must only be .fhx files 
  in the data directory:  no output or any other type files are permitted.

  e. When running the Fire Interval Analysis from the Statistics module,
selecting the "Create a Statistics Table" and "Create Plot File" will 
create files in the same folder as the input file(s) which will have 
the same name as the input file with "_STATS.TAB" and "_PLOT.TAB" 
appended to the end of the name, respectively. Additionally, temporary
"STATS.TAB" and "PLOT.TAB" files will be created and deleted in the 
application folder while running this analysis. NOTE the user should
NOT select this option when running the Statistics Batch in FHAES because 
only .fhx files can be in the input file folder.

  f. The output files from running the Epoch Analysis module will be 
created in the folder where the "Chronology or Reconstruction" input 
file is located, and will be named according to the Output File Prefix 
specified. Additionally, several temporary files will be created and 
deleted in the application folder while this module is running.

5. The Epoch Analysis module of FHAES has been verified to support 
the "Measurement" formats and the "Index or chronology" format for 
the "Chronology or Reconstruction" input files. Files that conform 
to these formats can be created using the FMT program distributed as 
part of the Dendrochronology Program Library (DPL) by the Laboratory 
of Tree-Ring Research (see: http://www.ltrr.arizona.edu/software.html 
for more information on the DPL). The FMT program may be downloaded 
directly at:
http://www.ltrr.arizona.edu/pub/dpl/FMT.EXE
and the documentation for it is available as part of the DPL 
documentation archive:
http://www.ltrr.arizona.edu/pub/dpl/DOCUMENT.ZIP


********************  
VIII. CONTACT INFORMATION AND HELP
********************
If you have any problems or questions, please send a message to 
firehistory@noaa.gov. The receipt of your message will be acknowledged
promptly. For comments or suggestions regarding the FHAES software, 
please send a message to FHAES discussion list at 
fhaes@lists.Colorado.EDU. To subscribe to the FHAES discussion list, 
send a message to listproc@lists.Colorado.EDU with a blank subject and
the following line:
subscribe fhaes your_name

********************
APPENDIX A. FHAES GRAPHICS FEATURES FOR A FUTURE RELEASE
********************
1) The ability to show or hide and set symbol shapes and colors for all
types of events: Fire, Injury, Life-cycle (inner-year, outer-year, pith,
bark), and major fire events.
2) The ability to show or hide events based on seasonality and 
   selectively show the event symbol.
3) The ability to explicitly set the range of years to be displayed.
4) The ability to set the tick unit of the domain axis.

********************
APPENDIX B. BACKGROUND ON THE FHAES PROJECT
********************

The original DOS-based FHX2 program written by Dr. Henri Grissino-Mayer
analyzes chronologies of fire scars developed from tree-ring data (and 
can be used to analyze chronologies of other disturbance events). The 
program, written in Pascal and using proprietary graphics software, 
provides the means to enter and store fire history data, graph and plot 
these data, statistically analyze the fire chronologies, and evaluate 
the relationship between fire occurrence and climate condition. This 
program is very widely used and considered to be the standard for fire 
history analysis, but needs to be updated. 

The goal of the redesign project is to redevelop and enhance components
of the FHX2 program, so that they are user-friendly, and easily 
accessible to a broad range of users on the Internet. Our working group 
[Elaine Kennedy Sutherland (1), Henri Grissino-Mayer (2), Wendy Gross
(3), Michael Hartman (3), Elena Velasquez (4), Connie Woodhouse (4), 
and Peter Brown (5)] is an informal collaboration of researchers 
working together on the redesigning effort. The revised system (now 
renamed FHAES: Fire History Analysis and Exploration System) is being 
written in platform-independent, open source software (for example, 
Java and JFreeChart), but to control costs and maintain a reasonable 
launch schedule some of the original PASCAL executable code will be 
retained. The new system is structured around a central graphical user 
interface that calls out to other separate components. These components
(data entry and file management, graphics, statistical analysis, climate
relationships) have been or are being written by different individuals 
and contributed to the effort. The programmer writing the central 
interface is ensuring that the components are compatible. We are using 
portal technology to deliver the system on the Internet, and the portal
is being hosted by FRAMES (Fire Research and Management Exchange System)
and the content is being managed by the National Climatic Data 
Center's Paleoclimatology Branch. 
(1) USDA Forest Service, Rocky Mountain Research Station, 
(2) University of Tennessee, Department of Geography, 
(3) NOAA National Climatic Data Center, Paleoclimatology Branch, 
(4) University of Arizona, Department of Geography and Regional 
    Development, 
(5) Rocky Mountain Tree-Ring Research, Inc. 

Working Group Responsibilities:

Project Coordination:
Elaine Kennedy Sutherland, Connie Woodhouse, Wendy Gross, and Michael 
Hartman

Scientific Direction and Consultation:
Henri Grissino-Mayer, Peter Brown, Elaine Kennedy Sutherland, and Connie
Woodhouse

Software Development:
Wendy Gross: Graphics/plotting
Elena Velasquez: Central user interface, analysis, compatibility

Web Design:
Michael Hartman, Wendy Gross, Elena Velasquez


Acknowledgments:

We wish to acknowledge the helpful suggestions and ideas of the 
following beta testers:  Don Falk, Josh Farella, Pete Fule, Tom Swetnam,
and Tyson Swetnam.

********************
APPENDIX C. CITATIONS
********************

Appropriate citations for the use of FHAES and the FHX2 components it is 
based upon include:

   Grissino-Mayer, H.D. 1995. Tree-ring reconstructions of climate and fire
   history at El Malpais National Monument, New Mexico. Ph.D. dissertation,
   The University of Arizona, Tucson. 407 pp.


   Grissino-Mayer, H.D. 1999. Modeling fire interval data from the American
   Southwest with the Weibull distribution. International Journal of
   Wildland Fire 9(1): 37-50.


   Grissino-Mayer, H.D. 2001. FHX2 - Software for analyzing temporal and
   spatial patterns in fire regimes from tree rings. Tree-Ring Research
   57(1): 115-124.

