# Selenium Project

This project is a Selenium-based automation framework for testing web applications. It utilizes TestNG for test execution, Log4j for logging, and Extent Reports for test reporting.

## Table of Contents

- [Project Structure](#project-structure)
- [Prerequisites](#prerequisites)
- [Setup](#setup)

## Project Structure

- **src/main/java**: Contains the main Java source code.
  - `com.test`: Test classes go here.
  - `com.page`: Page object classes go here.
  - `com.genericUtils`: Utility classes go here.
- **src/test/resources**: Contains resources such as configuration files.
  - `log4j2.xml`: Log4j configuration file.
  - `extent-config.xml`: Extent Reports configuration file.
  - `testng.xml`: TestNG configuration file.

## Prerequisites

Ensure you have the following tools installed on your machine:

- [Java](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Maven](https://maven.apache.org/download.cgi)
- [WebDriver executables](https://www.selenium.dev/documentation/en/webdriver/driver_requirements/#quick-reference)

## Setup

1. Clone the repository:

   ```bash
   git clone https://github.com/yourusername/selenium-project.git
   cd selenium-project
