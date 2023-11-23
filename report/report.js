$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/amazon.feature");
formatter.feature({
  "name": "To validate the signin functionality of amazon application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To validate the signin with valid email id or mobile number and password",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "To launch the browser and maximize the window",
  "keyword": "Given "
});
formatter.match({
  "location": "Amazonsignin.to_launch_the_browser_and_maximize_the_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To lauch the url of amazon sigin page",
  "keyword": "When "
});
formatter.match({
  "location": "Amazonsignin.to_lauch_the_url_of_amazon_sigin_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the Signin button",
  "keyword": "And "
});
formatter.match({
  "location": "Amazonsignin.to_click_the_Signin_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass the valid email id or mobile number in email field",
  "keyword": "And "
});
formatter.match({
  "location": "Amazonsignin.to_pass_the_valid_email_id_or_mobile_number_in_email_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the continue button",
  "keyword": "And "
});
formatter.match({
  "location": "Amazonsignin.to_click_the_continue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass the valid password in password field",
  "keyword": "And "
});
formatter.match({
  "location": "Amazonsignin.to_pass_the_valid_password_in_password_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the signin button",
  "keyword": "And "
});
formatter.match({
  "location": "Amazonsignin.to_click_the_signin_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Amazonsignin.to_close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "To validate the signin fuctionality of amazon application",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user has to launch the browser and maximize the window",
  "keyword": "Given "
});
formatter.step({
  "name": "user has to launch the url of amazon signin page",
  "keyword": "When "
});
formatter.step({
  "name": "user has to click the signin button",
  "keyword": "And "
});
formatter.step({
  "name": "user has to pass the valid data\"\u003cemaildata\u003e\" in email field",
  "keyword": "And "
});
formatter.step({
  "name": "user has to click the continue button",
  "keyword": "And "
});
formatter.step({
  "name": "user has to pass the valid data\"\u003cpassword\u003e\" in password field",
  "keyword": "And "
});
formatter.step({
  "name": "user has to click signin button",
  "keyword": "And "
});
formatter.step({
  "name": "user has to close the browser",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "emaildata",
        "password"
      ]
    },
    {
      "cells": [
        "ayuvi2001@gmail.com",
        "Yuva@2011"
      ]
    },
    {
      "cells": [
        "9600575685",
        "123456789"
      ]
    },
    {
      "cells": [
        "9940833364",
        "yuvaraj"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To validate the signin fuctionality of amazon application",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user has to launch the browser and maximize the window",
  "keyword": "Given "
});
formatter.match({
  "location": "PositiveNegative.user_has_to_launch_the_browser_and_maximize_the_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to launch the url of amazon signin page",
  "keyword": "When "
});
formatter.match({
  "location": "PositiveNegative.user_has_to_launch_the_url_of_amazon_signin_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to click the signin button",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveNegative.user_has_to_click_the_signin_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to pass the valid data\"ayuvi2001@gmail.com\" in email field",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveNegative.user_has_to_pass_the_valid_data_in_email_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to click the continue button",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveNegative.user_has_to_click_the_continue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to pass the valid data\"Yuva@2011\" in password field",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveNegative.user_has_to_pass_the_valid_data_in_password_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to click signin button",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveNegative.user_has_to_click_signin_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "PositiveNegative.user_has_to_close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate the signin fuctionality of amazon application",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user has to launch the browser and maximize the window",
  "keyword": "Given "
});
formatter.match({
  "location": "PositiveNegative.user_has_to_launch_the_browser_and_maximize_the_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to launch the url of amazon signin page",
  "keyword": "When "
});
formatter.match({
  "location": "PositiveNegative.user_has_to_launch_the_url_of_amazon_signin_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to click the signin button",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveNegative.user_has_to_click_the_signin_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to pass the valid data\"9600575685\" in email field",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveNegative.user_has_to_pass_the_valid_data_in_email_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to click the continue button",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveNegative.user_has_to_click_the_continue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to pass the valid data\"123456789\" in password field",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveNegative.user_has_to_pass_the_valid_data_in_password_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to click signin button",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveNegative.user_has_to_click_signin_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "PositiveNegative.user_has_to_close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate the signin fuctionality of amazon application",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user has to launch the browser and maximize the window",
  "keyword": "Given "
});
formatter.match({
  "location": "PositiveNegative.user_has_to_launch_the_browser_and_maximize_the_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to launch the url of amazon signin page",
  "keyword": "When "
});
formatter.match({
  "location": "PositiveNegative.user_has_to_launch_the_url_of_amazon_signin_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to click the signin button",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveNegative.user_has_to_click_the_signin_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to pass the valid data\"9940833364\" in email field",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveNegative.user_has_to_pass_the_valid_data_in_email_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to click the continue button",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveNegative.user_has_to_click_the_continue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to pass the valid data\"yuvaraj\" in password field",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveNegative.user_has_to_pass_the_valid_data_in_password_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to click signin button",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveNegative.user_has_to_click_signin_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "PositiveNegative.user_has_to_close_the_browser()"
});
formatter.result({
  "status": "passed"
});
});