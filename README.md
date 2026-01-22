# EASY_KLANT

> **A Smart Customer Retention & Engagement Platform for Sole Proprietors**

EASY_KLANT is a full-stack application designed to help small business owners retain customers, improve engagement, and build long-term trust using data-driven insights, IoT integration, and intelligent analytics.

---

## 🚀 Problem Statement

Sole proprietors often lose customers due to:

* Unavailability or unusual shop timings
* Lack of communication with customers
* No customer behavior tracking
* No engagement or loyalty system

Traditional methods do not provide visibility into customer churn, loyalty, or lifetime value.

---

## 💡 Solution Overview

EASY_KLANT creates a **virtual market** between business owners and customers by:

* Connecting customers directly with shop owners
* Sending real-time shop updates and offers
* Tracking customer purchases and behavior
* Predicting churn rate and lifetime value
* Using IoT sensors to display crowd status
* Allowing customer feedback and referrals

---

## 🧩 Core Features

### 👨‍💼 Owner Module

* Register and manage shop profile
* Add customers to virtual market
* Send notifications about timings, offers, and campaigns
* View customer analytics
* Track churn rate and CLV
* Run promotional campaigns

### 👥 Customer Module

* Register independently
* Associate with multiple shop owners
* View shop updates
* Give feedback
* Refer shops via WhatsApp

### 📊 Analytics Module

* Recency
* Frequency
* Monetary (AOV)
* Tenure
* Churn Prediction
* Customer Lifetime Value Prediction

### 🌐 IoT Integration

* Shop open/close detection via contact sensors
* Crowd density monitoring
* Live crowd status shown to customers

### 🧠 Machine Learning

* Churn prediction model
* CLV prediction model
* Behavior-based segmentation

---

## 🏗 System Architecture

```
Flutter App (Owner & Customer)
        |
Spring Boot REST API
        |
PostgreSQL Database
        |
ML Models (Python)
        |
IoT Sensors
```

---

## 🛠 Tech Stack

### Frontend

* Flutter

### Backend

* Spring Boot
* REST APIs
* JWT Authentication

### Database

* PostgreSQL

### Machine Learning

* Python
* Scikit-learn

### IoT

* Contact Sensors
* Crowd Sensors

### Tools

* Docker
* Git
* Postman

---

## 📂 Database Highlights

### Customer Table

* id
* name
* email
* phone
* customer_to (owner id)

### Purchases Table

* productName
* purchaseDate
* amount
* recency (transient)
* frequency (transient)
* averageOrderValue (transient)
* tenure (transient)

---

## 🔐 Security

* JWT based authentication
* Role based access
* Secure API endpoints
* Input validation

---

## 📈 Business Impact

* Reduces customer churn
* Increases repeat visits
* Improves customer trust
* Builds digital presence for small businesses
* Enables data-driven decision making

---

## 🏆 Innovation Highlights

* Virtual market concept
* IoT based crowd awareness
* ML based churn prediction
* Direct owner-customer connection
* Feedback driven improvement loop

---

## 🧪 Testing

* API tested using Postman
* Unit testing in Spring Boot
* UI testing in Flutter

---

## 📌 Future Enhancements

* Payment integration
* Loyalty points system
* Recommendation engine
* Voice assistant for shop owners
* Blockchain based transaction trust

---

## 👨‍💻 Developer

**Hariharan N**
B.Tech CSBS, PSG Institute of Technology and Applied Research
Email: [harinatraj204@gmail.com](mailto:harinatraj204@gmail.com)
LinkedIn: [https://www.linkedin.com/in/hari-natraj-348420263/](https://www.linkedin.com/in/hari-natraj-348420263/)

---

## 📄 License

This project is developed for academic and innovation purposes. All rights reserved.
