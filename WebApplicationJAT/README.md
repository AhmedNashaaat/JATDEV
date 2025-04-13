# Web Test Automation Framework

A Selenium WebDriver framework using **Maven, TestNG, Java, Page Object Model (POM), and JSON data-driven testing** for scalable web automation.

---

## 🛠️ Tech Stack
- **Language**: Java 24
- **Build Tool**: Maven
- **Test Framework**: TestNG
- **Web Automation**: Selenium 4.x
- **Design Pattern**: Page Object Model (POM)
- **Data-Driven**: JSON files


---

## 📂 Project Structure
```bash
WebApplicationJAT/
├── .idea/                  # IntelliJ IDEA configuration files
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── Pages/      # Page Object Model (POM) classes
│   │   │       ├── BasePage.java
│   │   │       ├── BillingAddressPage.java
│   │   │       ├── CartPage.java
│   │   │       ├── CheckoutPage.java
│   │   │       ├── HomePage.java
│   │   │       ├── LoginPage.java
│   │   │       ├── MyAccountPage.java
│   │   │       ├── PaymentPage.java
│   │   │       ├── ProductPage.java
│   │   │       └── RegistrationPage.java
│   │   └── resources/      # Configuration files (e.g., properties, drivers)
│   │
│   └── test/
│       ├── java/
│       │   ├── Data/       # Data-driven testing utilities
│       │   │   ├── jsonDataReader.java
│       │   │   └── UserData.json
│       │   │
│       │   └── Tests/      # TestNG test classes
│       │       ├── BaseTest.java
│       │       ├── BillingAddressTest.java
│       │       ├── CheckoutTest.java
│       │       ├── LoginTest.java
│       │       ├── PaymentTest.java
│       │       ├── ProductTest.java
│       │       └── RegistrationTest.java
│       │
│       └── resources/      # TestNG XML suites
│
├── target/                 # Maven build output directory
└── pom.xml                 # Maven dependencies and plugins