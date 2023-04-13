public class Student{
        int roll;
        String name;


        Student(int r , String n){
                roll=r;
                name=n;
        }
        void display()
        {
                System.out.println("roll :- "+roll);
                System.out.println("Name :- "+name);
        }
        public static void main(String[]args)
        {
                Student s = new Student(1,"jhgd");

                s.display();
        }
};