package src.JavaExamples;

class UtilityClass {
    public static void utilityMethod1() {
        System.out.println("Executing Utility Method 1");
    }

    public static void utilityMethod2() {
        System.out.println("Executing Utility Method 2");
    }

    public static void utilityMethod3() {
        System.out.println("Executing Utility Method 3");
    }

    public static void utilityMethod4() {
        System.out.println("Executing Utility Method 4");
    }

    public static void utilityMethod5() {
        System.out.println("Executing Utility Method 5");
    }

    public static void utilityMethod6() {
        System.out.println("Executing Utility Method 6");
    }
}

class BusinessLogicClass {
    public static void businessMethod1() {
        System.out.println("Executing Business Method 1");
    }

    public static void businessMethod2() {
        System.out.println("Executing Business Method 2");
    }

    public static void businessMethod3() {
        System.out.println("Executing Business Method 3");
    }

    public static void businessMethod4() {
        System.out.println("Executing Business Method 4");
    }

    public static void businessMethod5() {
        System.out.println("Executing Business Method 5");
    }

    public static void businessMethod6() {
        System.out.println("Executing Business Method 6");
    }
}

public class MainClass {
    public static void main(String[] args) {
        performTask1();
        performTask2();
        performTask3();
        performTask4();
        performTask5();
    }

    public static void performTask1() {
        UtilityClass.utilityMethod1();
        UtilityClass.utilityMethod2();
        UtilityClass.utilityMethod3();
        BusinessLogicClass.businessMethod1();
        BusinessLogicClass.businessMethod2();
        BusinessLogicClass.businessMethod3();
    }

    public static void performTask2() {
        UtilityClass.utilityMethod4();
        UtilityClass.utilityMethod5();
        UtilityClass.utilityMethod6();
        BusinessLogicClass.businessMethod4();
        BusinessLogicClass.businessMethod5();
        BusinessLogicClass.businessMethod6();
    }

    public static void performTask3() {
        UtilityClass.utilityMethod1();
        UtilityClass.utilityMethod2();
        UtilityClass.utilityMethod3();
        BusinessLogicClass.businessMethod1();
        BusinessLogicClass.businessMethod2();
        BusinessLogicClass.businessMethod3();
    }

    public static void performTask4() {
        UtilityClass.utilityMethod4();
        UtilityClass.utilityMethod5();
        UtilityClass.utilityMethod6();
        BusinessLogicClass.businessMethod4();
        BusinessLogicClass.businessMethod5();
        BusinessLogicClass.businessMethod6();
    }

    public static void performTask5() {
        UtilityClass.utilityMethod1();
        UtilityClass.utilityMethod2();
        UtilityClass.utilityMethod3();
        BusinessLogicClass.businessMethod1();
        BusinessLogicClass.businessMethod2();
        BusinessLogicClass.businessMethod3();
    }
}
