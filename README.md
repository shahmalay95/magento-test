# Magento Automated Testing

Welcome to the Magento Automated Testing project! This repository contains a suite of automated tests to ensure the reliability and quality of our Magento-based e-commerce website. These tests have multi-browser execution capabilities. These tests are designed to help us catch regressions, verify critical functionalities, and maintain a high level of confidence in our web application.

## Table of Contents

- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
- [Running Tests](#running-tests)
- [Test Cases](#test-cases)
- [Reporting](#reporting)
- [Contributing](#contributing)
- [License](#license)

## Getting Started

### Prerequisites

Before you can run the automated tests, make sure you have the following prerequisites installed:

- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Apache Maven](https://maven.apache.org/download.cgi)
- [Web Browser Driver](https://www.selenium.dev/documentation/en/webdriver/driver_requirements/)

### Installation

1. Clone this repository to your local machine:

   ```bash
   git clone https://github.com/your-username/magento.git
   ```

2. Navigate to the project directory:

   ```bash
   cd magento
   ```

3. Build the project using Maven:

   ```bash
   mvn clean install
   ```

## Running Tests

To run the automated tests on your machine, open the repository in the IDE (eg: ECLIPSE):

```bash
1. Run the Maven command in the Terminal: maven test
OR
1. Create Maven Run/Debug Configuration
2. Select Maven command - test
3. Click on Apply button and run it
```

This will execute the test suite using TestNG and generate test reports.

## Test Cases

Our test suite includes a variety of test cases that cover different aspects of our Magento website, including:

- User authentication (login and registration) - (For this assignment Login Functionality is automated)
- Product browsing and searching
- Shopping cart functionality
- Checkout process
- User account management

Please refer to the test classes in the `src/test/java/magento` directory for detailed test case implementations.

## Reporting

We use Extent Reports for test reporting. After running the tests, you can find the HTML test report in the `target/reports` directory. Open `extent-report.html` in your web browser to view the test results. Also, in the test-output folder you can find Emailable Test Report as `test-output/emailable-report.html`



## Contributing

We welcome contributions from the community. If you find issues, have suggestions, or want to contribute new test cases, please follow these steps:

1. Fork the repository.
2. Create a new branch for your changes: `git checkout -b feature/your-feature`.
3. Commit your changes: `git commit -m 'Add your feature or fix'`.
4. Push your branch to your fork: `git push origin feature/your-feature`.
5. Create a pull request in this repository.

Our team will review your pull request, provide feedback, and merge it if it meets our quality standards.

## License

This project is written for PathFactory Assignment
