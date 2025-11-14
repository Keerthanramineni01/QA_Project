# 🚀 Selenium E2E Automation Framework  
### Java • Selenium WebDriver • TestNG • Cucumber BDD • Page Object Model

This project is a complete **end-to-end UI automation framework** for the SauceDemo web application.  
It validates the entire **checkout workflow** using industry-standard tools and patterns such as Selenium WebDriver, Cucumber BDD, TestNG, and Page Object Model (POM).

---

## ⭐ Overview

This framework automates:

- Launching the SauceDemo site  
- Logging in  
- Adding products to cart  
- Proceeding to checkout  
- Entering user details  
- Completing the order  
- Verifying confirmation message  

It showcases a real-world automation framework design suitable for **SDET roles, QA automation interviews, or portfolio projects**.

---

## 🧰 Tech Stack

- **Java 21**
- **Selenium WebDriver 4**
- **Cucumber (BDD)**
- **TestNG**
- **Page Object Model (POM)**
- **WebDriverManager**
- **Extent Reports**
- **Maven**

---

## 📁 Project Structure

```
src/
 ├── main/java/seleniumE2EProject
 │     ├── pages/               # Page Object Model classes
 │     └── utils/               # Extent report setup
 │
 └── test/java/seleniumE2EProject
       ├── tests/               # BaseTest + Runner + Listener
       └── stepDefinitions/     # Cucumber steps

src/test/resources/feature/
    CheckoutFlow.feature         # Gherkin test file
```

---

## 📜 Example Feature (BDD)

```gherkin
Scenario: Complete an end-to-end checkout
  Given the user launches the SauceDemo application
  When the user logs in with valid credentials
  And the user adds two products to the cart
  And the user proceeds to checkout
  And the user enters checkout details
  Then the user should see the order confirmation message
```

---

## ▶️ How to Run Tests

### **1. Run using IDE**
Right-click:
```
RunCucumberTest.java → Run As → TestNG Test
```

### **2. Run using Maven**
```
mvn clean test
```

---

## 📊 Reports

### **Extent HTML Report**
```
reports/ExtentReport_<timestamp>.html
```

### **Cucumber HTML Report**
```
target/cucumber-reports/cucumber-report.html
```

---

## 🧩 Key Framework Highlights

- Uses **BDD Gherkin syntax** for readability  
- **POM** for clean separation of UI interactions  
- **TestNG** for running Cucumber scenarios  
- **Extent Reports** for detailed execution logs  
- **Screenshot on failure** via TestNG Listener  
- Scalable structure suitable for real automation projects  

---

## 🎯 Why This Project Is Valuable

This project demonstrates:

✔ Automated end-to-end test flow  
✔ Ability to design scalable frameworks  
✔ Experience with Selenium + BDD + TestNG  
✔ Real-world reporting and POM implementation  
✔ Strong understanding of automation architecture  

Perfect for SDET interviews, GitHub portfolio, or freelance automation work.

---

## 🤝 Contributing

Feel free to fork this repo and submit improvements.

---

## ⭐ Support

If you like this project, giving the repo a **star** helps a lot!

<img width="2878" height="1368" alt="Screenshot 2025-11-14 145619" src="https://github.com/user-attachments/assets/4329a9c8-6b36-4c64-8baf-b8e5acee15b5" />

