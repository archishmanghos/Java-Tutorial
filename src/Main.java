import java.util.*;

class Outer {
    void show() {
        System.out.println("Inside Outer");
    }

    class Inner {
        void show() {
            System.out.println("Inside Inner");
        }
    }
}

class OuterStatic {
    void show() {
        System.out.println("Inside Static Outer");
    }

    static class InnerStatic {
        void show() {
            System.out.println("Inside Static Inner");
        }
    }
}

class VariableArguments {
    void add(int... n) {
        int answer = 0;
        for (int i : n) answer += i;
        System.out.println(answer);
    }
}

class SuperA {
    SuperA() {
        System.out.println("In Super A");
    }

    SuperA(int x) {
        System.out.println("In Super A int");
    }
}

class SuperB extends SuperA {
    SuperB() {
        super(5);
        System.out.println("In Super B");
    }

    SuperB(int x) {
        System.out.println("In Super B int");
    }
}

class OverrideA {
    public void show() {
        System.out.println("In Override A");
    }
}

class OverrideB extends OverrideA {
    @Override
    public void show() {
        super.show();
        System.out.println("In Override B");
    }
}

class DynamicA {
    public void show() {
        System.out.println("in Dynamic A");
    }
}

class DynamicB extends DynamicA {
    public void show() {
        System.out.println("in Dynamic B");
    }

    public void config() {
        System.out.println("in Config B");
    }
}

class DynamicC extends DynamicA {
    public void show() {
        System.out.println("in Dynamic C");
    }
}

class GetA {
    private int eid;
    private String ename;

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }
} // Getters and Setters

abstract class Human {
    public abstract void eat();

    public abstract void walk();
} // Abstract Class

class Man extends Human {
    public void eat() {
        System.out.println("Man is Eating");
    }

    public void walk() {
        System.out.println("Man is Walking");
    }
} // Concrete Class

class PrintNumber {
    void show(Integer i) {
        System.out.println("Integer = " + i);
    }

    void show(Double i) {
        System.out.println("Double = " + i);
    }

    // Instead of creating diff methods for diff data-types,
    // we can instead define a single method using the abstract super class.

    void show(Number i) {
        System.out.println("Number = " + i);
    }
} // Example to show use of Abstract Class

final class NoExtend {
    final int x = 10;

    NoExtend(int x) {
//        this.x = x; // this cannot be done since x is final
    }
} // Final Class and Final Variable Demonstration

/*class A extends NoExtend {

}*/ // Cannot extend since NoExtend is a final Class

class NoOverride {
    final public void show() {
        System.out.println("Inside Show");
    }
} // Final Method Demonstration

class NoOverrideDuplicate extends NoOverride {
    /*public void show(){
        System.out.println("Inside My Show");
    }*/ // Cannot Override since show is final in superclass
} // Final Method Demonstration

interface Writer {
    void write();
}

class Pen implements Writer {
    public void write() {
        System.out.println("Pen Is Writing");
    }
}

class Pencil implements Writer {
    public void write() {
        System.out.println("Pencil is Writing");
    }
} // Interface Demonstration

class Anonymous {
    public void show() {
        System.out.println("Inside Class");
    }
} // Anonymous Class Demonstration

interface Anonymouss {
    void show();
} // Anonymous Interface Demonstration

@FunctionalInterface
interface DefaultMethods {
    void doSomething();

    default void show() {
        System.out.println("Inside Interface with Default Method");
    }
} // New Interface Demonstration where method definition is possible

class A implements DefaultMethods {
    @Override
    public void doSomething() {
        System.out.println("Doing Something");
    }

    @Override
    public void show() {
        System.out.println("Overriding Interface Show");
    }
} // Method overriding over Default methods of interface

interface X {
    default void show() {
        System.out.println("In X");
    }
}

interface Y {
    default void show() {
        System.out.println("In Y");
    }
}

class B implements X, Y {
    public void show() {
        X.super.show();
    }
} // Ambiguity Resolution in interface Demonstration

interface Ab {
    int x = 10;

    static void show() {
        System.out.println("Inside Static Method of Interface");
    }
} // Static method in interface Demonstration

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
} // User Defined Exception

class Hi extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

class Hello extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
} // Multi-Threading Demonstration

class Increment {
    int count;

