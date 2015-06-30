import org.junit.Test;
import static org.junit.Assert.*;

/**
 * A base Java test class that has a private getProperty method
 * @author emoses, @date 6/30/15 10:46 AM
 */
public class LibraryTestBase {
    private String getProperty(final String foo){
       return foo;
    }

    public String testUtil(){
        return "Util";
    }
}
