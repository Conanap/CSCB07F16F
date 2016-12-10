// compile CoolException.java first
public class Bugger {
    private String name;
    public Bugger(String name) {
        this.name = name;
    }

    public String printName() throws CoolException{
        if(name != "Cool")
            return this.name;
        else
            throw new CoolException("Wrong name");
    }

    public static void main(String args[]) {
        Bugger b = new Bugger("Cool");
        try {
            System.out.println(b.printName());
        } catch (CoolException e) {
            System.out.println(e);
        } finally {
            System.out.println("Finally!");
        }
        Bugger c = new Bugger("Ew");
        // without a try block compiler will complain
        // but if another method calls it catches it above, it's fine
        // make sure it also throws the exception doe
        // see hi()
        try {
            hi(c);
        }  catch (CoolException e) {
            System.out.println(e);
        } finally {
            System.out.println("Finally!");
        }
    }

    // I don't need to catch it here if I don't want to
    // just make sure it also throws it
    public static void hi(Bugger bug) throws CoolException{
        System.out.println(bug.printName());
    }
}