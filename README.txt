PURPOSE:

[
Apply the design principles and patterns 
]

PERCENT COMPLETE:

[
100%
]


PARTS THAT ARE NOT COMPLETE:

[
None
]


BUGS:

[
All the corner cases uploaded on the blackboard are verified and code is validated for those cases.
]

FILES:

[
Below listed files are included with the attachment:
Total files : 41
upadhyay_shashi_subramanian_shiva/studentOrientation/src/studentOrientation/activityVerifiers/CarbonFootPrintInterface.java 				
upadhyay_shashi_subramanian_shiva/studentOrientation/src/studentOrientation/activityVerifiers/CostInterface.java					
upadhyay_shashi_subramanian_shiva/studentOrientation/src/studentOrientation/activityVerifiers/DurationInterface.java 		
upadhyay_shashi_subramanian_shiva/studentOrientation/src/studentOrientation/activityVerifiers/EffortInterface.java	
upadhyay_shashi_subramanian_shiva/studentOrientation/src/studentOrientation/activityVerifiers/ParametersAssociatedWithEachActivityInterface.java
upadhyay_shashi_subramanian_shiva/studentOrientation/src/studentOrientation/driver/Driver.java
upadhyay_shashi_subramanian_shiva/studentOrientation/src/studentOrientation/orientationSchedule/orientationSchedule.java
upadhyay_shashi_subramanian_shiva/studentOrientation/src/studentOrientation/orientationSchedule/orientationScheduleInterface.java
upadhyay_shashi_subramanian_shiva/studentOrientation/src/studentOrientation/orientationSchedule/BuyingBooks/BookPurchaseVerification.java
upadhyay_shashi_subramanian_shiva/studentOrientation/src/studentOrientation/orientationSchedule/BuyingBooks/BookStore.java
upadhyay_shashi_subramanian_shiva/studentOrientation/src/studentOrientation/orientationSchedule/BuyingBooks/BookStoreFactory.java
upadhyay_shashi_subramanian_shiva/studentOrientation/src/studentOrientation/orientationSchedule/BuyingBooks/MandoBookStore.java
upadhyay_shashi_subramanian_shiva/studentOrientation/src/studentOrientation/orientationSchedule/BuyingBooks/UniversityBookStore.java
upadhyay_shashi_subramanian_shiva/studentOrientation/src/studentOrientation/orientationSchedule/CampusTour/BusRideCampusTour.java
upadhyay_shashi_subramanian_shiva/studentOrientation/src/studentOrientation/orientationSchedule/CampusTour/CampusTour.java
upadhyay_shashi_subramanian_shiva/studentOrientation/src/studentOrientation/orientationSchedule/CampusTour/CampusTourFactory.java
upadhyay_shashi_subramanian_shiva/studentOrientation/src/studentOrientation/orientationSchedule/CampusTour/CampusTourVerification.java
upadhyay_shashi_subramanian_shiva/studentOrientation/src/studentOrientation/orientationSchedule/CampusTour/OnFootCampusTour.java
upadhyay_shashi_subramanian_shiva/studentOrientation/src/studentOrientation/orientationSchedule/DormSelection/DormSelection_Online.java
upadhyay_shashi_subramanian_shiva/studentOrientation/src/studentOrientation/orientationSchedule/DormSelection/DormSelection_Person.java
upadhyay_shashi_subramanian_shiva/studentOrientation/src/studentOrientation/orientationSchedule/DormSelection/DormSelection.java
upadhyay_shashi_subramanian_shiva/studentOrientation/src/studentOrientation/orientationSchedule/DormSelection/DormSelectionFactory.java
upadhyay_shashi_subramanian_shiva/studentOrientation/src/studentOrientation/orientationSchedule/DormSelection/DormSelectionVerification.java
upadhyay_shashi_subramanian_shiva/studentOrientation/src/studentOrientation/orientationSchedule/Registration/Registration_FormSubmissionRegistrar.java
upadhyay_shashi_subramanian_shiva/studentOrientation/src/studentOrientation/orientationSchedule/Registration/Registration_Online.java
upadhyay_shashi_subramanian_shiva/studentOrientation/src/studentOrientation/orientationSchedule/Registration/Registration.java
upadhyay_shashi_subramanian_shiva/studentOrientation/src/studentOrientation/orientationSchedule/Registration/RegistrationFactory.java
upadhyay_shashi_subramanian_shiva/studentOrientation/src/studentOrientation/orientationSchedule/Registration/RegistrationVerification.java
upadhyay_shashi_subramanian_shiva/studentOrientation/src/studentOrientation/OrientationWorkshop/OrientationWorkShop.java
upadhyay_shashi_subramanian_shiva/studentOrientation/src/studentOrientation/OrientationWorkshop/OrientationWorkshopInterface.java
upadhyay_shashi_subramanian_shiva/studentOrientation/src/studentOrientation/results/Results.java
upadhyay_shashi_subramanian_shiva/studentOrientation/src/studentOrientation/util/BookStoreEnum.java
upadhyay_shashi_subramanian_shiva/studentOrientation/src/studentOrientation/util/BookStorePreDefinedValues.java
upadhyay_shashi_subramanian_shiva/studentOrientation/src/studentOrientation/util/CampusTourEnum.java
upadhyay_shashi_subramanian_shiva/studentOrientation/src/studentOrientation/util/CampusTourPreDefinedValues.java
upadhyay_shashi_subramanian_shiva/studentOrientation/src/studentOrientation/util/DormEnum.java
upadhyay_shashi_subramanian_shiva/studentOrientation/src/studentOrientation/util/DormEnumPreDefinedValues.java
upadhyay_shashi_subramanian_shiva/studentOrientation/src/studentOrientation/util/Logger.java
upadhyay_shashi_subramanian_shiva/studentOrientation/src/studentOrientation/util/InputValidation.java
upadhyay_shashi_subramanian_shiva/studentOrientation/src/studentOrientation/util/RegistrationEnum.java
upadhyay_shashi_subramanian_shiva/studentOrientation/src/studentOrientation/util/RegistrationPreDefinedValues.java
upadhyay_shashi_subramanian_shiva/studentOrientation/src/studentOrientation/validation/ErrorEnum.java
upadhyay_shashi_subramanian_shiva/studentOrientation/src/studentOrientation/validation/InputValidation.java				
upadhyay_shashi_subramanian_shiva/studentOrientation/build.xml
upadhyay_shashi_subramanian_shiva/studentOrientation/README.txt									 			
]

