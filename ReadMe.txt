To run this test you will need the testNG eclipse plugin.
To get testNG:

1. Open Eclipse
2. Click on help
3. Click on eclipse marketplace
4. Search for testNg
5. Install testNg for Eclipse


I have included chrome driver in the bin folder but the path to it needs to be set in
the @BeforeTest test hook located in TakeHomeTest.java

The path to Selenium will also need to be set and I have included it in the lib folder
1. Click on project
2. Click on properties
3. Click on java build path
4. Click on libraries tab
5. Add Eternal JARs
6. Set the path to the selenium-server-standalone-3.8.0.jar in the lib folder


Once the project is set up open the TakeHomeTest.java code.
Next click on run > run as > TestNg Test


=======================================

About the framework setup:
Page objects are located in src/Map
src/Nav contains code to navigate around a page, including methods to make navigation easier (example the login method)
src/Test contains the actual tests and assertions.

