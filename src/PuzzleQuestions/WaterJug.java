package PuzzleQuestions;

/*
You are at the side of a river.
You are given a m litre jug and a n litre jug where 0 < m < n.
Both the jugs are initially empty.
The jugs don?t have markings to allow measuring smaller quantities.
You have to use the jugs to measure d litres of water where d < n.
Determine the minimum no of operations to be performed to obtain d litres of water in one of jug.
The operations you can perform are:

Empty a Jug
Fill a Jug
Pour water from one jug to the other until one of the jugs is either empty or full.
 */

public class WaterJug {

    int a_max = 2;
    int b_max = 1;
    int a = 0;
    int b = 0;
    int goal = 1;



    void checkGoal() {

        int fin = 0;

        while(fin != 1) {

            if((this.a == this.goal) || (this.b == this.goal)) { fin = 1; }

            if(this.a==0) {
                fillA();

            } else if ((this.a > 0) && (this.b != this.b_max)) {
                transferAtoB();

            } else if ((this.a > 0) && (this.b == this.b_max)) {
                emptyB();

            }





        }
    }


    void fillA() {

        this.a = this.a_max;
        System.out.println("{" + this.a + "," + this.b + "}");

    }

    void fillB() {
        this.b = this.b_max;
        System.out.println("{" + this.a + "," + this.b + "}");
    }

    void transferAtoB() {

        int fin = 0;

        while(fin != 1) {

            this.b += 1;
            this.a -= 1;

            if((this.b == this.b_max) || (this.a == 0)) { fin = 1;}

        }

        System.out.println("{" + this.a + "," + this.b + "}");

    }

    void emptyA() {

        this.a=0;
        System.out.println("{" + this.a + "," + this.b + "}");

    }

    void emptyB() {
        this.b=0;
        System.out.println("{" + this.a + "," + this.b + "}");
    }



}

class Program {

    public static void main(String args[]) {

        WaterJug w = new WaterJug();
        w.checkGoal();




    }

}
