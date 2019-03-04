# AutoTestFramework

# Appium-Maven-TestNg-Allure framwork introduction
  - Support Android, iOS and Windows automation testing 
  - Support Native, Hybrid, Web based automation testing
  - Page Object model style of coding (more user oriental scenario and cases design)
  - Easy configurable for the compatibility testing for different version of the mobile os
  - Easy Reading and Nice Looking Allure test report, with failure case screenshot attached to report
  - logging for every steps of testing
  - Screenshot capturing for failed test (congfigure-able for E2E test screen capture)
  
# Appium framwork setup requirement (android testing setup)
  - Tools: Intellij, Android Studio, Appium Server
  - Envrionment: JDK1.8+, SDK17+, appium-client 1.10
  
  
  
  # Test framework structure
    - Android
      - InitialAndroid
      - LaApp
    - Core
      - AllureReport
      - AppiumDriverBuilder
      - CaptureScreen
      - TestListener
    - MobileObjects
    - TestSuite
    
 # Test Suite Setup by TestNg
 
<suite name="1stSuite">
    <test name ="ListTest">
        <classes>
            <class name ="Test1" />
        </classes>
    </test>
</suite>
 
<suite name="2ndSuite">
    <test name ="DetailTest">
        <classes>
            <class name ="Test2" />
        </classes>
    </test>
</suite>
    
    
