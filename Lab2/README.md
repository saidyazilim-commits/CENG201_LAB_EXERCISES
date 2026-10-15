# CENG201 - Software Engineering Lab Exercises

This repository contains weekly laboratory assignments and exercises completed for the CENG201 course.

---

## 📑 Lab Directory

| Lab | Topic | Primary Concepts | Status |
| :--- | :--- | :--- | :--- |
| **[Lab 1](./Lab1)** | OOP Foundations & Access Modifiers | Encapsulation, Package-private access, Constructor chaining (`this()`) | Completed |
| **[Lab 2](./Lab2_SinglyLinkedLists)** | Singly Linked Lists | Two-pointer technique (Tortoise & Hare), Middle node detection, Node deletion | Completed |

---

## 🛠️ Module Overview

### [Lab 1: OOP Core Concepts](./Lab1)
* **Game Shop & Inventory:** Implements strict data encapsulation and package-level data hiding (`package-private` audit controls).
* **Playlist Tracker:** Demonstrates multiple overloaded constructors chained via `this(...)` and custom string formatting (`m:ss`).

### [Lab 2: Singly Linked Lists](./Lab2_SinglyLinkedLists)
* **Exercise 1 (Middle Node Finding):** Uses fast and slow pointers (`slow` advances by 1 step, `fast` advances by 2 steps) to locate the median element in $O(n)$ time and $O(1)$ space.
* **Exercise 2 (Delete Middle Node):** Computes list size and adjusts `next` pointer references to sever the middle node, handling single-node edge cases.

---

## 🚀 Compilation & Execution

Navigate to the respective lab directory before compiling:

```bash
# Running Lab 2 - Exercise 1
cd Lab2_SinglyLinkedLists/Exercise_1
javac *.java
java MiddleNodeDemo

# Running Lab 2 - Exercise 2
cd ../Exercise_2
javac *.java
java DeleteMiddleDemo