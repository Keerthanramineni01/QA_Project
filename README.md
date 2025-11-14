🚀 Selenium E2E Automation Framework  
Java • Selenium WebDriver • TestNG • Cucumber BDD • Page Object Model

This project is a complete end-to-end UI automation framework for the SauceDemo web application.  
It validates the entire checkout workflow using industry-standard tools and patterns such as Selenium WebDriver, Cucumber BDD, TestNG, and Page Object Model (POM).

---

⭐ **Overview**  
This framework automates:

- Launching the SauceDemo site  
- Logging in  
- Adding products to cart  
- Proceeding to checkout  
- Entering user details  
- Completing the order  
- Verifying confirmation message  

It showcases a real-world automation framework design suitable for SDET roles, QA automation interviews, or portfolio projects.

---

🧰 **Tech Stack**
- Java 21  
- Selenium WebDriver 4  
- Cucumber (BDD)  
- TestNG  
- Page Object Model (POM)  
- WebDriverManager  
- Extent Reports  
- Maven  

---

📁 **Project Structure**
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

📜 **Example Feature (BDD)**
```
Scenario: Complete an end-to-end checkout
  Given the user launches the SauceDemo application
  When the user logs in with valid credentials
  And the user adds two products to the cart
  And the user proceeds to checkout
  And the user enters checkout details
  Then the user should see the order confirmation message
```

---


📊 **Reports**

**Extent HTML Report**
```
reports/ExtentReport_<timestamp>.html
```

**Cucumber HTML Report**
```
target/cucumber-reports/cucumber-report.html
```

---

## 🚀 CI/CD Integration with Jenkins, Headless Mode & GitHub Webhooks

This project is fully integrated with **Jenkins CI** and automatically runs the tests whenever code is pushed to GitHub.

### 🧪 Headless Chrome Execution  
The Jenkins environment cannot display a UI window, so Chrome runs in **headless mode**:

- Fast execution  
- Stable in CI environments  
- No GUI requirements  

Headless mode is configured via:
```
--headless=new
--disable-gpu
--no-sandbox
--disable-dev-shm-usage
```

### 🔗 GitHub Webhooks + ngrok (CI Triggering)
Because GitHub cannot call `localhost` webhooks, I exposed Jenkins using **ngrok**, which provides a secure public URL.

Steps implemented:

1. Ran ngrok  
   ```
   ngrok http 9<img width="2880" height="1800" alt="Screenshot (1)" src="https://github.com/user-attachments/assets/ae683311-cb0f-4a30-90d8-4dfdc0c5ff73" />
090
   ```
2. Copied the generated public URL (example):  
   ```
   https://<random>.ngrok-free.app
   ```
3. Added this as GitHub Webhook URL:  
   ```
   https://<random>.ngrok-free.app/github-webhook/
   ```
4. Enabled **Build Trigger → GitHub hook trigger for GITScm polling**

💡 Result:  
Every push to GitHub automatically triggers Jenkins → Maven → Cucumber execution.

### 🛠 Jenkins Build Command
Jenkins uses a custom Maven profile to run only the Cucumber test runner:

```
clean test -P runCucumber
```

🔁 Fully automated CI pipeline:
GitHub Push → Webhook → Jenkins → Headless Selenium → Test Reports

---

🧩 **Key Framework Highlights**
- Uses BDD Gherkin syntax for readability  
- POM for clean separation of UI interactions  
- TestNG for running Cucumber scenarios  
- Extent Reports for detailed execution logs  
- Screenshot on failure via TestNG Listener  
- Scalable structure suitable for real automation projects  

---

🎯 **Why This Project Is Valuable**
This project demonstrates:

✔ Automated end-to-end test flow  
✔ Ability to design scalable frameworks  
✔ Experience with Selenium + BDD + TestNG  
✔ Real-world reporting and POM implementation  
✔ Strong understanding of automation architecture  

Perfect for SDET interviews, GitHub portfolio, or freelance automation work.

---

🤝 **Contributing**
Feel free to fork this repo and submit improvements.

⭐ **Support**
If you like this project, giving the repo a star helps a lot!
<img width="2797" height="1401" alt="Screenshot 2025-11-14 164408" src="https://github.com/user-attachments/assets/490fccc3-c002-410c-a8ec-c76d241225d5" />
<img width="2878" height="1368" alt="Screenshot 2025-11-14 145619" src="https://github.com/user-attachments/assets/e99987e2-485b-41cf-9ba9-cf85422e4ec2" />