    public synchronized void increase() {
        count++;
    }
} // Synchronization Demonstration

class Studs implements Comparable<Studs> {
    int rollno;
    String name;
    int marks;

    public Studs(int rollno, String name, int marks) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Studs{" + "rollno=" + rollno + ", name='" + name + '\'' + ", marks=" + marks + '}';
    }

    public int compareTo(Studs s) {
        return marks > s.marks ? 1 : -1;
    }
} // Comparable interface Demonstration

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello World");
        int a = 10_000_0, b = 9;
        System.out.println(a + b);
        int x = 9, y = 2;
        System.out.println(x / y);

        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
        for (char i = 65; i <= 67; i++) {
            for (char j = 65; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                if (i == 1 || i == 4) System.out.print('$');
                else if (j == 1 || j == 4) System.out.print('$');
                else System.out.print(' ');
            }
            System.out.println();
        }
        System.out.println();


        Outer obj1 = new Outer();
        obj1.show();

        Outer.Inner obj2 = obj1.new Inner();
        obj2.show();

        OuterStatic obj3 = new OuterStatic();
        obj3.show();

        OuterStatic.InnerStatic obj4 = new OuterStatic.InnerStatic();
        obj4.show();

        VariableArguments vaObj = new VariableArguments();
        vaObj.add(2, 3, 5, 7, 8);

        SuperB supObj1 = new SuperB();
        SuperB supObj2 = new SuperB(5);

        OverrideB ovObj1 = new OverrideB();
        ovObj1.show();

        DynamicA dynaobj1 = new DynamicB();
        dynaobj1.show();
//        dynaobj1.config(); Doesn't Work as reference is of DynamicA, hence only methods of A which are in B are accessible

        dynaobj1 = new DynamicC(); // Dynamic Method Dispatch
        dynaobj1.show();

        DynamicB dynaobj2 = new DynamicB();
        dynaobj2.show();
