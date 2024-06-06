Feature: To login demoqa application

Scenario: To provide valid registration information in demoqa app

Given To execute the browser config

When To execute application launch

And To fill valid firstname

And To fill Valid lastname

And To fill valid emailid

And To fill valid mobileno

And To fill valid country

And To fill valid city

And To fill message

Then Close application

Scenario Outline: Demoqa application registeration

Given Config browser

When Application launch

And Pass the "<First name>" to firstname textbox

And Pass the "<Last name>" to lastname textbox

Then Close window

Examples:
  |First name| Last name |
  | jai      | kargil    |
  | virat    | Kohli     | 
  | MS       | Dhoni     |