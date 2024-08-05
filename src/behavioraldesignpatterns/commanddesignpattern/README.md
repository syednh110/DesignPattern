**Command** is a behavioral design pattern that turns a request into a stand-alone object that contains all information about the request. This transformation lets you pass requests as a method arguments, delay or queue a request’s execution, and support undoable operations.

**Usage examples:** The Command pattern is pretty common in Java code. Most often it’s used as an alternative for callbacks to parameterizing UI elements with actions. It’s also used for queueing tasks, tracking operations history, etc.

**Here are some examples of Commands in core Java libraries:**

    All implementations of java.lang.Runnable

    All implementations of javax.swing.Action