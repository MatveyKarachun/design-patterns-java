package creationmethod;

class MyClass {
    private final int value;

    public MyClass(int value) {
        this.value = value;
    }

    public MyClass next() {
        return new MyClass(value + 1);
    }
}
