import java.util.Scanner;

public class ClassNameTest {
    public static ClassName className;
    public static final String []validateClass = new String[]{"C0322G"};
    public static final String []invalidateClass = new String[]{"M0318G", "P0323A"};
    public static void main(String[] args) {
          className = new ClassName();
        for (String a: validateClass
             ) {
            boolean isvalid = className.validate(a);
            System.out.println("Class is " + a + "validate "+isvalid);
        }
        for (String a: invalidateClass
        ) {
            boolean isvalid = className.validate(a);
            System.out.println("Class is " + a + "validate "+isvalid);
        }
    }
}
