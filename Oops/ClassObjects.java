public class ClassObjects {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        Student s1 = new Student();
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tips);
        p1.color = "Yellow";
        System.out.println(p1.color);
        s1.calculatePercentage(51, 68, 89);
        System.out.println(s1.percentage);
    }
    
}

class Pen {
    String color;
    int tips;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tips = newTip;
    }
}

class Student { 
    String name;
    int age;
    float percentage;

    void calculatePercentage(int phy, int chem, int math) {
        percentage = (float)(phy + chem + math) / 3;
    }
}
