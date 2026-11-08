# Episode 5 – Encapsulation

Keep an object's data safe: the first pillar of object-oriented programming.

**You'll learn:**
- Why public data is risky (anyone can set it to nonsense)
- How `private` fields protect data
- Getters for safe, read-only access
- Putting rules inside methods (no credits, no answer)
- Masking an API key so only the last 4 characters show

▶️ **Watch:** [YouTube](VIDEO-5-LINK)

## Run it

    java Main.java

## Output

    Key: ****abcd
    Answering: What is Java?
    Answering: What is OOP?
    Out of credits! Please top up.
    Credits left: 0

## Try the error
Remove the `//` before `account.credits = 999;`. Java refuses to run, because `credits` is private.

`sk-demo-1234abcd` is a made-up key for the demo. Never put a real API key in your code.

## Your turn
Add a `topUp(int amount)` method that adds credits, but only if the amount is more than zero.
