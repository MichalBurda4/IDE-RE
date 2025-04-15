# 🤖 IDE RE – Code and Diagram Generator

A tool that automatically generates **source code** and **UML activity diagrams** based on **use-case scenarios**. The system is designed to support software design and documentation by transforming text scenarios into clear, visual and functional outputs.

## 📌 Features

- Generates UML activity diagrams (`.png`, `.puml`) from textual scenarios
- Produces source code in **Java, C#, C++, Python**
- Uses a custom grammar with ANTLR4 to parse structured input
- Supports tagging of activities and parameters within scenarios
- Saves generated files in structured output folders

## 🛠️ Tech Stack

- **Java 17**
- **ANTLR 4** – parsing use-case scenarios
- **PlantUML** – rendering UML diagrams
- **Graphviz** – diagram visualization
- **Maven** – build and dependency management
- **Git** – version control

## ▶️ How to Run

1. Make sure **Java 17+** is installed
2. Install **Graphviz** from [https://graphviz.gitlab.io/download](https://graphviz.gitlab.io/download)
3. Add Graphviz to your system path (e.g. `C:\Program Files\Graphviz\bin\dot.exe`)
4. Add your `.txt` use-case scenarios to the `scenarios/` folder
5. Build the project with Maven:
   ```bash
   mvn clean install
