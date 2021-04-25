/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sacprice;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class SacPrice {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Variáveis
        double vrFinanc, taxa;
        int tempo, lin, col, numparc, i, j;
        double saldoini, juros, amortiz, vrparc, saldofim;
        
        Scanner Entradas = new Scanner(System.in);
        
        System.out.print("Digite o valor do Financiamento: ");
        saldoini = Entradas.nextDouble();
        
        System.out.print("Digite o valor da Taxa: ");
        taxa = Entradas.nextDouble();
        
        System.out.print("O Tempo: ");
        tempo = Entradas.nextInt();
        
        numparc = 0;
        amortiz = saldoini / tempo;
        saldofim = juros = vrparc = 0;
        lin = tempo+1;
    //    col = 6;
        
        
        String[][] Cabecalho = {{"|n.Parc|", "|SaldoIni|", "|Juros|", "|Amort|", "|Vr.Parc|", "|SaldoFim|"}};
        
        col = Cabecalho[0].length;
        
        double[][] calculo = new double[lin][col];
        //String[][] Cabecalho = new String[lin][col];
        
       
        for(i=0; i<lin; i++){
            
            if(i!=0){
            numparc++;
            juros = saldoini * (taxa / 100);
            vrparc = juros + amortiz;
            saldofim = saldoini - amortiz;
            }
            
            for(j=0; j<col;j++){
                switch(j){
                    case 0:
                       if(i==0){
                         System.out.print(Cabecalho[i][j]);  
                       }else{
                        calculo[i][j] = numparc;
                       System.out.print("   |   ");
                        System.out.printf("%.0f",calculo[i][j]);
                       }
                    break;
                    
                    case 1:
                        if(i==0){
                         System.out.print(Cabecalho[i][j]);  
                       }else{
                        calculo[i][j] = saldoini;
                        System.out.print("   |   ");
                        System.out.printf("%.2f",calculo[i][j]);
                        }
                    break;
                    
                    case 2:
                        if(i==0){
                         System.out.print(Cabecalho[i][j]);  
                       }else{
                        calculo[i][j] = juros;
                        System.out.print("   |   ");
                        System.out.printf("%.2f",calculo[i][j]);
                        }
                    break;
                    
                    case 3:
                        
                        if(i==0){
                         System.out.print(Cabecalho[i][j]);  
                       }else{calculo[i][j] = amortiz;
                        System.out.print("   |   ");
                        System.out.printf("%.2f",calculo[i][j]);
                        }
                    break;
                    
                    case 4:
                        if(i==0){
                         System.out.print(Cabecalho[i][j]);  
                       }else{
                        calculo[i][j] = vrparc;
                        System.out.print("   |   ");
                        System.out.printf("%.2f",calculo[i][j]);
                        }
                    break;
                    
                    case 5:
                        if(i==0){
                         System.out.print(Cabecalho[i][j]);  
                       }else{
                        calculo[i][j] = saldofim;
                        System.out.print("   |   ");
                        System.out.printf("%.2f",calculo[i][j]);
                        }
                    break;

                    default:
                        System.out.print("Coluna não encontrada!");
                    break;     
                }
    
            }
            
            if(i!=0){
            saldoini = saldofim;
            }
            System.out.println("");
        }
           
    }
    
}
