class FactorialException extends Exception {
    int number;

    int getNumber() {
        return this.number;
    }

    FactorialException(String message) {
        super(message);
        int num = 0;
        this.number = num;
    }
}