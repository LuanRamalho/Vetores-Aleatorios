import java.util.*;

public class Const 
{
    Scanner read = new Scanner(System.in);
    
    int k;
    int a[] = new int[10000000];
    int y=1;
    int r;
    
    void CriarVetor()
    {
        System.out.println("Digite o valor do vetor: ");
        k = read.nextInt();
        
        System.out.println("");
        
        for(r=0; r<k; r = r +1)
        {
            System.out.println("Digite o "+y+"º número de "+k);
            a[r] = read.nextInt();
            y = y + 1;
        }
    }
        
    void ExibirVetor()
    {
        System.out.println("");
        System.out.println("");
        
        y = 1;
        for(r=0; r<k; r = r +1)
        {
            System.out.println(" "+y+"º elemento: "+a[r]);
            y = y + 1;
        }
    }
}
