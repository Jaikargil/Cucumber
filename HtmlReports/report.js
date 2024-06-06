$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:/C:/Users/jaika/eclipse-workspace/CucumberDemo/src/test/resources/GoogleSearch/facebook.feature");
formatter.feature({
  "name": "Login to facebook",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Username and password validation",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Browser Conf",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.browser_Conf()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Browser Launch",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.browser_Launch()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Username",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Password",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click login",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.click_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close facebook",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.close_facebook()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "To provide bulk value to email data and password data",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "To configure the application",
  "keyword": "Given "
});
formatter.step({
  "name": "To launch the application",
  "keyword": "When "
});
formatter.step({
  "name": "To pass valid and invalid \"\u003cemailValue\u003e\" on email textbox",
  "keyword": "And "
});
formatter.step({
  "name": "To pass valid and invalid \"\u003cpasswordValue\u003e\" on password textbox",
  "keyword": "And "
});
formatter.step({
  "name": "Enter login",
  "keyword": "And "
});
formatter.step({
  "name": "Quit the application",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "emailValue",
        "passwordValue"
      ]
    },
    {
      "cells": [
        "jai@gmail.com",
        "1123457896"
      ]
    },
    {
      "cells": [
        "test@gmail.com",
        "test@123"
      ]
    },
    {
      "cells": [
        "chennai@gmail.com",
        "sdfskhdv"
      ]
    },
    {
      "cells": [
        "smart@gmail.com",
        "Smart@678"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To provide bulk value to email data and password data",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "To configure the application",
  "keyword": "Given "
});
formatter.match({
  "location": "FbBulkExecution.to_configure_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To launch the application",
  "keyword": "When "
});
formatter.match({
  "location": "FbBulkExecution.to_launch_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass valid and invalid \"jai@gmail.com\" on email textbox",
  "keyword": "And "
});
formatter.match({
  "location": "FbBulkExecution.to_pass_valid_and_invalid_on_email_textbox(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass valid and invalid \"1123457896\" on password textbox",
  "keyword": "And "
});
formatter.match({
  "location": "FbBulkExecution.to_pass_valid_and_invalid_on_password_textbox(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter login",
  "keyword": "And "
});
formatter.match({
  "location": "FbBulkExecution.enter_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Quit the application",
  "keyword": "Then "
});
formatter.match({
  "location": "FbBulkExecution.quit_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To provide bulk value to email data and password data",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "To configure the application",
  "keyword": "Given "
});
formatter.match({
  "location": "FbBulkExecution.to_configure_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To launch the application",
  "keyword": "When "
});
formatter.match({
  "location": "FbBulkExecution.to_launch_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass valid and invalid \"test@gmail.com\" on email textbox",
  "keyword": "And "
});
formatter.match({
  "location": "FbBulkExecution.to_pass_valid_and_invalid_on_email_textbox(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass valid and invalid \"test@123\" on password textbox",
  "keyword": "And "
});
formatter.match({
  "location": "FbBulkExecution.to_pass_valid_and_invalid_on_password_textbox(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter login",
  "keyword": "And "
});
formatter.match({
  "location": "FbBulkExecution.enter_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Quit the application",
  "keyword": "Then "
});
formatter.match({
  "location": "FbBulkExecution.quit_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To provide bulk value to email data and password data",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "To configure the application",
  "keyword": "Given "
});
formatter.match({
  "location": "FbBulkExecution.to_configure_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To launch the application",
  "keyword": "When "
});
formatter.match({
  "location": "FbBulkExecution.to_launch_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass valid and invalid \"chennai@gmail.com\" on email textbox",
  "keyword": "And "
});
formatter.match({
  "location": "FbBulkExecution.to_pass_valid_and_invalid_on_email_textbox(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass valid and invalid \"sdfskhdv\" on password textbox",
  "keyword": "And "
});
formatter.match({
  "location": "FbBulkExecution.to_pass_valid_and_invalid_on_password_textbox(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter login",
  "keyword": "And "
});
formatter.match({
  "location": "FbBulkExecution.enter_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Quit the application",
  "keyword": "Then "
});
formatter.match({
  "location": "FbBulkExecution.quit_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To provide bulk value to email data and password data",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "To configure the application",
  "keyword": "Given "
});
formatter.match({
  "location": "FbBulkExecution.to_configure_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To launch the application",
  "keyword": "When "
});
formatter.match({
  "location": "FbBulkExecution.to_launch_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass valid and invalid \"smart@gmail.com\" on email textbox",
  "keyword": "And "
});
formatter.match({
  "location": "FbBulkExecution.to_pass_valid_and_invalid_on_email_textbox(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass valid and invalid \"Smart@678\" on password textbox",
  "keyword": "And "
});
formatter.match({
  "location": "FbBulkExecution.to_pass_valid_and_invalid_on_password_textbox(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter login",
  "keyword": "And "
});
formatter.match({
  "location": "FbBulkExecution.enter_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Quit the application",
  "keyword": "Then "
});
formatter.match({
  "location": "FbBulkExecution.quit_the_application()"
});
formatter.result({
  "status": "passed"
});
});