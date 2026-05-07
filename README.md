# 🎟️ StayBook — Movie Ticket Booking & Seat Reservation System

A scalable and backend-focused movie ticket booking application developed using Java Spring Boot. The system is designed to manage real-world booking scenarios including concurrent seat reservations, payment verification, waitlist management, asynchronous notifications, and Redis caching.

This project demonstrates backend architecture, transaction management, secure payment workflows, and scalable API design inspired by modern ticket booking platforms.

---

# 🚀 Features

## 🔐 Authentication & Security
- JWT Authentication (Access + Refresh Tokens)
- Secure login and signup system
- Role-based authorization
- Protected REST APIs

---

## 🎬 Movies & Shows
- Browse movies by city and genre
- Search available shows with filters
- Paginated API responses
- Real-time seat availability tracking

---

## 🎟️ Booking System
- Seat reservation with concurrency handling
- Automatic seat lock mechanism
- Booking confirmation and cancellation
- Stripe payment gateway integration
- Refund support on cancelled bookings

---

## ⏱️ Seat Lock Expiry
- Seats are temporarily locked during payment
- Automatic release of expired locks after timeout
- Scheduled cleanup using Spring Scheduler

---

## 📋 Waitlist System
- Join waitlist for sold-out shows
- Queue position tracking
- Automatic notifications when seats become available

---

## 📧 Notification Service
- Booking confirmation emails
- Cancellation notifications
- Waitlist alerts
- Asynchronous email handling using Spring Events

---

## 📊 Admin Analytics
- Revenue reports
- Occupancy analysis
- Peak booking hours
- Top-performing movies
- Venue-based analytics

---

# 🧠 Key Technical Concepts

- Pessimistic Database Locking
- Spring Application Events
- Asynchronous Processing (`@Async`)
- Redis Caching
- Stripe Webhook Verification
- Scheduled Background Jobs
- REST API Design
- Transaction Management

---

# 🛠️ Tech Stack

| Category | Technology |
|---|---|
| Language | Java 17 |
| Framework | Spring Boot 3 |
| Security | Spring Security + JWT |
| Database | PostgreSQL |
| ORM | Hibernate / Spring Data JPA |
| Cache | Redis |
| Payment Integration | Stripe |
| Email Service | JavaMailSender |
| Build Tool | Maven |
| Utilities | Lombok, ModelMapper |

---

# 📡 API Modules

## Authentication APIs
- Signup
- Login
- Refresh Token

## Movie APIs
- Browse Movies
- Movie Details
- Movie Management

## Show APIs
- Search Shows
- Show Details
- Seat Availability

## Booking APIs
- Initiate Booking
- Payment Processing
- Booking Status
- Cancel Booking

## Waitlist APIs
- Join Waitlist
- Leave Waitlist
- Queue Position

## Analytics APIs
- Revenue Reports
- Occupancy Reports
- Peak Hours Analysis

---

# 🗄️ Database Entities

- User
- Movie
- Show
- Venue
- Screen
- Seat
- Booking
- ShowSeat
- WaitlistEntry
- Notification

---

# ⚙️ Local Setup

## Prerequisites
- Java 17+
- PostgreSQL
- Redis
- Maven

---

## Clone Repository

```bash
git clone https://github.com/YOUR_USERNAME/staybook.git
cd staybook
