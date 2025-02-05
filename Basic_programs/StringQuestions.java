// lowee case

// public class StringQuestions{
//     public static void main(String[]args){
//         String str1 = "ANIROODH";

//         String new_String = str1.toLowerCase();
//         System.out.print(new_String);
//     }
// }



// replacing a string

// public class StringQuestions{
//     public static void main(String[]args){
//         String str = "   Aniroodh    ";
//         String newString = str.replace(" ", "_");
//         System.out.print(newString);
//     }
// }


// string replacing

// public class StringQuestions{
//     public static void main(String[]args){
//         String str = ("Dear name, Thanks a lot");
//         String new_string = str.replace("name", "Aniroodh");
//         System.out.print(new_string);
//     }
// }

// detect doble and triple spaces

public class StringQuestions{
    public static void main(String[]args){
        String str ="My name is    Aniroodh   ";
        if(str.contains(" ")){
            System.out.print("double space present at index: "+str.indexOf(" "));
        }
        else{
            System.out.print("no double or triple spaces");
        }
    }
}
