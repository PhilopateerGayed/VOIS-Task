# VOIS Automation Task

This project was developed as part of the **Vodafone Intelligent Solutions (VOIS)** technical assessment.  
It demonstrates end-to-end web automation using **Selenium (Java)** for e-commerce and bus booking scenarios.

---

## 📋 Overview

This repository includes:
- **Task 1:** Amazon website automation  
- **Task 2:** KSRTC bus booking automation  

All tests follow Selenium best practices (Page Object Model, reusable methods, data-driven design)  
and are built for maintainability and clarity.

---

## 🚀 Tasks Description

### **Task 1: Amazon Scenarios**

#### Scenario 1:
1. Open [Amazon](https://www.amazon.com/)
2. Search for “car accessories”
3. Select the first item  
4. Add it to the cart  
5. Verify that the item was added successfully  

#### Scenario 2:
1. Open **Today’s Deals**  
2. From filters, select **Headphones** and **Grocery**  
3. Choose **10 % off or more**  
4. Navigate to the **4th page**  
5. Select any item and add it to the cart  

---

### **Task 2: KSRTC Bus Booking**

1. Open [KSRTC](https://ksrtc.in/oprs-web/guest/home.do?h=1)  
2. Select **From:** CHIKKAMAGALURU → **To:** BENGALURU  
3. Choose **Arrival Date** only  
4. Click **Search for Bus**  
5. Select a seat  
6. Choose **Boarding** and **Dropping** points  
7. Fill out **Customer** and **Passenger** details  
   (Use phone number `6789125987`)  
8. Click **Make Payment** and fill all payment fields (without submitting)

---

## 🧠 Technologies Used

- **Java (JDK 11 or higher)**  
- **Selenium WebDriver**  
- **TestNG / JUnit**  
- **Maven** (dependency management)  
- **ChromeDriver**  
- **Page Object Model (POM)**  

---

## ⚙️ Project Setup

### 1️⃣ Clone the Repository
```bash
git clone https://github.com/your-username/vois-task.git
cd vois-task
