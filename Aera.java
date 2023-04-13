public class Aera {
        int length=4;
        int width=8;
        
        public  void Get(int i,int w)
        {
            length=i;
            width=w;
        }
        public Aera()
        {

            System.out.println("The rectangle is :- "+length*width);
        }

        public static void main(String[]args)
        {
            Aera a = new Aera();
        }
};
