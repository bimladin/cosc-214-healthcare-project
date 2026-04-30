# COSC 214 – Data Structures & Algorithms Project

##  Healthcare Data Structure Performance Analysis

##  Team Members
- Member 1: (ArrayList Implementation) :
- Member 2: (LinkedList Implementation) : Robert Johnson
- Member 3: (HashMap + PriorityQueue + Benchmarking) : Abimbola Adedeji

---

## 📌 Project Overview

This project analyzes and compares the performance of different data structures using a healthcare dataset containing patient records. Each record is stored and processed using multiple data structures to evaluate efficiency in real-world operations such as insertion, search, deletion, and traversal.

The goal is to understand how data structure selection impacts system performance.

---

##  Data Structure Implementations

We implement four core data structures:

### 1. ArrayList (Dynamic Array)
- Stores patient records in sequential order
- Efficient traversal
- Slow search and deletion (O(n))

### 2. LinkedList
- Node-based structure
- Efficient insertions and deletions
- Slow search due to linear traversal

### 3. HashMap
- Uses patient ID as key
- Provides fast average-case O(1) search, insert, and delete

### 4. PriorityQueue
- Used to simulate priority-based processing (e.g., emergency patients)
- Orders patients based on priority instead of arrival order

---

##  Core Operations

Each structure supports:

- insertRecord()
- searchRecord()
- deleteRecord()
- traverseRecords()

---

##  Performance Analysis

We benchmark each structure using:
- Insert time
- Search time
- Delete time

Dataset sizes:
- 100 records
- 1,000 records
- 5,000 records
- 10,000 records

Each test is run multiple times and averaged using System.nanoTime().

---

##  Goal of the Project

To compare how different data structures perform under identical operations and understand their tradeoffs in real-world applications.

---

##  How to Run

```bash
javac Main.java
java Main
