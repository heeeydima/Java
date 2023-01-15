package LR7;

public class example5 {
    public static void main(String[] args) {
        System.out.println(new SuperClassTest5("test 2"));
        System.out.println(new InheritedClass3("test 2", 'X'));
        System.out.println(new InheritedClass4("test 2", 42));
        var x = (SuperClassTest5) new InheritedClass4("test 2", 42);
        System.out.println(x);
    }
}
class SuperClassTest5 {
    protected String text;

    public SuperClassTest5(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "SuperClassTest5{" + "text='" + text + '\'' + '}';
    }
}

class InheritedClass3 extends SuperClassTest5 {
    protected char character;

    public InheritedClass3(String text, char character) {
        super(text);
        this.character = character;
    }

    @Override
    public String toString() {
        return "InheritedClass3{" + "character=" + character + ", text='" + text + '\'' + '}';
    }
}

class InheritedClass4 extends SuperClassTest5 {
    protected int value;

    public InheritedClass4(String text, int value) {
        super(text);
        this.value = value;
    }

    @Override
    public String toString() {
        return "InheritedClass4{" + "value=" + value + ", text='" + text + '\'' + '}';
    }
}
