# Income Tax Microservice
https://github.com/mhafizkn/taxCalculator

## Short description
- The system is intend to Calculate income tax based on annual income with a list of posbbile tax claim options.

## Getting started
### Pre-requisites
1. A Java™ Development Kit (JDK) - Recommended version 17.(https://www.oracle.com/my/java/technologies/downloads/#jdk17-windows) <br/>
2. An Integrated Developer Environment (IDE) - Recommended [Intellij IDEA](https://www.jetbrains.com/idea/) <br/>

### How to run
- Clone the repository: `branch main`.

#### As Maven plugin
1. Open the application using IDE.
2. Run the command: `mvn spring-boot:run`.
3. Open a web browser and enter `http://localhost:8080/tax?annualIncome={annualIncome}`.

#### As Package Application
1. Run the command: `java -jar target/TaxCalculator-0.0.1-SNAPSHOT.jar`
2. To rebuild the package, execute the command: `mvn clean package`
3. Go to `http://localhost:8080/tax?annualIncome={value}` to use the microservice

### RESTful API Endpoint
```
GET /tax?annualIncome={annualIncome}
Accept: application/json
Content-Type: application/json

{
    "taxAmount": 58950.0,
    "taxSlab": "250,001.00 - 400,000.00",
    "taxClaimOptions": [
        "Self and dependent (RM9000)",
        "Medical Expenses for parents (RM8000)",
        "Basic Supporting Equipment (RM6000)",
        "Disabled Individual (RM6000)",
        "Education fees (RM7000)",
        "Medical Expenses on Serious Disease (RM8000)",
        "Lifestyle (RM2500)",
        "Lifestyle on personal computer, smartphone or table (RM2500)",
        "Breastfeeding Equipment (RM1000)",
        "Child Care Fee (RM3000)",
        "SSPN (RM8000)",
        "Husband/ Wife/ Alimony Payments (RM4000)",
        "Disabled spouse (RM5000)",
        "Education fee for children (RM8000)",
        "Disabled Child (RM6000)",
        "EPF (RM7000)",
        "PRS (RM3000)",
        "Education or Medical Insurance (RM3000)",
        "SOCSO (RM250)",
        "Lifestyle on Sport Equipment (RM500)",
        "Domestic Travel (RM1000)"
    ]
}

RESPONSE: HTTP 200 (OK)
Location header: http://localhost:8080/tax?annualIncome=300000
```
