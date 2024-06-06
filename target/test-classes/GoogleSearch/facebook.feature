Feature: Login to facebook

Scenario: Username and password validation

Given Browser Conf

When Browser Launch

And Username

And Password

And Click login

Then Close facebook

Scenario Outline: To provide bulk value to email data and password data

Given To configure the application

When To launch the application

And To pass valid and invalid "<emailValue>" on email textbox

And To pass valid and invalid "<passwordValue>" on password textbox

And Enter login

Then Quit the application

Examples:
  | emailValue        | passwordValue |
  | jai@gmail.com     | 1123457896    |
  | test@gmail.com    | test@123      |
  | chennai@gmail.com | sdfskhdv      |
  | smart@gmail.com   | Smart@678     |