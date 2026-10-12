# Java OOP Core Concepts & Practice Modules

This repository contains practical Java implementations demonstrating core Object-Oriented Programming (OOP) concepts, access level enforcement, class structure patterns, and input validation through two focused mini-projects.

---

## 📁 Modules

### 1. Game Shop & Inventory Management (`game.inventory`)
This module demonstrates Java package architecture, data encapsulation, and the principle of least privilege using access modifiers.

* **Encapsulation & Access Modifiers:**
  * Member variables (`name`, `genre`, `stockCount`, `serialCode`) are declared `private` to restrict unauthorized direct access.
  * The `getSerialCode()` method uses **package-private** (default) access. It is intentionally accessible to `Inventory` (located within the same package) for audit purposes, but remains hidden from external consumers like `GameShop`.
* **Stock Management:**
  * Safe inventory modification via `sell(quantity)` that verifies availability through `isAvailable` before decrementing stock.

### 2. Music Playlist Tracker (`Track` & `PlaylistDemo`)
This module covers class modeling, constructor overloading, constructor chaining, and string formatting.

* **Constructor Chaining (`this(...)`):**
  * Implements 4 distinct constructors (default, title-only, title + artist, and full constructor).
  * Uses `this(...)` delegation to route all instantiations through a single canonical constructor, reducing code redundancy.
* **Defensive Validation:**
  * Validates `durationSeconds` on initialization; negative values are flagged with a warning and defaulted safely to `0`.
* **Custom Formatting & Output:**
  * Converts duration in seconds to formatted `m:ss` strings (`String.format`).
  * Implements `@Override toString()` with conditional formatting for explicit content flags.

---

## 🛠️ Project Structure

```text
.
├── game/
│   └── inventory/
│       ├── Item.java           # Model representing game titles; package-private access rules
│       └── Inventory.java      # Manages item arrays and performs serial code audits
├── GameShop.java               # Main entry point testing the game inventory system
├── Track.java                  # Music track model with constructor chaining & validation
└── PlaylistDemo.java           # Driver program demonstrating constructors and getters