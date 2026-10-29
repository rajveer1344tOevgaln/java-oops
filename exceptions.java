public class exceptions{
public static void validateUserAge(int UserAge){
if (UserAge < 18){
    throw new IllegalArgumentException("Registration : user must atlest 18 yr old");
}
}
public static void main(String[] args) {
    try { 
        validateUserAge(16);
    }
    catch (IllegalArgumentException ex){
System.out.println("Catch error: "+ ex.getMessage());}
finally{
    System.out.println("Execution pipeline completed saftely");
}
    }
    }
