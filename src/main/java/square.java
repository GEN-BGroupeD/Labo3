class Square {
    String name;
    Square(int nb){
        if(nb == 0){
            name = "Go";
            nb ++;
        }
        else {
            name = "Square " + nb;
            nb++;
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
