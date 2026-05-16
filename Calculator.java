class Calculator{

        //add
        public static int add(int i,int j ){
            return i + j;
        }

        
        //multiply
        public static int multiply(int f,int g){
            return f*g;
        }
        //square
        public static int square(int a){
            return a*a;
        }

        public static void main(String[] args) {
            // (3 ∗4+5∗7)^2
            double result1 = square(add(multiply(3,4), multiply(5,7)));
            System.out.println("result1: " + result1);

            // (4+7)^2+(8+3)^2
            double result2 = add(square(add(4,7)), square(add(8,3)));
            System.out.println("result2: " + result2);
        }
    }


