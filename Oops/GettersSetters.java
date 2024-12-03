public class GettersSetters {
    public static void main(String[] args) {
        Pen p = new Pen();
        p.setColor("Black");
        p.setTip(5);
        System.out.println(p.getColor());
        p.setColor("Blue");
        System.out.println(p.getTip());
        System.out.println(p.getColor());
    }
}

// this : this Keyword is used to refer to the current object.
class Pen {
    private String color;
    private int tip;
    
    // Getters
    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }
    
    // Setters
    void setColor(String color) {
        this.color = color;
    }

    void setTip(int tip) {
        this.tip = tip;
    }

}