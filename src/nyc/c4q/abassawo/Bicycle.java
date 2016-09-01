package nyc.c4q.abassawo;


public class Bicycle implements Vehicle, WheeliaAble {
    double speed;
    int brakeDecelRate;

    public Bicycle(){
        this.speed = 0;
    }


    @Override
    public void applyBrakes() {

        speed -= brakeDecelRate;

    }

    @Override
    public void speedUp(int delta) {

        speed += delta;

    }

    @Override
    public void slowDown(int delta) {

        speed -= delta;

    }

    @Override
    public boolean popAWheelie(int duration) {
        while(duration != 0){
            System.out.println("I'm poppping a wheeeelieeee");
            duration--;
        }
        return true;
    }
}
