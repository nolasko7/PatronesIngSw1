package Decorator;
// Decorador abstracto
abstract class Extra implements Cafe {
    protected Cafe cafe;
    public Extra(Cafe cafe) { this.cafe = cafe; }
}