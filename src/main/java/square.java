class Square {
    String name;
    static int nb = 0;
    Square(){
        if(nb == 0){
            name = "Go";
            nb ++;
        }
        else{
            name = "Square "+ nb;
            nb++;
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
