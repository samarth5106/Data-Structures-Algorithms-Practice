class Tree{
    String profession(int level,int pos){

        int flips=0;

        while(pos>1){

            if(pos%2==0){
                flips++;
            }

            pos=(pos+1)/2;
        }

        if(flips%2==0){
            return "Engineer";
        }

        return "Doctor";
    }
}
