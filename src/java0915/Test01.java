package java0915;
//���������Ǹ�����p��q�����Լ��
public class Test01 {
public static int gcd(int p, int q){
	if (q == 0 )
		return p;
	int r = p% q ;
	return gcd(q, r);
}
}
