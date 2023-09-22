
package calculadora;


public class CalculadoraTestes{

	
	public static void main(String[] args) {
     calculadora calc = new  calculadora();
     subtracao calc1  = new  subtracao();  
     multiplicacao calc2 = new multiplicacao();
     divisao calc3  =  new divisao();
     
     
     //Cenario de teste 1 : Soma de dois valores
     int soma = calc.somar(3,7);
     System.out.println(soma);
	 
	 //Cenario de teste 2 : Soma de dois valores sendo um zero 
	 int soma1 = calc.somar(3,0);
	 System.out.println(soma1);
	 
	 //Cenario de teste 3 :Soma de dois valores sendo que ambos sao zero 
	 int soma2 = calc.somar(0,0);
	 System.out.println(soma2);
	 
	 //Cenario de teste 4 :Soma de dois valores sendo que um e negativo
	 int soma3 = calc.somar(3,-1);
	 System.out.println(soma3);
	 
	 //================================================================= 
	 
	 //Cenario de teste 1 : Subtracao de dois valores
	 int sub = calc1.subitrair(2, 5);  
	 System.out.println(sub);
	 
	 //Cenario de teste 2 : Subtracao de dois valores sendo um zero 
	  int sub1 = calc1.subitrair(2, 0);  
	  System.out.println(sub1);
	 
	 
	 //Cenario de teste 3 :Soma de dois valores sendo que ambos sao zero  
	  int sub2 = calc1.subitrair(0, 0);  
	  System.out.println(sub2);
	 
	 
	 //Cenario de teste 4 :Soma de dois valores sendo que um e negativo
	  int sub3 = calc1.subitrair(8, -10);  
	  System.out.println(sub3);
//======================================================================================
	  
	  //Cenario de teste 1 : Multiplicacao de dois valores
	  int mult = calc2.mult(8, 10);  
	  System.out.println(mult);
	  
	  //Cenario de teste 2 : Multiplicacao de dois valores sendo um zero 
	  int mult1 = calc2.mult(100, 0);  
	  System.out.println(mult1);
	  
	  //Cenario de teste 3 : Multiplicacao de dois valores sendo que ambos sao zero 
	  int mult2 = calc2.mult(0, 0);  
	  System.out.println(mult2);
	   
      //Cenario de teste 4 : Multiplicacao de dois valores sendo que um e negativo 
	  int mult3 = calc2.mult(8, -10);  
	  System.out.println(mult);
	  
//================================================================================
	  //Cenario de teste 1 : divisao de dois valores
	  double div = calc3.div(8, 10);  
	  System.out.println(div);
	  
	  //Cenario de teste 2 : divsao de dois valores sendo um zero 
	  double div1 = calc3.div(3, 0);  
	  System.out.println(div);
	  
	  //Cenario de teste 3 : divisao de dois valores sendo que ambos sao zero
	  double div2 = calc3.div(0, 0);  
	  System.out.println(div);
	  
	  //Cenario de teste 4 : divisao de dois valores sendo que um e negativo 
	  double div3 = calc3.div(4, -1);  
	  System.out.println(div);
	  
	}

	 
    	
	     
	
	
	
	
	
	
	
}
