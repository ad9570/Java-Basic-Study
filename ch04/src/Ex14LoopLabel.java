class Ex14LoopLabel
{
	public static void main(String[] args)
	{
      // for문에 Loop1이라는 이름을 붙였다.
		Loop1 : for(int i=2;i <=9;i++) {	
				for(int j=1;j <=9;j++) {
					if(j==5)
						break Loop1;	// break 반복문이름;	- 해당 이름의 반복문 전체를 빠져나간다.
//						break;			// break;				- 가장 안쪽의 반복문 하나만 빠져나간다.
//						continue Loop1;
//						continue;
					System.out.println(i+"*"+ j +"="+ i*j);
				} // end of for i
				System.out.println();	// break; 수행 후
		} // end of Loop1
		System.out.println();			// break Loop1; 수행 후
		
		// for문에 Loop2이라는 이름을 붙였다.
//		Loop2 :
			for(int i=2;i <=9;i++) {	
				for(int j=1;j <=9;j++) {
					if(j==5)
//						break Loop2;	// break 반복문이름;	- 해당 이름의 반복문 전체를 빠져나간다.
						break;			// break;				- 가장 안쪽의 반복문 하나만 빠져나간다.
//						continue Loop1;
//						continue;
					System.out.println(i+"*"+ j +"="+ i*j);
				} // end of for i
				System.out.println();	// break; 수행 후
		} // end of Loop1
										// break Loop1; 수행 후
	}
}