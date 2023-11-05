package Lab4GritsayKI304;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Calculator {
    public static double calculateExpression(double x) {
        if (Math.sin(x) == 0) {
            throw new IllegalArgumentException("sin(x) не може бути рівним нулю.");
        }

        return Math.cos(x) / Math.sin(x);
    }
}
