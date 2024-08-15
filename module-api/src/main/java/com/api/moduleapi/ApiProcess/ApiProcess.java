package com.api.moduleapi.ApiProcess;

import com.core.modulecore.core.CoreCalculate;

public class ApiProcess {
    CoreCalculate coreCalculate = new CoreCalculate();

    public int add(int a, int b) {
        return coreCalculate.add(a, b);
    }
    public int subtract(int a, int b) {
        return coreCalculate.subtract(a, b);
    }
    public int multiply(int a, int b) {return coreCalculate.multiply(a, b);}
}
