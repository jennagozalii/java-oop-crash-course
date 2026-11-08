# Episode 8 – Build a Mini AI Chatbot (Capstone)

Everything from the series in one working program: a chatbot called Nova that you can talk to in the terminal.

**What it uses from the series:**
- Classes, objects and constructors (episodes 3–4)
- Encapsulation: private, final fields and a getter (episode 5)
- An interface, so the "AI model" can be swapped (episode 7)

**New in this episode:**
- `Scanner` to read what the user types
- `ArrayList` to keep a chat history that grows
- A `while` loop with `break` to keep the chat going until you say bye

▶️ **Watch:** [YouTube](VIDEO-8-LINK)

## Run it

    java Main.java

Click inside the terminal, type a question, and press Enter. Type `bye` to finish.

## Example conversation

    Nova: Hi! Ask me about Java OOP. Type bye to exit.
    You: What is a class?
    Nova: A class is a blueprint for objects.
    You: explain inheritance
    Nova: Inheritance lets one class reuse another.
    You: bye
    Nova: You asked 2 questions. Happy coding!

## About Nova
Nova is rule-based: she answers using keyword checks, not a real AI service. Because the chatbot depends on the `AIModel` interface, a real AI model could be added later as a new class, without changing the rest of the code.

## Your turn
- Teach Nova two new topics, like encapsulation and polymorphism.
- Add a `history` command that prints all your previous questions.
