import org.junit.Assert
import org.junit.Test

/**
 * A Groovy class that inherits from LibraryTestBase.  When a stub is generated,
 * it will fail to compile
 */
class LibraryTest extends LibraryTestBase {
    @Test
    testFail(){
        Assert.equals(true, false)
    }
}
