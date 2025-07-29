public class ComandLine
{
    public static void main(String[] args) {
        
        if(args.length > 0)
        {
            System.out.println("Arguments: " + args[0] + " " + args[1] +" " + "!");
        }
        else
        {
            System.out.println("No arguments!");
        }



    }
}
