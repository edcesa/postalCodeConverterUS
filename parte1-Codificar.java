/**
 * Eduardo Cesa e Rafael Parra - T1 parte 1
 */

import java.util.Scanner;
public class postalCode
{
    public static void main(String[] args)
    {
        Scanner postalCode1=new Scanner(System.in); //cria objeto scanner
        System.out.println("Digite as intruções:");
        String postalCode =postalCode1.nextLine(); //lê input inicial
        String finalPostal =""; //onde vai ser abrigado a string codificada
        int lastNum=0; // onde último dígito será alocado
        for (int i = 0; i < postalCode.length(); i++){ //soma todos números
            lastNum=lastNum+i;
        }
        lastNum=lastNum%10; //módulo vai dar o último dígito
        postalCode=postalCode+Integer.toString(lastNum); //adiciona último dígito á string do input
        if(postalCode.matches("^[0-9]*$") && postalCode.length() == 6){ //apenas executado se a string tiver 6 caracteres numéricos
        for (int i = 0; i < postalCode.length(); i++){ //loop pra converter cada número individualmente
            if (postalCode.charAt(i)=='0') 
            {
            finalPostal=finalPostal+"||:::"; //soma o código como string no final da string em sí
        }
            else if (postalCode.charAt(i)=='1'){
            finalPostal=finalPostal+":::||";                              
        }
            else if (postalCode.charAt(i)=='2'){
            finalPostal=finalPostal+"::|:|";                           
        }
            else if (postalCode.charAt(i)=='3'){
            finalPostal=finalPostal+"::||:";                             
        }
            else if (postalCode.charAt(i)=='4'){
            finalPostal=finalPostal+":|::|";                            
        }
            else if (postalCode.charAt(i)=='5'){
            finalPostal=finalPostal+":|:|:";                              
        }
            else if (postalCode.charAt(i)=='6'){
            finalPostal=finalPostal+":||::";                               
        }
            else if (postalCode.charAt(i)=='7'){
            finalPostal=finalPostal+"|:::|";                              
        }
            else if (postalCode.charAt(i)=='8'){
            finalPostal=finalPostal+"|::|:";                              
        }
            else if (postalCode.charAt(i)=='9'){
            finalPostal=finalPostal+"|:|::";                              
        }
    }
    System.out.println("O código postal é"+"|"+(finalPostal)+"|"); //será executado caso input esteja no formato correto
}
else{
    System.out.println("O código digitado é inválido"); //será executado caso esteja no formato incorreto
}
}
}