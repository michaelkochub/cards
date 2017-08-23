A **deck of cards** you can shuffle and deal one at a time, implemented in Java 8. 

Application entry point is in `cards/src/main/java/koch/cards/App.java`.
The output of the app is in `output.txt`.

Everything else is in `cards/src/main/java/koch/cards/{models,helpers}`.

To run, make sure you have maven set up and that `$JAVA_HOME` points to your jdk.

Then you can do

```bash
$ mvn exec:java -Dexec.mainClass="koch.cards.App”
```

or

```bash
$ mvn package
$ java -cp target/cards-0.0.1-SNAPSHOT.jar koch.cards.App
```

Possible Improvements:
- Write test cases
- Use logging library (like `slf4j`)
- Make [Dealer.java][dealer] threadsafe
- Refactor code
- Add exception handling
- Include more features (add a Player class, a Game class, etc)

[dealer]: https://github.com/michaelkochub/cards/blob/master/src/main/java/koch/cards/helpers/Dealer.java
