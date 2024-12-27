package j01_start;

/*연산자(Operator)
특정 연산을 나타내는 기호
연산자들의 우선순위가 있음
피연산자(Operand) : 연산의 대상
*/

public class Ex06_Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 사칙연산
		int a=10;//선언문(선언과 동시의 초기화)
		int b=3; //선언문(선언과 동시의 초기화)
		System.out.println("사직연산");
		System.out.println("a+b = " + (a+b));
		System.out.println("a-b = " + (a-b));
		System.out.println("a*b = " + (a*b));
		System.out.println("a/b = " + (a/b));
		System.out.println("a%b = " + (a%b));
		
		/*대입연산
		 a+b의 결과를 a에 넣기
		 a=a+b ==> a += b*/
		System.out.println("대입연산");
		System.out.println("a += b = " +(a+=b));//a=13
		System.out.println("a -= b = " +(a-=b));//a=10
		System.out.println("a *= b = " +(a*=b));//a=30
		System.out.println("a /= b = " +(a/=b));//a=10
		System.out.println("a %= b = " +(a%=b));//a=1
		
		/*단항연산
		 1씩 증.감 (전 or 후) */
		a=10; //값을 할당하는 실행문
		b=10; //값을 할당하는 실행문
		System.out.println("단항연산");
		System.out.println("++a = " +(++a));// 1증가 후 출력
		System.out.println("b++ = " +(b++));// 출력 후 1증가 
		System.out.println("--a = " +(--a));// 1감소 후 출력
		System.out.println("b-- = " +(b--));// 출력 후 1감소
		
		/*관계연산
		  모든 관계연산의 결과는 boolean(true/false)*/
		a=10;
		b=3;
		System.out.println("관계연산");
		System.out.println("a == b = " +(a==b));//false
		System.out.println("a != b = " +(a!=b));//true
		System.out.println("a > b = " +(a>b));	 //true
		System.out.println("a >= b = " +(a>=b));//true
		System.out.println("a < b = " +(a<b));	 //false
		System.out.println("a <= b = " +(a<=b));//false
		
		/*삼항식
		  조건_관계식 참이면 왼쪽 실행 거짓일경우 오른쪽 실행
		  a,b중 큰수 출력*/
		b=100;
		int max = (a>b) ? a : b;
		System.out.println("삼항식");
		System.out.printf("max==b =%d \n", max );
		
		//a,b 두 수의 차이를 출력하시요
		a = 100;
		b = 3;
		max = (a>b) ? (a-b) : (b-a);
		System.out.printf("차이 =%d \n" , max);
		
		//삼항식에는 모든 기본 자료형 적용 가능
		char c1 = (a>b) ? 'T' : 'F';
		System.out.printf("c1 =%s \n" , c1);
		
		char c2 = (a>b) ? '참' : '불';
		System.out.printf("c2 =%s \n" , c2);
		
		String s = (a>b) ? "참" : "거짓";		
		System.out.printf("s =%s \n" , s);
		
		boolean bool = (a>b) ? true : false;
		System.out.printf("bool =%b \n" , bool);
		
		/*논리(집합) 연산
		  &&, ||, !
		  (a 도 짝수) 동시에  &&(b 도 짝수)*/
		a=10;
		b=7;
		bool =(a%2==0) && (b%2==0);
		System.out.printf("논리(집합) 연산 =%b \n" , bool);
	
		bool =(a%2==0) || (b%2==0);
		System.out.printf("논리(집합) 연산 =%b \n" , bool);
		
		//부정
		System.out.printf("논리(집합) 연산 =%b \n" , !bool);
		
		
		
		
		
	}//main

}//class