//        dynaobj2=new DynamicC(); Doesn't work

        GetA getObj = new GetA();
        getObj.setEid(6);
        System.out.println(getObj.getEid());
        getObj.setEname("Archi");
        System.out.println(getObj.getEname());


        int wrapperI = 5; // primitive datatype
        Integer ii = new Integer(5); // boxing or wrapping
        int unwrapI = ii.intValue(); // unboxing or unwrapping

        Integer iii = wrapperI; // auto boxing or auto wrapping
        int unwrapII = iii; // auto unboxing or auto unwrapping

        System.out.println(unwrapI);
        System.out.println(unwrapII);

        String str = "1500";
        int strx = Integer.parseInt(str);
        System.out.println(strx);

        Human humObj = new Man();
        humObj.walk();

        PrintNumber printObj = new PrintNumber();
        printObj.show(4);
        printObj.show(5.6);
        printObj.show(4.4f);

        Writer writeObj = new Pen();
        writeObj.write();
        writeObj = new Pencil();
        writeObj.write();

        Anonymous anonObj = new Anonymous();
        anonObj.show();
        anonObj = new Anonymous() {
            public void show() {
                System.out.println("Inside Anonymous Class");
            }
        };
        anonObj.show();


        Anonymouss anoObj = new Anonymouss() {
            public void show() {
                System.out.println("Inside Anonymous Interface");
            }
        };
        anoObj.show();

        Anonymouss anoObj2 = () -> {
            System.out.println("Inside Lambda Expression");
        };
        anoObj2.show();


        DefaultMethods defObj1 = new A();
        defObj1.doSomething();
        defObj1.show();


        B bobj = new B();
        bobj.show();

        Ab.show();

        // Exception Handling
        try {
            int i = 7, j = 2;
            System.out.println("Answer is " + (i / j));
        } catch (Exception e) {
            System.out.println("Error");
        } finally {
            System.out.println("Process Ends");
        }

        // User defined Exception Handling
        int i = 7, j = 2;
        try {
            if (j == 2) throw new MyException("J's value is 2");
            System.out.println("Everything is fine!");
        } catch (MyException e) {
            System.out.println("Error : " + e.getMessage());
        } finally {
            System.out.println("Final");
        }

        // Scanner class to take input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("N is : " + n);
        sc.close();


        // Multi Threading using Thread Class
        Hi hiobj = new Hi();
        Hello helloobj = new Hello();

        hiobj.start();
        try {
            Thread.sleep(10);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        helloobj.start();


        // Multi Threading using Runnable Interface
        Thread t1 = new Thread(() -> {
            for (int k = 1; k <= 5; k++) {
                System.out.println("Hey Man");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for (int k = 1; k <= 5; k++) {
                System.out.println("Hey You");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        });

        // Setting name and priority of Threads and also getting them
        System.out.println();
        System.out.println(t1.getName());
        System.out.println(t2.getName());
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println();

        t1.setName("Chiphali Thread");
        t2.setName("Shoebhum Thread");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        System.out.println();
        System.out.println(t1.getName());
        System.out.println(t2.getName());
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println();

        t1.start();
        try {
            Thread.sleep(10);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        t2.start();

        System.out.println(t1.isAlive()); // Check if thread is still alive

        t1.join();
        t2.join(); // Let the threads join and then main thread will execute
        System.out.println(t1.isAlive());
        System.out.println("Main Thread");


        // Use of Synchronized keyword to make methods Thread-safe
        Increment inc = new Increment();
        Thread t3 = new Thread(() -> {
            for (int k = 1; k <= 1000; k++) {
                inc.increase();
            }
        });

        Thread t4 = new Thread(() -> {
            for (int k = 1; k <= 1000; k++) {
                inc.increase();
            }
        });

        t3.start();
        t4.start();

        t3.join();
        t4.join();
        System.out.println("Count : " + inc.count);


        // Use of Collection API
        System.out.println();
        Collection values = new ArrayList<>();
        values.add(2);
        values.add(7);
        values.add(10);

        Iterator it = values.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        System.out.println();
        for (Object value : values) {
            System.out.print(value + " ");
        }
        System.out.println();


        List<Integer> value = new ArrayList<>();
        value.add(2);
        value.add(7);
        value.add(10);
        for (int k = 0; k < value.size(); k++) {
            System.out.print(value.get(k) + " ");
        }
        System.out.println();
        value.add(1, 8);
        for (Integer v : value) {
            System.out.print(v + " ");
        }
        System.out.println();
        Collections.sort(value);
        for (Integer v : value) {
            System.out.print(v + " ");
        }
        System.out.println();
        Collections.reverse(value);
        for (Integer v : value) {
            System.out.print(v + " ");
        }
        System.out.println();
        Collections.shuffle(value);
        for (Integer v : value) {
            System.out.print(v + " ");
        }
        System.out.println();

        Comparator<Integer> c = new Comparator<>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return (o1 % 10 > o2 % 10 ? 1 : -1);
            }
        };
        Collections.sort(value, c);
        Collections.sort(value, (o1, o2) -> (o1 % 10 > o2 % 10 ? 1 : -1));
        for (Integer v : value) {
            System.out.print(v + " ");
        }
        System.out.println();

        List<Studs> st = new ArrayList<>();
        st.add(new Studs(1, "Archi", 100));
        st.add(new Studs(2, "Rivu", 12));
        st.add(new Studs(3, "Semicolonised", 82));
        Collections.sort(st);

        for (Studs s : st) {
            System.out.println(s.toString());
        }


        // UnOrdered Set or HashSet
        Set<Integer> set = new HashSet<>();
        set.add(8);
        set.add(5);
        set.add(13);
        for (int val : set) {
            System.out.println("Value = " + val);
        }
        System.out.println();

        // Ordered Set or TreeSet
        Set<Integer> set1 = new TreeSet<>();
        set1.add(8);
        set1.add(5);
        set1.add(13);
        for (int val : set1) {
            System.out.println("Value = " + val);
        }
        System.out.println();


        // UnOrdered Map or HashMap
        Map<String, Integer> mp = new HashMap<>();
        mp.put("Archi", 100);
        mp.put("Rivu", 52);
        mp.put("Semicolonised", 82);
        for (String key : mp.keySet()) {
            System.out.println(key + " : " + mp.get(key));
        }
        System.out.println();


        // Ordered Map or TreeMap
        Map<String, Integer> mp1 = new TreeMap<>();
        mp1.put("Rivu", 52);
        mp1.put("Archi", 100);
        mp1.put("Semicolonised", 82);
        for (String key : mp1.keySet()) {
            System.out.println(key + " : " + mp1.get(key));
        }
        System.out.println();
    }
}