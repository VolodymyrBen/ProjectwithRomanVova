public class GitIntro {

    public static void main(String[] args) {
        String original= "Corsan";
        String reversed="";
        for(int i=original.length()-1; i>=0; i--){
            reversed=reversed+original.charAt(i);

        }
        System.out.println(reversed);
        StringBuilder reversed1= new StringBuilder();
        reversed1.append(reversed).reverse();
        System.out.println(reversed1);
        System.out.println(reversed1);
        System.out.println(reversed1);
        System.out.println(reversed1);
       
    }


}
