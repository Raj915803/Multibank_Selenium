# Multibank_Selenium
Selenium automation project
# MultiBank Trading Platform – Web UI Automation Framework
# Overview
This repository contains a production-style Selenium automation framework designed to validate critical user flows on the MultiBank trading platform.
# Target Application: https://trade.mb.io
The framework follows modern automation engineering practices including:
•	Page Object Model (POM)
•	Behavior Driven Development (BDD) with Cucumber
•	Test orchestration using TestNG
•	External test data management
•	Cross-browser support
•	Explicit wait strategies
•	Automated reporting and screenshot capture
The framework focuses on validating the most important UI components of the MultiBank trading interface.

# Technology Stack
Tool			          | Purpose
Java			          | Programming language
Selenium WebDriver	| Browser automation
Cucumber		        | BDD test design
TestNG			        | Test execution
Maven			          | Dependency management
Jackson			        | JSON test data parsing
WebDriverManager	  | Browser driver setup
Reports			        | Test reporting

# Framework Architecture
The framework follows a layered architecture.
Feature Files
↓
Step Definitions
↓
Page Object Model
↓
Utility Classes
↓
WebDriver

# Why Page Object Model?

•	Improves maintainability
•	Reduces duplicated code
•	Separates test logic from UI locators

# Test Coverage
The framework validates the following areas:

# Navigation Validation
Verify that:
•	Top navigation menu is displayed
•	Navigation items function correctly
•	Page transitions work properly

# Trading Functionality
Validate that:
•	Spot trading page loads successfully
•	Trading pairs are displayed correctly
•	Data layout is correct
Example trading pairs validated:
BTC/USDT
ETH/USDT

# Content Validation
Verify:
•	Marketing banners appear at the bottom
•	Download links redirect to app stores
•	About → Why MultiBank page renders correctly

# Test Data Management
All test data is externalized in JSON.

# Location:
src/test/resources/testdata/multibankData.json

# Benefits:
•	No hard-coded data
•	Easy updates
•	Supports multiple environments

# Configuration
Configuration is stored in:
src/test/resources/config/config.properties

# Setup Instructions
# 1. Install Prerequisites
# Install:
•	Java JDK 11 or higher
•	Maven
•	Git
•	Chrome / Firefox browser
•	Eclipse or IntelliJ IDE

# 2. Clone Repository
git clone 

# 3. Import Project
Open IDE
Import → Maven Project
Select the project folder.

# 4. Install Dependencies
Run:
mvn clean install
This will download all required dependencies.

# Running Tests Locally

# Run tests using TestNG.

Right Click → testng.xml
Run As → TestNG Suite
Or via Maven:
mvn test

# Cross Browser Testing
Change browser in config.properties.
Example:
browser=chrome
browser=firefox
Run the suite again to execute in another browser.

# Test Reports
After execution reports are generated under:
reports/

# Example report:
reports/cucumber-report.html

# This report contains:
•	Passed tests
•	Failed tests
•	Execution time
•	Step logs

# Screenshot Capture
Screenshots are captured automatically on failure.

# Project Highlights
Clean architecture
Data driven testing
Explicit wait strategy
Cross browser execution
Production ready design

# Project Structure:

multibank-ui-automation│├── pom.xml├── testng.xml├── README.md│├── src│├── main│ ├── java│ ││ │ ├── base│ │ │ └── BaseTest.java│ │ ││ │ ├── constants│ │ │ └── FrameworkConstants.java│ │ ││ │ ├── driver│ │ │ └── DriverManager.java│ │ ││ │ ├── pages│ │ │ ├── HomePage.java│ │ │ ├── NavigationPage.java│ │ │ ├── TradingPage.java│ │ │ ├── AboutPage.java│ │ │ └── DownloadPage.java│ │ ││ │ └── utils│ │ ├── ConfigReader.java│ │ ├── WaitUtils.java│ │ ├── JsonDataReader.java│ │ ├── APILoginManager.java│ │ ├── SessionManager.java│ │ ├── ScreenshotUtil.java│ │ └── RetryAnalyzer.java││ └── resources│ ├── config│ │ └── config.properties│ ││ └── testdata│ └── multibankData.json│├── test│ ├── java│ ││ │ ├── runners│ │ │ └── TestRunner.java│ │ ││ │ ├── stepdefinitions│ │ │ ├── Hooks.java│ │ │ ├── NavigationSteps.java│ │ │ ├── TradingSteps.java│ │ │ └── ContentSteps.java│ │ ││ │ └── listeners│ │ └── TestListener.java││ └── resources│ └── features│ ├── navigation.feature│ ├── trading.feature│ └── content.feature│└── reports
