PROJECT TITLE: Frog
PURPOSE OF PROJECT: 
The class CurrentAccountFrog is implemented as a subclass of
Frog. An instance of CurrentAccountFrog is like an instance of Frog, except that it
has an additional instance variable of type CurrentAccount which is used to store
account information for the frog. 
Instances of CurrentAccountFrog inherit the capability of catching flies from
the Frog class. Every time a CurrentAccountFrog catches a fly, 
in addition to behaving like a frog, it creditd its account’s balance by 100, sets its colour to yellow, jumps once
more and then sets its colour to green.

Instances of CurrentAccountFrog are made capable of paying tax by
having the CurrentAccountFrog class implement an interface called
Taxable which specifies the following methods:
value() – a public method that takes no argument and returns the taxable
value of the receiver as a double.
payTax() – a public method that takes an int argument called taxRate. Its
purpose is to make the receiver pay the relevant tax and return the tax that the
receiver has paid as a double.

Current account frog behaviour responds to a payTax() message by
decrementing its position by the value of the message’s argument and then returns the argument (taxRate) as the message answer. Implement the
payTax() method in the CurrentAccountFrog class.

The project explores subclassing, inheritance, overriding, overloading and interfaces.?

VERSION or DATE: 2018
HOW TO START THIS PROJECT: open in BlueJ
AUTHORS: Irmina Janvier




Test code:
CurrentAccountFrog f;
f = new CurrentAccountFrog("john", "123", 120, 20, "17");
f.catchFly();
f.getAccount().getBalance();
f.getAccount().debit(100);
f.catchFly(3);


CurrentAccountFrog f = new CurrentAccountFrog(); //creates a new CurrentAccountFrog object
CurrentAccount myAccount = f.getAccount(); //assigns CurrentAccount object to CurrentAccountFrog instance variable
f.value(); //returns the current position of the CurrentAccountFrog object.

