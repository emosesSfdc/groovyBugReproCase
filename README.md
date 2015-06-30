# groovyBugReproCase
When Groovy generates a stub of Groovy class that has extends a Java class with a getProperty method, it generates an invalid stub

Clone this and run 

    ./gradlew compileTestGroovy

to see this error:

```
...
:compileTestGroovy
/Users/emoses/dev/gradleBugRepro/build/tmp/compileTestGroovy/groovy-java-stubs/LibraryTest.java:8: error: LibraryTest is not abstract and does not override abstract method getProperty(String) in GroovyObject
public class LibraryTest
       ^
1 error
startup failed:
Compilation failed; see the compiler error output for details.

1 error

:compileTestGroovy FAILED
```