SAMPLE OUTPUT:

[
	 [java] ********************************************************************
     [java] ************************Consolidate Report**************************
     [java] ********************************************************************
     [java] Total Cost spent           			=	2432.0 $ 
     [java] Total Duration spent       			=	118.0 Minutes 
     [java] Total CarbonFootPrintValue 			=	218.0 tonnes of CO2 
     [java] Total Effort in total_calories   	=	139.0 Calories 
     [java] ********************************************************************
]
 
CHOICE OF DESIGN PATTERN:

[
Builder Pattern : 
To implement the orientation checklist need to be done as a part of the Orientation Schedule
Reason of implementation : mentioned four activities are required for the completion of orientation.
Simple Factory	: To create the type of specific activities. This features provides the flexibility to introduce new specifics of same activity.
]

TO UNTAR:

[
Untar the files using the below mentioned command. 
Command to untar : tar -xvzf  upadhyay_shashi_subramanian_shiva_assign3.tar.gz
]

TO COMPILE:

[

Go to upadhyay_shashi_subramanian_shiva folder using below command
Command :  cd upadhyay_shashi_subramanian_shiva/studentOrientation/

Please compile as : ant compile_all

]

TO RUN:

[
Go to upadhyay_shashi_subramanian_shiva folder using below command
Command :  cd upadhyay_shashi_subramanian_shiva/studentOrientation/
And then run below mentioned command

Please run as     : ant run

If already inside upadhyay_shashi_subramanian_shiva/studentOrientation/ then directly command : ant run
]

TO CREATE JAVADOCS:

[
Go to upadhyay_shashi_subramanian_shiva folder using below command
Command :  cd upadhyay_shashi_subramanian_shiva/studentOrientation/
And then run below mentioned command

Please run as     : ant create_javadocs

If already inside upadhyay_shashi_subramanian_shiva/studentOrientation/ then directly execute : ant create_javadocs

]



EXTRA CREDIT:

[
N/A
]


BIBLIOGRAPHY:

[
Below websites were referred for the code.
http://crunchify.com/why-and-for-what-should-i-use-enum-java-enum-examples/
http://tutorials.jenkov.com/java/enums.html
]

ACKNOWLEDGEMENT:

[
During coding, websites mentioned in the Bibliography section were being referred.
]

