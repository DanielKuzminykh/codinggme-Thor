import java.util.Scanner;

public class player
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt();
        int lightY = in.nextInt();
        int initialTx = in.nextInt();
        int initialTy = in.nextInt();
        while(!(initialTy == lightY) & !(initialTx == lightX))
        {
            if ((initialTx > lightX) & (initialTy > lightY))
            {
                initialTx = initialTx-1;
                initialTy = initialTy-1;
                System.out.println(initialTx+initialTy);
            }
            else if ((initialTx < lightX) & (initialTy > lightY))
            {
                initialTx = initialTx+1;
                initialTy = initialTy-1;
                System.out.println(initialTx+initialTy);
            }
            else if ((initialTx > lightX) & (initialTy < lightY))
            {
                initialTx = initialTx-1;
                initialTy = initialTy+1;
                System.out.println(initialTx+initialTy);
            }
            else if ((initialTx < lightX) & (initialTy < lightY))
            {
                initialTx = initialTx+1;
                initialTy = initialTy+1;
                System.out.println(initialTx+initialTy);
            }
        }
        while  (initialTx != lightX)
        {
            if (initialTx < lightX)
            {
                initialTx = initialTx + 1;
                System.out.println(initialTx+initialTy);
            }
            else if (initialTx > lightX)
            {
                initialTx = initialTx - 1;
                System.out.println(initialTx+" "+initialTy);
            }
        }
        while (initialTy != lightY)
        {
            if (initialTy < lightY)
            {
                initialTy = initialTy + 1;
                System.out.println(initialTx+initialTy);
            }
            if (initialTy > lightY)
            {
                initialTy = initialTy - 1;
                System.out.println(initialTx+initialTy);
            }
        }
        int remainingTurns = in.nextInt();


    }
}
