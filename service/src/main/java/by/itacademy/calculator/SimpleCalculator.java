package by.itacademy.calculator;

public enum SimpleCalculator {
    PLUS {
        @Override
        public double process(double i, double j) {
            return i + j;
        }
    },
    MINUS {
        @Override
        public double process(double i, double j) {
            return i - j;
        }
    },

    MULTIPLY {
        @Override
        public double process(double i, double j) {
            return i * j;
        }
    },
    DIVIDE {
        @Override
        public double process(double i, double j) {
            return i / j;
        }
    };

    public abstract double process(double i, double j);
}