/**
 * Escreva a descrição da classe postalCodeParte1 aqui.
 * 
 * 
 */

import java.util.Scanner;
public class CopyOfpostalCode
{
    public static void main(String[] args)
    {
        while(true){
            Scanner postalCode1=new Scanner(System.in);
            System.out.println("Digite as intruções:");
            String CopyOfpostalCode =postalCode1.nextLine(); //lê input inicial
            String finalPostal ="|";
            if(CopyOfpostalCode.matches("^[0-9]*$") && CopyOfpostalCode.length() == 5){    
            for (int i = 0; i < CopyOfpostalCode.length(); i++){
                    if (CopyOfpostalCode.charAt(i)=='0')
                    {
                    finalPostal=finalPostal+"||:::";
                }
                    else if (CopyOfpostalCode.charAt(i)=='1'){
                    finalPostal=finalPostal+":::||";                              
                }
                    else if (CopyOfpostalCode.charAt(i)=='2'){
                    finalPostal=finalPostal+"::|:|";                           
                }
                    else if (CopyOfpostalCode.charAt(i)=='3'){
                    finalPostal=finalPostal+"::||:";                             
                }
                    else if (CopyOfpostalCode.charAt(i)=='4'){
                    finalPostal=finalPostal+":|::|";                            
                }
                    else if (CopyOfpostalCode.charAt(i)=='5'){
                    finalPostal=finalPostal+":|:|:";                              
                }
                    else if (CopyOfpostalCode.charAt(i)=='6'){
                    finalPostal=finalPostal+":||::";                               
                }
                    else if (CopyOfpostalCode.charAt(i)=='7'){
                    finalPostal=finalPostal+"|:::|";                              
                }
                    else if (CopyOfpostalCode.charAt(i)=='8'){
                    finalPostal=finalPostal+"|::|:";                              
                }
                else if (CopyOfpostalCode.charAt(i)=='9'){
                finalPostal=finalPostal+"|:|::";                              
            }
            else{
                system.out.println("o código digitado é inválido")
                continue
            }
        }
}



}
System.out.println("O código postal é:"+(finalPostal)+"|");
}
}