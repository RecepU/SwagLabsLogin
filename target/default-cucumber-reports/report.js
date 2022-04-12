$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src\\test\\resources\\features\\login.feature");
formatter.feature({
  "name": "Test Login Feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Successful Login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on the Sauce Demo Login Page",
  "keyword": "Given "
});
formatter.match({
  "location": "Login_Stepdefinition.i_am_on_the_sauce_demo_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill the account information for account StandardUser into the Username field and the Password field",
  "keyword": "When "
});
formatter.match({
  "location": "Login_Stepdefinition.i_fill_the_account_information_for_account_standard_user_into_the_username_field_and_the_password_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click the Login Button",
  "keyword": "And "
});
formatter.match({
  "location": "Login_Stepdefinition.i_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am redirected to the Sauce Demo Main Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Login_Stepdefinition.i_am_redirected_to_the_sauce_demo_main_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify the App Logo exists",
  "keyword": "And "
});
formatter.match({
  "location": "Login_Stepdefinition.i_verify_the_app_logo_exists()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Failed Login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on the Sauce Demo Login Page",
  "keyword": "Given "
});
formatter.match({
  "location": "Login_Stepdefinition.i_am_on_the_sauce_demo_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill the account information for account LockedOutUser into the Username field and the Password field",
  "keyword": "When "
});
formatter.match({
  "location": "Login_Stepdefinition.i_fill_the_account_information_for_account_locked_out_user_into_the_username_field_and_the_password_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click the Login Button",
  "keyword": "And "
});
formatter.match({
  "location": "Login_Stepdefinition.i_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify the Error Message contains the text \"Sorry, this user has been locked out.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Login_Stepdefinition.i_verify_the_error_message_contains_the_text(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});