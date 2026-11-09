# Java OOP Crash Course: Build an AI Chatbot

This repo has the code from my YouTube series **Java OOP Crash Course**. It takes complete beginners from installing Java to building a small chatbot called Nova, one concept at a time. Every episode adds a new piece to Nova, so you learn object-oriented programming by building something real.

▶️ **YouTube playlist:** [Java OOP Crash Course](https://www.youtube.com/playlist?list=PLJ5rrdqu0XNw)
💼 **LinkedIn:** [linkedin.com/in/jennagozali](https://www.linkedin.com/in/jennagozali)

## The series

| # | Video | What you learn | Code |
|---|-------|----------------|------|
| 1 | [How to Install Java in VS Code](https://youtu.be/Nm2tahz4x3w) | JDK, VS Code setup, your first program | [ep01](./ep01) |
| 2 | [Java Basics](https://youtu.be/o9-EDksBNTg) | Variables, data types, if/else, loops | [ep02](./ep02) |
| 3 | [Classes and Objects](https://youtu.be/kz1W5ooNfQ4) | Blueprints and the things built from them | [ep03](./ep03) |
| 4 | [Constructors and Methods](VIDEO-4-LINK) | Building objects in one line, methods that return values | [ep04](./ep04) |
| 5 | [Encapsulation](VIDEO-5-LINK) | private fields, getters, protecting data | [ep05](./ep05) |
| 6 | [Inheritance](VIDEO-6-LINK) | extends, super, reusing code | [ep06](./ep06) |
| 7 | [Interfaces and Polymorphism](VIDEO-7-LINK) | Contracts, abstraction, one call with many behaviours | [ep07](./ep07) |
| 8 | [Build a Mini AI Chatbot](VIDEO-8-LINK) | Everything together: a chatbot you can talk to | [ep08](./ep08) |

## How to run the code

1. Install a Java JDK (I use Eclipse Temurin 25 from adoptium.net).
2. Install VS Code and the **Extension Pack for Java** by Microsoft.
3. Download this repo: click the green **Code** button, then **Download ZIP**, and unzip it.
4. Open one episode folder in VS Code (for example `ep03`), open `Main.java` and click **Run**.

Or, in a terminal inside the episode folder:

    java Main.java

## About Nova

Nova is a rule-based chatbot: she answers using keyword checks, not a real AI service, so the code runs without any API key. Because she's built around an interface (episode 7), a real AI model could be plugged in later without changing the rest of the code.
