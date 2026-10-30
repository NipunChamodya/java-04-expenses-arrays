# 📊 Java 04: Dynamic Expense Tracker

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Terminal CLI](https://img.shields.io/badge/Terminal-CLI-4D4D4D?style=for-the-badge&logo=gnu-bash&logoColor=white)

A command-line financial tracking application built in Java. This project introduces dynamic memory allocation, allowing the user to specify exactly how many expenses they want to track before the program collects and processes the data using arrays and iterative loops.

## 🎥 App Demonstration

> **Note to self:** Record a quick screen recording of the terminal running this app and save it as `demo.gif` in this folder, then replace the image link below to show the animation!

![Expense Tracker Demo](https://media.giphy.com/media/v1.Y2lkPTc5MGI3NjExM3Y2Ynh6Z3U4YjF3M203Znh4bHk0bHlyMHF4Z3U1amJ6aGZ1Z2Z2eiZlcD12MV9pbnRlcm5hbF9naWZfYnlfaWQmY3Q9Zw/3oKIPm3Bnvt6Q5Cj2M/giphy.gif)

---

## 🏗️ Application Flow

Below is the logical architecture of how the data moves through the application:

```mermaid
graph TD
    A([Start Application]) --> B[/Ask User: How many expenses?/]
    B --> C[Allocate Array Memory: new double N]
    C --> D{Loop 1: Input}
    D -->|For i = 0 to N| E[/Store amount in expenses i/]
    E --> D
    D -->|Finished| F{Loop 2: Summary}
    F -->|For i = 0 to N| G[Add expenses i to Total]
    G --> F
    F -->|Finished| H[/Print Formatted Summary & Total/]
    H --> I([End Application])
    
    style A fill:#4CAF50,stroke:#388E3C,stroke-width:2px,color:white
    style I fill:#F44336,stroke:#D32F2F,stroke-width:2px,color:white
    style C fill:#2196F3,stroke:#1976D2,stroke-width:2px,color:white