package pw.jmct.placeholder;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Widget widget = new Widget();
        System.out.println("1 + 1 = " + widget.add(1,  1));
        System.out.println("Next: " + widget.inc(widget.add(1, 1)));
    }

}
