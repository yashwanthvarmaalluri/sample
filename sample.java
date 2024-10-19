// Your First Program

class Computer{
    private int n = 5;
    
    public int getN(){
        return n;
    }
    public void setN(int n) {
        this.n = n;
    }

    public void playMusic(){
        System.out.println("Playing Music");
    }

    public String getMeAPen(int num){
        return "Hell";
    }
}

class HelloWorld {
    public static void main(String[] args) {
        Computer c = new Computer();
        c.playMusic();
        System.out.println(c.getMeAPen(0));
        c.setN(20);
        System.out.println(c.getN());
        System.out.println("next commit");
    }
}