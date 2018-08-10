$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 2,
  "name": "Sign In",
  "description": "As an employee of the company\nI want to login to application with my credentails\nIn order to use the application features.",
  "id": "sign-in",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Login"
    }
  ]
});
formatter.background({
  "line": 7,
  "name": "User navigates to Application URL",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "I am on the Login page URL \"http://https://www.facebook.com/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I should see Log In Page",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 12,
  "name": "Sign In with valid credential",
  "description": "",
  "id": "sign-in;sign-in-with-valid-credential",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "I enter username as \"admin\"",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I enter password as \"password\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "click on login button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 17,
      "value": "#    Then I sould see application homepage"
    },
    {
      "line": 18,
      "value": "#    And I sould see administrator text message on home Page"
    }
  ],
  "line": 20,
  "name": "Sign In with valid credentials",
  "description": "",
  "id": "sign-in;sign-in-with-valid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 19,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "I enter username as \"\u003cuserName\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "I enter password as \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "click on login button",
  "keyword": "And "
});
formatter.examples({
  "comments": [
    {
      "line": 25,
      "value": "#    Then I sould see application homepage"
    },
    {
      "line": 26,
      "value": "#    And I sould see administrator text message on home Page"
    }
  ],
  "line": 27,
  "name": "",
  "description": "",
  "id": "sign-in;sign-in-with-valid-credentials;",
  "rows": [
    {
      "cells": [
        "userName",
        "password"
      ],
      "line": 28,
      "id": "sign-in;sign-in-with-valid-credentials;;1"
    }
  ],
  "keyword": "Examples"
});
});