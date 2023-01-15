package LR7;

public class example2 {
    public static void main(String[] args) {
        final var superClassObject1 = new SuperClassTest2();
        System.out.println("string: " + superClassObject1.getStr() + ", length: " + superClassObject1.length);
        final var superClassObject2 = new SuperClassTest2("передал в конструктор суперкласса");
        System.out.println("string: " + superClassObject2.getStr() + ", length: " + superClassObject2.length);
        superClassObject2.setStr();
        System.out.println("string: " + superClassObject2.getStr() + ", length: " + superClassObject2.length);
        superClassObject2.setStr("передал в метод суперкласса");
        System.out.println("string: " + superClassObject2.getStr() + ", length: " + superClassObject2.length);

        final var subClassObject1 = new SubClassTest2("передал в конструктор подкласса");
        System.out.println("string: " + subClassObject1.getStr() + ", length: " + subClassObject1.length + ", value: " + subClassObject1.value);
        subClassObject1.setStr();
        System.out.println("string: " + subClassObject1.getStr() + ", length: " + subClassObject1.length + ", value: " + subClassObject1.value);
        subClassObject1.setStr("передал в метод подкласса");
        System.out.println("string: " + subClassObject1.getStr() + ", length: " + subClassObject1.length + ", value: " + subClassObject1.value);
        subClassObject1.setStr("передал в метод подкласса со значением", 42);
        System.out.println("string: " + subClassObject1.getStr() + ", length: " + subClassObject1.length + ", value: " + subClassObject1.value);
    }
}
    class SuperClassTest2 {
        private String str;
        public int length;

        SuperClassTest2(String value) {
            this.str = value;
            this.length = value.length();
        }

        SuperClassTest2() {
            this.str = null;
            this.length = 0;
        }

        public void setStr(String str) {
            this.str = str;
            this.length = str.length();
        }

        public void setStr() {
            this.str = null;
            this.length = 0;
        }

        public String getStr() {
            return str;
        }
    }

    class SubClassTest2 extends SuperClassTest2 {
        public int value;

        SubClassTest2(String strEx) {
            super(strEx);
            this.value = 0;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public void setStr(String str, int value) {
            super.setStr(str);
            this.value = value;
        }

        @Override
        public void setStr(String str) {
            super.setStr(str);
        }

        public void setStr() {
            super.setStr();
        }
    }